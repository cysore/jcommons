package com.github.coderepositories.jcommons.tools.mgb.config.table;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("generatedKey")
public class GeneratedKey {
	
	@XStreamAsAttribute
	private String column;
	
	@XStreamAsAttribute
	private String sqlStatement;
	
	@XStreamAsAttribute
	private String 	identity;
	
	@XStreamAsAttribute
	private String type;

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public String getSqlStatement() {
		return sqlStatement;
	}

	public void setSqlStatement(String sqlStatement) {
		this.sqlStatement = sqlStatement;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
