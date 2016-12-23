package com.github.coderepositories.jcommons.tools.mbg.config;

import com.github.coderepositories.jcommons.tools.mbg.config.custom.Property;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("commentGenerator")
public class CommentGenerator {

	@XStreamAsAttribute
	private String type;

	@XStreamImplicit(itemFieldName = "property")
	private List<Property> properties;

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
