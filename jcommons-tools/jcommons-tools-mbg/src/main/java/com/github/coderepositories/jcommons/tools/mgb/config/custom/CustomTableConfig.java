package com.github.coderepositories.jcommons.tools.mgb.config.custom;

import java.util.Properties;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Table配置
 * 
 * @author zhangguangyong
 *
 *         2016年1月30日 下午12:54:23
 */
@XStreamAlias("tableConfig")
public class CustomTableConfig {
	private Properties properties;
	
	private String include;

	private String exclude;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public String getInclude() {
		return include;
	}

	public void setInclude(String include) {
		this.include = include;
	}

	public String getExclude() {
		return exclude;
	}

	public void setExclude(String exclude) {
		this.exclude = exclude;
	}
	
	
}
