package com.github.coderepositories.jcommons.datatransfer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.junit.Test;

import com.github.coderepositories.jcommons.datatransfer.excel.configuration.CellLabel;
import com.github.coderepositories.jcommons.datatransfer.excel.configuration.DataTransferExcel;
import com.github.coderepositories.jcommons.datatransfer.excel.configuration.ExcelLabel;
import com.github.coderepositories.jcommons.datatransfer.excel.configuration.HeadLabel;
import com.github.coderepositories.jcommons.datatransfer.excel.configuration.ListLabel;
import com.github.coderepositories.jcommons.datatransfer.excel.configuration.ListMapLabel;
import com.github.coderepositories.jcommons.datatransfer.excel.configuration.MapLabel;
import com.github.coderepositories.jcommons.datatransfer.excel.configuration.MapListLabel;
import com.github.coderepositories.jcommons.datatransfer.excel.configuration.ResourceLabel;
import com.github.coderepositories.jcommons.datatransfer.excel.configuration.SheetLabel;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class XStreamTest {
	
	static final String USER_DIR = System.getProperty("user.dir");
	
	@Test
	public void test() {

		try {

			XStream xstream = new XStream();

			xstream.alias("excel", ExcelLabel.class);
			xstream.alias("sheet", SheetLabel.class);
			
			xstream.alias("list", ListLabel.class);
			xstream.alias("map", MapLabel.class);
			xstream.alias("listMap", ListMapLabel.class);
			xstream.alias("mapList", MapListLabel.class);

			xstream.alias("head", HeadLabel.class);
			xstream.alias("cell", CellLabel.class);
			
			xstream.aliasField("list", SheetLabel.class, "listLabels");
			xstream.aliasField("map", SheetLabel.class, "mapLabels");
			xstream.aliasField("listMap", SheetLabel.class, "listMapLabels");
			xstream.aliasField("mapList", SheetLabel.class, "mapListLabels");
			
			xstream.aliasField("cell", ListLabel.class, "cellLabels");
			xstream.aliasField("cell", HeadLabel.class, "cellLabels");
//			xstream.aliasField("cell", MapLabel.class, "cellLabels");
//			xstream.aliasField("cell", MapListLabel.class, "cellLabels");
			
			String path = "E:\\Workspace\\eclipse\\jcommons\\jcommons-datatransfer\\documents\\template.xml";
			FileReader reader = new FileReader(new File(path));
			ObjectInputStream ois = xstream.createObjectInputStream(reader);
			
			Object excel = ois.readObject();
			System.out.println(excel);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void test1() {
		try {
			
			XStream xstream = new XStream();
			
			xstream.alias("excel", ExcelLabel.class);
			xstream.aliasField("sheet", SheetLabel.class, "sheetLabels");
			
			
			xstream.alias("sheet", SheetLabel.class);
			
			xstream.alias("list", ListLabel.class);
			xstream.alias("map", MapLabel.class);
			xstream.alias("listMap", ListMapLabel.class);
			xstream.alias("mapList", MapListLabel.class);
			
			xstream.alias("head", HeadLabel.class);
			xstream.alias("cell", CellLabel.class);
			
			xstream.aliasField("list", SheetLabel.class, "listLabels");
			xstream.aliasField("map", SheetLabel.class, "mapLabels");
			xstream.aliasField("listMap", SheetLabel.class, "listMapLabels");
			xstream.aliasField("mapList", SheetLabel.class, "mapListLabels");
//			
//			xstream.aliasField("cell", ListLabel.class, "cellLabels");
//			xstream.aliasField("cell", HeadLabel.class, "cellLabels");
//			xstream.aliasField("cell", MapLabel.class, "cellLabels");
//			xstream.aliasField("cell", MapListLabel.class, "cellLabels");
			
			String path = "E:\\Workspace\\eclipse\\jcommons\\jcommons-datatransfer\\documents\\template1.xml";
			FileWriter writer = new FileWriter(new File(path));
			ObjectOutputStream oos = xstream.createObjectOutputStream(writer);
			
			ExcelLabel template = new ExcelLabel();
			
			SheetLabel sheetLabel = new SheetLabel();
			
			ListLabel listLabel = new ListLabel();
			
			CellLabel cellLabel = new CellLabel();
			cellLabel.setX(1);
			cellLabel.setY(2);
			listLabel.setCells(Arrays.asList(cellLabel));
			
			sheetLabel.setLists(Arrays.asList(listLabel));
			
			template.addSheet(sheetLabel);
			
			oos.writeObject(template);
			oos.flush();
			oos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test2() {
		try {
			
			XStream xstream = new XStream();
			xstream.autodetectAnnotations(true);
			
			ExcelLabel template = new ExcelLabel();
			
			SheetLabel sheetLabel = new SheetLabel();
			
			ListLabel listLabel = new ListLabel();
			
			CellLabel cellLabel = new CellLabel();
			cellLabel.setX(1);
			cellLabel.setY(2);
			listLabel.addCell(cellLabel);
			
			sheetLabel.addList(listLabel);
			
			template.addSheet(sheetLabel);
			
			String xml = xstream.toXML(template);
			System.out.println(xml);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test3() {
		try {
			
			XStream xstream = new XStream();
			xstream.autodetectAnnotations(true);
			
			XStreamAlias alias = ExcelLabel.class.getAnnotation(XStreamAlias.class);
			String rootAlias = alias.value();
			
			xstream.alias(rootAlias, ExcelLabel.class);
			String path = "E:\\Workspace\\eclipse\\jcommons\\jcommons-datatransfer\\documents\\template.xml";
			ExcelLabel template = new ExcelLabel();
			
			xstream.fromXML(new File(path), template);
			
			List<SheetLabel> sheets = template.getSheets();
			SheetLabel sheetLabel = sheets.get(0);
			CellLabel cellLabel = sheetLabel.getMapLists().get(0).getCells().get(0);
			System.out.println(cellLabel.getX());
			System.out.println(cellLabel.getKey());
			
			
			System.out.println(sheets.get(0).getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test6(){
		// File file = new File(USER_DIR, "document/template1.xml");
		XStream xstream = new XStream();
		xstream.autodetectAnnotations(true);
		
		DataTransferExcel excel = new DataTransferExcel();
		
		Properties properties = new Properties();
		properties.put("name", "zhangsan");
		excel.setProperties(properties);
		
		ResourceLabel resource1 = new ResourceLabel();
		resource1.setCls("com.sdf.sdf.A");
		resource1.setFile("document/template1.xml");
		List<ResourceLabel> list = new ArrayList<>();
		list.add(resource1);
		excel.setResources(list);
		
		
		String xml = xstream.toXML(excel);
		System.out.println(xml);
		
	}
	
	@Test
	public void test4() {
		try {
			
			XStream xstream = new XStream();
			xstream.autodetectAnnotations(true);
			
			XStreamAlias alias = ExcelLabel.class.getAnnotation(XStreamAlias.class);
			String rootAlias = alias.value();
			
			xstream.alias(rootAlias, ExcelLabel.class);
			String path = "E:\\Workspace\\eclipse\\jcommons\\jcommons-datatransfer\\documents\\template.xml";
			ExcelLabel template = new ExcelLabel();
			
			xstream.fromXML(new File(path), template);
			
			List<SheetLabel> sheets = template.getSheets();
			SheetLabel sheetLabel = sheets.get(0);
			CellLabel cellLabel = sheetLabel.getMapLists().get(0).getCells().get(0);
			System.out.println(cellLabel.getX());
			System.out.println(cellLabel.getKey());
			
			
			System.out.println(sheets.get(0).getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
