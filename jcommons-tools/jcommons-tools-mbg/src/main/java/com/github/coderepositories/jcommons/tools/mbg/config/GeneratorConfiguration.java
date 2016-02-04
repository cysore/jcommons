package com.github.coderepositories.jcommons.tools.mbg.config;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Mybatis代码生成工具配置
 * 
 * @author zhangguangyong
 *
 *         2016年1月30日 下午1:18:03
 */
@XStreamAlias("generatorConfiguration")
public class GeneratorConfiguration {

	private Context context;

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

}
