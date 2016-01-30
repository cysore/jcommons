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

	private CustomTableConfig tableConfig;

	private CustomCode customCode;

	public CustomTableConfig getTableConfig() {
		return tableConfig;
	}

	public void setTableConfig(CustomTableConfig tableConfig) {
		this.tableConfig = tableConfig;
	}

	public CustomCode getCustomCode() {
		return customCode;
	}

	public void setCustomCode(CustomCode customCode) {
		this.customCode = customCode;
	}

	
}
