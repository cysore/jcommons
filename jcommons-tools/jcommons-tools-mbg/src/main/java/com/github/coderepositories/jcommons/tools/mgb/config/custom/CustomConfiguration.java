package com.github.coderepositories.jcommons.tools.mgb.config.custom;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Mybatis Generator Configuration
 * 
 * @author zhangguangyong
 *
 *         2016年1月30日 下午12:49:16
 */
@XStreamAlias("customConfiguration")
public class CustomConfiguration {
	/**
	 * 自定义Table配置
	 */
	private CustomTableConfig tableConfig;

	/**
	 * 自定义内容配置
	 */
	private CustomContent customContent;

	public CustomTableConfig getTableConfig() {
		return tableConfig;
	}

	public void setTableConfig(CustomTableConfig tableConfig) {
		this.tableConfig = tableConfig;
	}

	public CustomContent getCustomContent() {
		return customContent;
	}

	public void setCustomContent(CustomContent customContent) {
		this.customContent = customContent;
	}

}
