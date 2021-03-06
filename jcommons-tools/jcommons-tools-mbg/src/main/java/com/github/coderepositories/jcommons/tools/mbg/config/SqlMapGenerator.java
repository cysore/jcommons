package com.github.coderepositories.jcommons.tools.mbg.config;

import java.util.List;

import com.github.coderepositories.jcommons.tools.mbg.config.custom.Property;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("sqlMapGenerator")
public class SqlMapGenerator {
	
	@XStreamAsAttribute
	private String targetPackage;

	@XStreamAsAttribute
	private String targetProject;
	
	@XStreamImplicit(itemFieldName = "property")
	private List<Property> properties;

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public String getTargetPackage() {
		return targetPackage;
	}

	public void setTargetPackage(String targetPackage) {
		this.targetPackage = targetPackage;
	}

	public String getTargetProject() {
		return targetProject;
	}

	public void setTargetProject(String targetProject) {
		this.targetProject = targetProject;
	}
}
