package com.github.coderepositories.jcommons.datatransfer.excel;

import java.io.File;
import java.util.List;
import java.util.Map;

@SuppressWarnings("rawtypes")
public interface ExcelOperation {

	void write(String sheetTemplateId, File excel, List listData);

	void write(String sheetTemplateId, File excel, Map mapData);

	void write(String sheetTemplateId, File excel, List listData, Map mapData);
	
}
