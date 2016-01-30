package com.github.coderepositories.jcommons.tools.mgb.config.table;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("ignoreColumn")
public class IgnoreColumn {
	
	@XStreamAsAttribute
	private String column;
	
	@XStreamAsAttribute
	private String delimitedColumnName;

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public String getDelimitedColumnName() {
		return delimitedColumnName;
	}

	public void setDelimitedColumnName(String delimitedColumnName) {
		this.delimitedColumnName = delimitedColumnName;
	}
	
}
