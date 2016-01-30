package com.github.coderepositories.jcommons.tools.mgb.config.custom;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 自定义代码配置
 * 
 * @author zhangguangyong
 *
 *         2016年1月30日 下午12:44:19
 */
@XStreamAlias("customCode")
public class CustomCode {

	@XStreamAsAttribute
	private String startLimit;

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
