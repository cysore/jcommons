package com.github.coderepositories.jcommons.datatransfer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import org.junit.Test;

import com.github.coderepositories.jcommons.datatransfer.excel.configuration.CellLabel;
import com.github.coderepositories.jcommons.datatransfer.excel.configuration.ExcelTemplate;
import com.github.coderepositories.jcommons.datatransfer.excel.configuration.HeadLabel;
import com.github.coderepositories.jcommons.datatransfer.excel.configuration.ListLabel;
import com.github.coderepositories.jcommons.datatransfer.excel.configuration.ListMapLabel;
import com.github.coderepositories.jcommons.datatransfer.excel.configuration.MapLabel;
import com.github.coderepositories.jcommons.datatransfer.excel.configuration.MapListLabel;
import com.github.coderepositories.jcommons.datatransfer.excel.configuration.SheetLabel;
import com.thoughtworks.xstream.XStream;

public class XStreamTest {

	@Test
	public void test() {

		try {

			XStream xstream = new XStream();

			xstream.alias("excel", ExcelTemplate.class);
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
			
			xstream.alias("excel", ExcelTemplate.class);
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
			
			ExcelTemplate template = new ExcelTemplate();
			
			SheetLabel sheetLabel = new SheetLabel();
			
			ListLabel listLabel = new ListLabel();
			
			CellLabel cellLabel = new CellLabel();
			cellLabel.setX(1);
			cellLabel.setY(2);
			listLabel.setCellLabels(Arrays.asList(cellLabel));
			
			sheetLabel.setListLabels(Arrays.asList(listLabel));
			
			template.setSheetLabels(Arrays.asList(sheetLabel));
			
			oos.writeObject(template);
			oos.flush();
			oos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
