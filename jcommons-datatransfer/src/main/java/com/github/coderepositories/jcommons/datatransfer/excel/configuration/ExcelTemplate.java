package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import java.util.List;

public class ExcelTemplate {

	private String namespace;
	private String templatePath;

	private List<SheetLabel> sheetLabels;

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

	public List<SheetLabel> getSheetLabels() {
		return sheetLabels;
	}

	public void setSheetLabels(List<SheetLabel> sheetLabels) {
		this.sheetLabels = sheetLabels;
	}

}
