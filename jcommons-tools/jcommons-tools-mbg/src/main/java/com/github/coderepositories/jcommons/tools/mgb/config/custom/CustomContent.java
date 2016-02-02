package com.github.coderepositories.jcommons.tools.mgb.config.custom;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 自定义内容配置
 * 
 * @author zhangguangyong
 *
 *         2016年1月30日 下午12:44:19
 */
@XStreamAlias("customContent")
public class CustomContent {

	/**
	 * 自定义内容开始边界匹配
	 */
	@XStreamAsAttribute
	private String startLimit;

	/**
	 * 自定义内容结束边界匹配
	 */
	@XStreamAsAttribute
	private String endLimit;

	@XStreamAsAttribute
	private String output;

	public String getStartLimit() {
		return startLimit;
	}

	public void setStartLimit(String startLimit) {
		this.startLimit = startLimit;
	}

	public String getEndLimit() {
		return endLimit;
	}

	public void setEndLimit(String endLimit) {
		this.endLimit = endLimit;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

}
