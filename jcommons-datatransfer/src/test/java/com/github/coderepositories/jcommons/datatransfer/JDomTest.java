package com.github.coderepositories.jcommons.datatransfer;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.DOMBuilder;


public class JDomTest {
	
	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			String path = "E:\\Workspace\\eclipse\\jcommons\\jcommons-datatransfer\\documents\\template.xml";
			DocumentBuilder docBuilder = factory.newDocumentBuilder();
			
			DOMBuilder domBuilder = new DOMBuilder();
			Document doc = domBuilder.build(docBuilder.parse(new File(path)));
			
			Element root = doc.getRootElement();
			List<Element> list = root.getChildren("sheet");
			for (Element ele : list) {
				String value = ele.getAttribute("name").getValue();
				int value2 = ele.getAttribute("id").getIntValue();
				System.out.println(value);
				System.out.println(value2);
				
			}
			System.out.println(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
