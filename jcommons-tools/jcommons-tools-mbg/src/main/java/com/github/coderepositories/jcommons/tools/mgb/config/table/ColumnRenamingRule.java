package com.github.coderepositories.jcommons.tools.mgb.config.table;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
@XStreamAlias("columnRenamingRule")
public class ColumnRenamingRule {
	
	@XStreamAsAttribute
	private String searchString;

	@XStreamAsAttribute
	private String replaceString;

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public String getReplaceString() {
		return replaceString;
	}

	public void setReplaceString(String replaceString) {
		this.replaceString = replaceString;
	}
	
	
	
}
