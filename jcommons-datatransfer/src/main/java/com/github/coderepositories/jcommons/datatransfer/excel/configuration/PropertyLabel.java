package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public abstract class PropertyLabel {

	@XStreamAsAttribute
	private String property;

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

}
