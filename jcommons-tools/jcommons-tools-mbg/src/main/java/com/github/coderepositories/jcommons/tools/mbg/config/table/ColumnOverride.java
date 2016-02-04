package com.github.coderepositories.jcommons.tools.mbg.config.table;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("columnOverride")
public class ColumnOverride {

	@XStreamAsAttribute
	private String property;

	@XStreamAsAttribute
	private String javaType;

	@XStreamAsAttribute
	private String jdbcType;

	@XStreamAsAttribute
	private String typeHandler;

	@XStreamAsAttribute
	private String delimitedColumnName;

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getJavaType() {
		return javaType;
	}

	public void setJavaType(String javaType) {
		this.javaType = javaType;
	}

	public String getJdbcType() {
		return jdbcType;
	}

	public void setJdbcType(String jdbcType) {
		this.jdbcType = jdbcType;
	}

	public String getTypeHandler() {
		return typeHandler;
	}

	public void setTypeHandler(String typeHandler) {
		this.typeHandler = typeHandler;
	}

	public String getDelimitedColumnName() {
		return delimitedColumnName;
	}

	public void setDelimitedColumnName(String delimitedColumnName) {
		this.delimitedColumnName = delimitedColumnName;
	}

}
