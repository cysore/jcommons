package com.github.coderepositories.jcommons.tools.mgb.config.custom;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

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

	private String domainObjectNameSuffix;

	private String include;

	private String exclude;

	/**
	 * 获取Table公共的属性配置信息
	 * 
	 * @return
	 */
	public String getPropsInfo() {
		StringBuilder propsInfo = new StringBuilder();
		Set<Entry<Object, Object>> entrySet = properties.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			propsInfo.append(entry.getKey()).append("=").append("\"" + entry.getValue() + "\"").append(" ");
		}
		return propsInfo.toString();
	}

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

	public String getDomainObjectNameSuffix() {
		return domainObjectNameSuffix;
	}

	public void setDomainObjectNameSuffix(String domainObjectNameSuffix) {
		this.domainObjectNameSuffix = domainObjectNameSuffix;
	}

}
