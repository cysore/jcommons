package com.github.coderepositories.jcommons.tools.mbg.dbinfo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 * 数据库元信息查看工具
 * 
 * @author zhangguangyong
 *
 *         2016年2月2日 下午2:08:56
 */
public abstract class DbInfos {

	/**
	 * 获取数据库的所有表信息
	 * 
	 * @param dbName
	 * @return
	 * @throws SQLException
	 */
	public static List<TableMetadata> getTables(Connection conn, String dbName) throws SQLException {
		QueryRunner queryRunner = new QueryRunner();
		BeanListHandler<TableMetadata> beanHandler = new BeanListHandler<TableMetadata>(TableMetadata.class,
				new CustomRowProcessor());

		String sql = "SELECT * FROM information_schema.tables WHERE table_schema=?";
		List<TableMetadata> returnValue = queryRunner.query(conn, sql, beanHandler, dbName);
		DbUtils.close(conn);
		return returnValue;
	}

	/**
	 * 获取某个Table的所有Column信息
	 * 
	 * @param tableName
	 * @return
	 * @throws SQLException
	 */
	public static List<ColumnMetadata> getColumns(Connection conn, String tableName) throws SQLException {
		QueryRunner queryRunner = new QueryRunner();
		BeanListHandler<ColumnMetadata> beanHandler = new BeanListHandler<ColumnMetadata>(ColumnMetadata.class,
				new CustomRowProcessor());

		String sql = "SELECT * FROM information_schema.`COLUMNS` t WHERE t.`TABLE_NAME` = ?;";
		List<ColumnMetadata> returnValue = queryRunner.query(conn, sql, beanHandler, tableName);
		DbUtils.close(conn);
		return returnValue;
	}

}
