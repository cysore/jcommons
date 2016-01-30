package com.github.coderepositories.jcommons.tools.mgb;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;

import com.github.coderepositories.jcommons.core.S;
import com.github.coderepositories.jcommons.tools.mgb.config.JdbcConnection;
import com.github.coderepositories.jcommons.tools.mgb.config.MybatisGeneratorConfiguration;
import com.github.coderepositories.jcommons.tools.mgb.config.custom.CustomConfiguration;
import com.github.coderepositories.jcommons.tools.mgb.config.custom.CustomTableConfig;
import com.github.coderepositories.jcommons.tools.mgb.dbinfo.DbInfos;
import com.github.coderepositories.jcommons.tools.mgb.dbinfo.TableMetadata;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@SuppressWarnings("all")
public class MBGTemplate {
	// 当前工作目录
	static final String BASE_DIR = System.getProperty("user.dir");

	// 编译目录
	static final String CLASSES = ClassLoader.getSystemResource("").getFile();

	// 获取配置信息
	public static ConfigInfo loadConfig(String mybatisGeneratorConfig, String customConfig) throws SQLException {
		File mbgConfigFile = new File(CLASSES, mybatisGeneratorConfig);
		File customConfigFile = new File(CLASSES, customConfig);

		MybatisGeneratorConfiguration mbgCoinfgBean = new MybatisGeneratorConfiguration();
		CustomConfiguration customConfigBean = new CustomConfiguration();

		readConfig(mbgConfigFile, mbgCoinfgBean);
		readConfig(customConfigFile, customConfigBean);

		ConfigInfo configInfo = new ConfigInfo();
		configInfo.setMbgConfig(mbgCoinfgBean);
		configInfo.setCustomConfig(customConfigBean);

		generateTableTemplate(configInfo);

		return configInfo;
	}

	/**
	 * 生成表格模板
	 * 
	 * @throws SQLException
	 */
	private static void generateTableTemplate(ConfigInfo configInfo) throws SQLException {
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
			className = tableName2ClassName(tableName).concat(domainObjectNameSuffix);
			tableTemplate.append("<table tableName=\""+tableName+"\" domainObjectName=\""+className+"\" "+propsInfo+"/>").append(System.lineSeparator());
		}
		
		System.out.println(tableTemplate.toString());
	}

	// 合并配置文件
	public void mergeConfig(String mybatisGeneratorConfig, String customConfig) {
	}

	/**
	 * 数据库表名转换为Java类名
	 * 
	 * @param tableName
	 * @return
	 */
	private static String tableName2ClassName(String tableName) {
		return formatToHump(tableName, "_", true);
	}

	/**
	 * 字符串分隔，分隔后的每段字符串首字母大写或小写
	 * 
	 * @param str
	 * @param separator
	 * @return
	 */
	public static String formatToHump(String str, String separator, boolean letterUpper) {
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

		Class<? extends Object> mappingClass = obj.getClass();
		XStreamAlias alias = mappingClass.getAnnotation(XStreamAlias.class);
		String rootAlias = alias.value();
		xstream.alias(rootAlias, mappingClass);
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
