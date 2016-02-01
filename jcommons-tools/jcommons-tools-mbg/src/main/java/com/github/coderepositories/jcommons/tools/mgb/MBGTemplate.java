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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.dbutils.DbUtils;

import com.github.coderepositories.jcommons.core.S;
import com.github.coderepositories.jcommons.tools.mgb.config.Context;
import com.github.coderepositories.jcommons.tools.mgb.config.JavaClientGenerator;
import com.github.coderepositories.jcommons.tools.mgb.config.JavaModelGenerator;
import com.github.coderepositories.jcommons.tools.mgb.config.JavaTypeResolver;
import com.github.coderepositories.jcommons.tools.mgb.config.JdbcConnection;
import com.github.coderepositories.jcommons.tools.mgb.config.MBGConfiguration;
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

	static final String MBG_CONFIG_FILE = "generatorConfig.xml";

	static final String CUSTOM_CONFIG_FILE = "customConfig.xml";
	
	// 自定义内容记录文件中，文件行的标识
	static final String CUSTOM_CONTENT_FILE_LINE_FLAG = "#";

	// 默认字符
	static final Charset DEFAULT_CHARSET = Charset.defaultCharset();

	// 换行符
	static final String LINE_SEPARATOR = System.lineSeparator();

	public static void start() {
		try {
			Config config = loadConfig(MBG_CONFIG_FILE, CUSTOM_CONFIG_FILE);
			
			File customContent = saveCustomContent(config);
			
			MBGConfiguration mergeConfig = mergeConfig(config);
			
			generateCode(mergeConfig, customContent);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 加载配置信息
	 * 
	 * @param mbgConfig
	 * @param customConfig
	 * @return
	 * @throws SQLException
	 * @throws IOException
	 */
	public static Config loadConfig(String mbgConfig, String customConfig) throws SQLException, IOException {
		File mbgConfigFile = new File(CLASSES, mbgConfig);
		File customConfigFile = new File(CLASSES, customConfig);

		MBGConfiguration mbgCoinfgBean = new MBGConfiguration();
		CustomConfiguration customConfigBean = new CustomConfiguration();

		readConfig(mbgConfigFile, mbgCoinfgBean);
		readConfig(customConfigFile, customConfigBean);

		Config config = new Config();
		config.setMbgConfig(mbgCoinfgBean);
		config.setCustomConfig(customConfigBean);

		return config;
	}

	// 保存自定义内容
	private static File saveCustomContent(Config config) throws SQLException, IOException {
		String output = config.getCustomConfig().getCustomCode().getOutput();
		String customContent = getCustomContent(config);
		File file = new File(output, generateFileName());
		Files.write(customContent, file, DEFAULT_CHARSET);
		return file;
	}

	// 合并配置文件
	private static MBGConfiguration mergeConfig(Config config) throws SQLException {
		MBGConfiguration mbgConfig = config.getMbgConfig();
		Context context = mbgConfig.getContext();
		
		List<Table> tables = context.getTables();
		if(S.isEmpty(tables)){
			tables = new ArrayList<>();
		}
		
		List<Table> customTables = getCustomTables(config);
		if(S.notEmpty(customTables)){
			tables.addAll(customTables);
		}
		
		context.setTables(tables);
		
		return mbgConfig;
	}

	// 生成代码
	private static void generateCode(MBGConfiguration mbgConfig, File customContent) throws IOException {
		Context context = mbgConfig.getContext();
		List<Table> tables = context.getTables();
		
		// TODO 备份需要更新的文件
		
		// 每个table的对应的entity name
		List<String> entityNames = new ArrayList<>();
		for (Table table : tables) {
			entityNames.add(table.getDomainObjectName());
		}
		
		// 自动生成的文件
		Map<String, File> fileNameWithFileMap = new LinkedHashMap<>();
		List<File> generatorFiles = findGeneratorFiles(mbgConfig);
		for (File file : generatorFiles) {
			fileNameWithFileMap.put(file.getName(), file);
		}
		
		// 删除需要更新的文件----------------------------
		Set<String> fileNames = fileNameWithFileMap.keySet();
		String entityFileName = null;
		String mapperFileName = null;
		String mapperXmlFileName = null;
		for (String entityName : entityNames) {
			entityFileName = entityName.concat(".java");
			mapperFileName = entityName.concat("Mapper.java");
			mapperXmlFileName = entityName.concat("Mapper.xml");
			
			if(fileNames.contains(entityFileName)){
				fileNameWithFileMap.get(entityFileName).delete();
			}
			if(fileNames.contains(mapperFileName)){
				fileNameWithFileMap.get(mapperFileName).delete();
			}
			if(fileNames.contains(mapperXmlFileName)){
				fileNameWithFileMap.get(mapperXmlFileName).delete();
			}
		}
		
		// 生成文件 ----------------------------------
		File mergedMbgConfigFile = new File(BASE_DIR, generateFileName()+".xml");
		
		// a.生成合并的 mbgConfig.xml
		writeConfig(mergedMbgConfigFile, mbgConfig);
		
		String mbgConfigContent = Files.toString(mergedMbgConfigFile, DEFAULT_CHARSET);
		String mbgConfigDTD = getMBGConfigDTD();
		Files.write(mbgConfigDTD.concat(mbgConfigContent), mergedMbgConfigFile, DEFAULT_CHARSET);
		
		// b.执行maven命令调用MBG插件生成代码
		File pomFile = new File(BASE_DIR, "pom.xml");
		S.execCmd(Arrays.asList("mvn -f " + pomFile.getAbsolutePath()
				+ " -Dmybatis.generator.configurationFile="+mergedMbgConfigFile.getAbsolutePath()+" mybatis-generator:generate"));
		
		// c.删除合并的 mbgConfig.xml
		 mergedMbgConfigFile.delete();
		
		// d.添加自定义内容
		loadCustomContent(customContent);
	}

	/**
	 * 获取自定义表
	 * 
	 * @param config
	 * @return
	 * @throws SQLException
	 */
	private static List<Table> getCustomTables(Config config) throws SQLException {
		MBGConfiguration mbgConfig = config.getMbgConfig();
		CustomConfiguration customConfig = config.getCustomConfig();

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

		// 全部表
		List<String> allTableNames = new ArrayList<>();
		for (TableMetadata tableMetadata : tables) {
			allTableNames.add(tableMetadata.getTableName());
		}
		
		// 最终匹配的表
		List<String> machedTableNames = new ArrayList<>();
		
		// 需要导入的表
		String include = tableConfig.getInclude();
		
		// 需要排除的表
		String exclude = tableConfig.getExclude();
		
		// 优先级 include > exclude > database
		if(S.notEmpty(include)){
			String[] includes = include.split(",");
			machedTableNames.addAll(Arrays.asList(includes));
		}else if(S.notEmpty(exclude)){
			String[] excludes = exclude.split(",");
			for (String e : excludes) {
				allTableNames.remove(e);
			}
			machedTableNames.addAll(allTableNames);
		}else{
			machedTableNames.addAll(allTableNames);
		}
		
		StringBuilder tableTags = new StringBuilder();
		String className = null;
		for (String tableName : machedTableNames) {
			className = tableNameToClassName(tableName).concat(domainObjectNameSuffix);
			tableTags.append(
					"<table tableName=\"" + tableName + "\" domainObjectName=\"" + className + "\" " + propsInfo + "/>")
					.append(System.lineSeparator());
		}
		
		Class<Context> cls = Context.class;
		XStreamAlias alias = cls.getAnnotation(XStreamAlias.class);
		String aliasValue = alias.value();

		String tableXml = tableTags.toString();
		tableXml = "<" + aliasValue + ">" + tableXml + "</" + aliasValue + ">";

		XStream xstream = new XStream();
		xstream.autodetectAnnotations(true);
		xstream.alias(aliasValue, cls);
		Context context = (Context) xstream.fromXML(tableXml);
		return context.getTables();
	}

	/**
	 * 获取自定义内容
	 * 
	 * @param config
	 * @return
	 * @throws SQLException
	 * @throws IOException
	 */
	private static String getCustomContent(Config config) throws SQLException, IOException {
		MBGConfiguration mbgConfig = config.getMbgConfig();
		// 获取扫描目录 targetProject / targetPackage
		List<File> files = findGeneratorFiles(mbgConfig);

		CustomConfiguration customConfig = config.getCustomConfig();
		CustomCode customCode = customConfig.getCustomCode();
		String startLimit = customCode.getStartLimit();
		String endLimit = customCode.getEndLimit();

		StringBuilder customCodeFileContent = new StringBuilder();
		String customCodeContent = null;
		for (File file : files) {
			customCodeContent = findCustomCodeContent(file, startLimit, endLimit);
			if (S.notEmpty(customCodeContent)) {
				customCodeFileContent.append(CUSTOM_CONTENT_FILE_LINE_FLAG).append(file.getAbsolutePath())
						.append(LINE_SEPARATOR).append(customCodeContent).append(LINE_SEPARATOR);
			}
		}

		return customCodeFileContent.toString();
	}

	/**
	 * 获取自动生成的文件
	 * 
	 * @param mbgConfig
	 * @return
	 */
	private static List<File> findGeneratorFiles(MBGConfiguration mbgConfig) {
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

		return matchedFiles;
	}

	/**
	 * 获取自定义内容内容
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
	 * 加载自定义内容
	 * 
	 * @param from
	 *            自定义内容内容文件
	 * @throws IOException
	 */
	private static void loadCustomContent(File from) throws IOException {
		List<String> lines = Files.readLines(from, DEFAULT_CHARSET);
		if( lines.isEmpty() ){
			// 没有自定义内容
			System.out.println("没有自定义内容: " + from);
			return;
		}
		File file = null;
		StringBuilder customCodeContent = new StringBuilder();
		for (String line : lines) {
			if (line.matches("^"+CUSTOM_CONTENT_FILE_LINE_FLAG+".*")) {
				if (null != file) {
					appendCustomContentTo(file, customCodeContent.toString());
					customCodeContent.setLength(0);
				}
				file = new File(line.replace(CUSTOM_CONTENT_FILE_LINE_FLAG, ""));
				continue;
			}
			customCodeContent.append(line).append(System.lineSeparator());
		}
		appendCustomContentTo(file, customCodeContent.toString());
	}
	
	/**
	 * 追加自定义内容到一个文件
	 * 
	 * @param to
	 *            追加到这个文件
	 * @param customCodeContent
	 *            自定义内容内容
	 * @throws IOException
	 */
	private static void appendCustomContentTo(File to, String customCodeContent) throws IOException {
		// 添加自定义内容后的内容
		StringBuilder appendCustomCodeContent = new StringBuilder();
		List<String> lines = Files.readLines(to, DEFAULT_CHARSET);
		String line = null;
		int lineCount = lines.size();
		for (int i = 0; i < lineCount; i++) {
			line = lines.get(i);
			// 文件的最后一行
			if (i == (lineCount - 1)) {
				appendCustomCodeContent.append(System.lineSeparator()).append(customCodeContent);
				// 这里把文件末尾多余的空行移除
				String content = appendCustomCodeContent.toString().replaceAll("(\r\n){1,}$", "");
				appendCustomCodeContent.setLength(0);
				appendCustomCodeContent.append(content).append(System.lineSeparator()).append(line);
				break;
			}
			appendCustomCodeContent.append(line).append(System.lineSeparator());
		}
		Files.write(appendCustomCodeContent, to, DEFAULT_CHARSET);
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
	
	public static String getMBGConfigDTD(){
		StringBuilder dtd = new StringBuilder();
		dtd.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
			.append(System.lineSeparator())
			.append("<!DOCTYPE generatorConfiguration")
			.append(System.lineSeparator())
			.append("  PUBLIC \"-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN\"")
			.append(System.lineSeparator())
			.append(" \"http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd\">")
			.append(System.lineSeparator());
		return dtd.toString();	
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
			  start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
