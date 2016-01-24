package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import java.util.List;

public class MapLabel extends PropertyLabel {
	private List<CellLabel> cellLabels;

	public List<CellLabel> getCellLabels() {
		return cellLabels;
	}

	public void setCellLabels(List<CellLabel> cellLabels) {
		this.cellLabels = cellLabels;
	}

}
