package com.github.coderepositories.jcommons.tools.mgb;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;

import com.github.coderepositories.jcommons.core.S;
import com.github.coderepositories.jcommons.tools.mgb.config.Context;
import com.github.coderepositories.jcommons.tools.mgb.config.JavaClientGenerator;
import com.github.coderepositories.jcommons.tools.mgb.config.JavaModelGenerator;
import com.github.coderepositories.jcommons.tools.mgb.config.JavaTypeResolver;
import com.github.coderepositories.jcommons.tools.mgb.config.JdbcConnection;
import com.github.coderepositories.jcommons.tools.mgb.config.MybatisGeneratorConfiguration;
import com.github.coderepositories.jcommons.tools.mgb.config.SqlMapGenerator;
import com.github.coderepositories.jcommons.tools.mgb.config.custom.CustomCode;
import com.github.coderepositories.jcommons.tools.mgb.config.custom.CustomConfiguration;
import com.github.coderepositories.jcommons.tools.mgb.config.custom.CustomTableConfig;
import com.github.coderepositories.jcommons.tools.mgb.config.table.Table;
import com.github.coderepositories.jcommons.tools.mgb.dbinfo.DbInfos;
import com.github.coderepositories.jcommons.tools.mgb.dbinfo.TableMetadata;
import com.google.common.io.Files;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@SuppressWarnings("all")
public class MBGTemplate {
	// 当前工作目录
	static final String BASE_DIR = System.getProperty("user.dir");

	// 编译目录
	static final String CLASSES = ClassLoader.getSystemResource("").getFile();

	// 默认字符
	static final Charset DEFAULT_CHARSET = Charset.defaultCharset();

	// 获取配置信息
	public static ConfigInfo loadConfig(String mybatisGeneratorConfig, String customConfig)
			throws SQLException, IOException {
		File mbgConfigFile = new File(CLASSES, mybatisGeneratorConfig);
		File customConfigFile = new File(CLASSES, customConfig);

		MybatisGeneratorConfiguration mbgCoinfgBean = new MybatisGeneratorConfiguration();
		CustomConfiguration customConfigBean = new CustomConfiguration();

		readConfig(mbgConfigFile, mbgCoinfgBean);
		readConfig(customConfigFile, customConfigBean);

		ConfigInfo configInfo = new ConfigInfo();
		configInfo.setMbgConfig(mbgCoinfgBean);
		configInfo.setCustomConfig(customConfigBean);

		// getCustomTables(configInfo);
		// mergeConfig(configInfo);
		getCustomCodes(configInfo);
		return configInfo;
	}

	/**
	 * 获取自定义表
	 * 
	 * @param configInfo
	 * @return
	 * @throws SQLException
	 */
	private static List<Table> getCustomTables(ConfigInfo configInfo) throws SQLException {
		MybatisGeneratorConfiguration mbgConfig = configInfo.getMbgConfig();
		CustomConfiguration customConfig = configInfo.getCustomConfig();

		// JDBC配置信息
		JdbcConnection jdbc = mbgConfig.getContext().getJdbcConnection();
		DbUtils.loadDriver(jdbc.getDriverClass());
		String url = jdbc.getConnectionURL();
		Connection conn = getConnection(url, jdbc.getUserId(), jdbc.getPassword());
		// 从Connection地址截取数据库名称
		String dbName = url.substring(url.lastIndexOf("/") + 1);

		// 获取数据库所有表信息
		List<TableMetadata> tables = DbInfos.getTables(conn, dbName);

		// 自定义Table公共配置信息
		CustomTableConfig tableConfig = customConfig.getTableConfig();
		String propsInfo = tableConfig.getPropsInfo();
		String domainObjectNameSuffix = tableConfig.getDomainObjectNameSuffix();

		StringBuilder tableTemplate = new StringBuilder();
		String tableName = null;
		String className = null;

		for (TableMetadata tableMetadata : tables) {
			tableName = tableMetadata.getTableName();
			className = tableNameToClassName(tableName).concat(domainObjectNameSuffix);
			tableTemplate.append(
					"<table tableName=\"" + tableName + "\" domainObjectName=\"" + className + "\" " + propsInfo + "/>")
					.append(System.lineSeparator());
		}

		Class<Context> cls = Context.class;
		XStreamAlias alias = cls.getAnnotation(XStreamAlias.class);
		String aliasValue = alias.value();

		String tableXml = tableTemplate.toString();
		tableXml = "<" + aliasValue + ">" + tableXml + "</" + aliasValue + ">";

		XStream xstream = new XStream();
		xstream.autodetectAnnotations(true);
		xstream.alias(aliasValue, cls);
		Context context = (Context) xstream.fromXML(tableXml);
		return context.getTables();
	}

	/**
	 * 获取自定义代码
	 * 
	 * @param configInfo
	 * @return
	 * @throws SQLException
	 * @throws IOException
	 */
	private static String getCustomCodes(ConfigInfo configInfo) throws SQLException, IOException {
		MybatisGeneratorConfiguration mbgConfig = configInfo.getMbgConfig();
		// 获取扫描目录 targetProject / targetPackage
		Context context = mbgConfig.getContext();

		JavaModelGenerator javaModelGenerator = context.getJavaModelGenerator();
		String javaModelTargetProject = javaModelGenerator.getTargetProject();
		String javaModelTargetPackage = javaModelGenerator.getTargetPackage();
		File javaModelTargetPath = assembleTargetPath(javaModelTargetProject, javaModelTargetPackage);

		SqlMapGenerator sqlMapGenerator = context.getSqlMapGenerator();
		String sqlMapTargetProject = sqlMapGenerator.getTargetProject();
		String sqlMapTargetPackage = sqlMapGenerator.getTargetPackage();
		File sqlMapTargetPath = assembleTargetPath(sqlMapTargetProject, sqlMapTargetPackage);

		JavaClientGenerator javaClientGenerator = context.getJavaClientGenerator();
		String javaClientTargetProject = javaClientGenerator.getTargetProject();
		String javaClientTargetPackage = javaClientGenerator.getTargetPackage();
		File javaClientTargetPath = assembleTargetPath(javaClientTargetProject, javaClientTargetPackage);

		File[] javaModelFiles = javaModelTargetPath.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});

		File[] sqlMapFiles = sqlMapTargetPath.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith("Mapper.xml");
			}
		});

		File[] javaClientFiles = javaClientTargetPath.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith("Mapper.java");
			}
		});

		List<File> matchedFiles = new ArrayList<>();
		matchedFiles.addAll(Arrays.asList(javaModelFiles));
		matchedFiles.addAll(Arrays.asList(sqlMapFiles));
		matchedFiles.addAll(Arrays.asList(javaClientFiles));

		CustomConfiguration customConfig = configInfo.getCustomConfig();
		CustomCode customCode = customConfig.getCustomCode();
		String startLimit = customCode.getStartLimit();
		String endLimit = customCode.getEndLimit();

		for (File file : matchedFiles) {
			String customCodeContent = findCustomCodeContent(file, startLimit, endLimit);
			if (!customCodeContent.isEmpty()) {
				System.out.println(customCodeContent);
			}
		}

		return null;
	}

	// 合并配置文件
	private static MybatisGeneratorConfiguration mergeConfig(ConfigInfo configInfo) throws SQLException {
		MybatisGeneratorConfiguration mbgConfig = configInfo.getMbgConfig();
		Context context = mbgConfig.getContext();
		List<Table> customTables = getCustomTables(configInfo);
		context.getTables().addAll(customTables);
		return mbgConfig;
		// XStream xstream = new XStream();
		// xstream.autodetectAnnotations(true);
		// xstream.alias(mbgConfig.getClass().getAnnotation(XStreamAlias.class).value(),
		// mbgConfig.getClass());
		//
		// String xml = xstream.toXML(mbgConfig);
	}

	/**
	 * 获取自定义代码内容
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	private static String findCustomCodeContent(File file, String startLimit, String endLimit) throws IOException {
		List<String> lines = Files.readLines(file, DEFAULT_CHARSET);
		StringBuilder content = new StringBuilder();
		boolean flag = false;
		for (String line : lines) {
			if (line.matches(startLimit)) {
				flag = true;
			}
			if (flag) {
				content.append(line).append(System.lineSeparator());
			}
			if (line.matches(endLimit)) {
				flag = false;
			}
		}
		return content.toString();
	}

	/**
	 * 组装目标路径
	 * 
	 * @param targetProject
	 * @param targetPackage
	 * @return
	 */
	private static File assembleTargetPath(String targetProject, String targetPackage) {
		String targetPackagePath = targetPackage.replace(".", "/");

		if ("MAVEN".equalsIgnoreCase(targetProject)) {
			return new File(BASE_DIR, "src/main/java/" + targetPackagePath);
		}

		return new File(targetProject, targetPackagePath);
	}

	/**
	 * 数据库表名转换为Java类名
	 * 
	 * @param tableName
	 * @return
	 */
	private static String tableNameToClassName(String tableName) {
		return formatToHumpNamed(tableName, "_", true);
	}

	/**
	 * 格式化为驼峰命名
	 * 
	 * @param str
	 *            需要格式化话的字符串
	 * @param separator
	 *            字符串分隔符
	 * @return
	 */
	public static String formatToHumpNamed(String str, String separator, boolean letterUpper) {
		StringBuilder sb = new StringBuilder();
		String[] items = str.split(separator);
		for (int i = 0; i < items.length; i++) {
			sb.append(firstLetterUpper(items[i].toLowerCase()));
		}
		String returnValue = sb.toString();
		return letterUpper ? firstLetterUpper(returnValue) : firstLetterLower(returnValue);
	}

	/**
	 * 首字母大写
	 * 
	 * @param str
	 * @return
	 */
	public static String firstLetterUpper(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

	/**
	 * 首字母小写
	 * 
	 * @param str
	 * @return
	 */
	public static String firstLetterLower(String str) {
		return str.substring(0, 1).toLowerCase() + str.substring(1);
	}

	/**
	 * 生成一个文件名称
	 * 
	 * @return
	 */
	private static String generateFileName() {
		return S.dateFormat(new Date(), "yyyyMMddHHmmss");
	}

	/**
	 * 读取配置信息
	 * 
	 * @param config
	 * @param obj
	 */
	private static void readConfig(File config, Object obj) {
		XStream xstream = new XStream();
		xstream.autodetectAnnotations(true);

		Class<? extends Object> objClass = obj.getClass();
		XStreamAlias alias = objClass.getAnnotation(XStreamAlias.class);
		String rootAlias = alias.value();
		xstream.alias(rootAlias, objClass);

		xstream.fromXML(config, obj);
	}

	/**
	 * 写入配置信息
	 * 
	 * @param config
	 * @param obj
	 */
	private static void writeConfig(File config, Object obj) {
		XStream xstream = new XStream();
		xstream.autodetectAnnotations(true);

		Class<? extends Object> objClass = obj.getClass();
		XStreamAlias alias = objClass.getAnnotation(XStreamAlias.class);
		String rootAlias = alias.value();
		xstream.alias(rootAlias, objClass);
		FileWriter writer = null;
		try {
			writer = new FileWriter(config);
			xstream.toXML(obj, writer);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (S.notNull(writer)) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static Connection getConnection(String url, String user, String password) {
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		try {
			loadConfig("mybatisGeneratorConfig.xml", "customConfig.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
