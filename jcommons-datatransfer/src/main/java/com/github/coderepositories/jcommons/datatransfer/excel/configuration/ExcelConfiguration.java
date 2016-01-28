package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import java.io.File;
import java.net.URL;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class ExcelConfiguration {
	/**
	 * 加载总的配置文件
	 * @param config
	 */
	void loadConfig(File config){
		XStream xstream = new XStream();
		xstream.autodetectAnnotations(true);
		
		
		XStreamAlias alias = ExcelLabel.class.getAnnotation(XStreamAlias.class);
		String rootAlias = alias.value();
		xstream.alias(rootAlias, ExcelLabel.class);
		
		ExcelLabel template = new ExcelLabel();
		xstream.fromXML(config, template);
		
	}
	
	
	void loadConfig(String filepathRelativeToClasspath){
		
	}
	
	public static void main(String[] args) {
		URL url = ClassLoader.getSystemResource("");
		File file = new File(url.getPath(), "data-transfer-excel.xml");
		System.out.println(file);
	}
	
}
