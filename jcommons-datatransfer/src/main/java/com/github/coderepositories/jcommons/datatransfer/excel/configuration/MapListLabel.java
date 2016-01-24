package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import java.util.List;

public class MapListLabel extends PropertyLabel {

	private Boolean multiSelect = true;

	private List<CellLabel> cellLabels;

	public Boolean getMultiSelect() {
		return multiSelect;
	}

	public void setMultiSelect(Boolean multiSelect) {
		this.multiSelect = multiSelect;
	}

	public List<CellLabel> getCellLabels() {
		return cellLabels;
	}

	public void setCellLabels(List<CellLabel> cellLabels) {
		this.cellLabels = cellLabels;
	}

}
