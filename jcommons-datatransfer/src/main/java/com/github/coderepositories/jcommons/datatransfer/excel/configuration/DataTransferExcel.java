package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("data-transfer-excel")
public class DataTransferExcel {

	private Properties properties;
	
	private List<ResourceLabel> resources = new ArrayList<>();

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<ResourceLabel> getResources() {
		return resources;
	}

	public void setResources(List<ResourceLabel> resources) {
		this.resources = resources;
	}

}
