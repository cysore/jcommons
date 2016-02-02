package com.github.coderepositories.jcommons.tools.mgb.config.custom;

import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 自定义Table公共配置
 * 
 * @author zhangguangyong
 *
 *         2016年1月30日 下午12:54:23
 */
@XStreamAlias("tableConfig")
public class CustomTableConfig {
	/**
	 * Table公共属性配置
	 */
	private Properties properties;
	
	/**
	 * Table映射实体的统一后缀
	 */
	private String domainObjectNameSuffix;

	/**
	 * 需要导入的Table(优先于excludes)
	 */
	private List<String> includes;
	
	/**
	 * 需要排除的Table
	 */
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
