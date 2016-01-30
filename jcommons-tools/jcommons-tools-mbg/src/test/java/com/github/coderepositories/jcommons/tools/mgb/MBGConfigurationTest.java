package com.github.coderepositories.jcommons.tools.mgb;

import java.io.File;
import java.net.URL;

import org.junit.Test;

import com.github.coderepositories.jcommons.tools.mgb.config.MybatisGeneratorConfiguration;
import com.github.coderepositories.jcommons.tools.mgb.config.custom.CustomConfiguration;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class MBGConfigurationTest {
	static final URL CLASSES = ClassLoader.getSystemResource("");

	static final String MYBATIS_GENERATOR_CONFIG_FILE = "mybatisGeneratorConfig.xml";

	static final String CUSTOM_CONFIG_FILE = "customConfig.xml";

	@Test
	public void readConfig() throws Exception {
		try {

			File config = new File(CLASSES.getFile(), MYBATIS_GENERATOR_CONFIG_FILE);
			Object obj = new MybatisGeneratorConfiguration();
			readConfig(config, obj);
			writeConfig(config, obj);

			config = new File(CLASSES.getFile(), CUSTOM_CONFIG_FILE);
			obj = new CustomConfiguration();
			readConfig(config, obj);
			writeConfig(config, obj);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void readConfig(File config, Object obj) {
		XStream xstream = new XStream();
		xstream.autodetectAnnotations(true);

		Class<? extends Object> objClass = obj.getClass();
		XStreamAlias alias = objClass.getAnnotation(XStreamAlias.class);
		String rootAlias = alias.value();
		xstream.alias(rootAlias, objClass);

		xstream.fromXML(config, obj);
	}

	private static void writeConfig(File config, Object obj) {
		XStream xstream = new XStream();
		xstream.autodetectAnnotations(true);
		Class<? extends Object> mappingClass = obj.getClass();
		XStreamAlias alias = mappingClass.getAnnotation(XStreamAlias.class);
		String rootAlias = alias.value();
		xstream.alias(rootAlias, mappingClass);
		String xml = xstream.toXML(obj);
		System.out.println(xml);
	}

}
