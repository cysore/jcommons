package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("excel")
public class ExcelLabel {
	
	@XStreamAsAttribute
	private String namespace;
	
	@XStreamAsAttribute
	private String templatePath;
	
	@XStreamImplicit(itemFieldName="sheet")
	private List<SheetLabel> sheets = new ArrayList<>();
	
	public ExcelLabel addSheet(SheetLabel sheet){
		sheets.add(sheet);
		return this;
	}
	
	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getTemplatePath() {
		return templatePath;
	}

	public void setTemplatePath(String templatePath) {
		this.templatePath = templatePath;
	}

	public List<SheetLabel> getSheets() {
		return sheets;
	}

	public void setSheets(List<SheetLabel> sheets) {
		this.sheets = sheets;
	}

}
