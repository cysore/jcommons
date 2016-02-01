package com.github.coderepositories.jcommons.tools.mgb;

import com.github.coderepositories.jcommons.tools.mgb.config.MBGConfiguration;
import com.github.coderepositories.jcommons.tools.mgb.config.custom.CustomConfiguration;

/**
 * 总的配置信息
 * 
 * @author zhangguangyong
 *
 *         2016年1月30日 下午4:56:21
 */
public class Config {

	private MBGConfiguration mbgConfig;

	private CustomConfiguration customConfig;

	public MBGConfiguration getMbgConfig() {
		return mbgConfig;
	}

	public void setMbgConfig(MBGConfiguration mbgConfig) {
		this.mbgConfig = mbgConfig;
	}

	public CustomConfiguration getCustomConfig() {
		return customConfig;
	}

	public void setCustomConfig(CustomConfiguration customConfig) {
		this.customConfig = customConfig;
	}

}
