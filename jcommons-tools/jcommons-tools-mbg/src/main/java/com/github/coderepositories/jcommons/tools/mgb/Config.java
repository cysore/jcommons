package com.github.coderepositories.jcommons.tools.mgb;

import com.github.coderepositories.jcommons.tools.mgb.config.GeneratorConfiguration;
import com.github.coderepositories.jcommons.tools.mgb.config.custom.CustomConfiguration;

/**
 * 总的配置信息
 * 
 * @author zhangguangyong
 *
 *         2016年1月30日 下午4:56:21
 */
public class Config {

	private GeneratorConfiguration generatorConfig;

	private CustomConfiguration customConfig;

	public GeneratorConfiguration getGeneratorConfig() {
		return generatorConfig;
	}

	public void setGeneratorConfig(GeneratorConfiguration generatorConfig) {
		this.generatorConfig = generatorConfig;
	}

	public CustomConfiguration getCustomConfig() {
		return customConfig;
	}

	public void setCustomConfig(CustomConfiguration customConfig) {
		this.customConfig = customConfig;
	}

}
