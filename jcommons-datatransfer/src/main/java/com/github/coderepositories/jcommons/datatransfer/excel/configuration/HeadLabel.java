package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import java.util.List;

public class HeadLabel {
	private Integer x;

	private List<CellLabel> cellLabels;

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public List<CellLabel> getCellLabels() {
		return cellLabels;
	}

	public void setCellLabels(List<CellLabel> cellLabels) {
		this.cellLabels = cellLabels;
	}

}
