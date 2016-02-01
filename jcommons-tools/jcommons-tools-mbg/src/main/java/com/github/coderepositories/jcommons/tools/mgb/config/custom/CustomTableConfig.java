package com.github.coderepositories.jcommons.tools.mgb.config.custom;

import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

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
	
	@XStreamImplicit(itemFieldName="include")
	private List<String> includes;

	@XStreamImplicit(itemFieldName="exclude")
	private List<String> excludes;

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

	public List<String> getIncludes() {
		return includes;
	}

	public void setIncludes(List<String> includes) {
		this.includes = includes;
	}

	public List<String> getExcludes() {
		return excludes;
	}

	public void setExcludes(List<String> excludes) {
		this.excludes = excludes;
	}

	public String getDomainObjectNameSuffix() {
		return domainObjectNameSuffix;
	}

	public void setDomainObjectNameSuffix(String domainObjectNameSuffix) {
		this.domainObjectNameSuffix = domainObjectNameSuffix;
	}

}
