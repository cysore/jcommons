package com.github.coderepositories.jcommons.tools.mgb.dbinfo;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.BasicRowProcessor;

/**
 * <pre>
 * 自定义行处理器
 * 这里主要针对 ColumnMetadata, TableMetadata 两个Model信息的封装
 * </pre>
 * 
 * @author zhangguangyong
 *
 *         2016年1月30日 下午5:15:59
 */
public class CustomRowProcessor extends BasicRowProcessor {

	@Override
	public <T> List<T> toBeanList(ResultSet rs, Class<T> type) throws SQLException {
		ResultSetMetaData rsMetaData = rs.getMetaData();
		int columnCount = rsMetaData.getColumnCount();
		Field[] fields = type.getDeclaredFields();
		Map<String, Field> fieldNameAndFieldMap = new HashMap<String, Field>();
		for (Field field : fields) {
			field.setAccessible(true);
			fieldNameAndFieldMap.put(field.getName().toLowerCase(), field);
		}
		List<T> resultValue = new ArrayList<T>();
		try {
			while (rs.next()) {
				T t = type.newInstance();
				for (int i = 1; i <= columnCount; i++) {
					String columnName = rsMetaData.getColumnName(i).replaceAll("_", "").toLowerCase();
					fieldNameAndFieldMap.get(columnName).set(t, rs.getObject(i));
				}
				resultValue.add(t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultValue;
	}

}
