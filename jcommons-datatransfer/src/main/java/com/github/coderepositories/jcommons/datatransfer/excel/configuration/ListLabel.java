package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import java.util.List;

public class ListLabel extends PropertyLabel {

	private Integer startRow;
	private Integer startColumn;
	private Integer rowInterval;
	private Integer eachRowCount;
	
	private List<CellLabel> cellLabels;
	
	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Integer getStartColumn() {
		return startColumn;
	}

	public void setStartColumn(Integer startColumn) {
		this.startColumn = startColumn;
	}

	public Integer getRowInterval() {
		return rowInterval;
	}

	public void setRowInterval(Integer rowInterval) {
		this.rowInterval = rowInterval;
	}

	public Integer getEachRowCount() {
		return eachRowCount;
	}

	public void setEachRowCount(Integer eachRowCount) {
		this.eachRowCount = eachRowCount;
	}

	public List<CellLabel> getCellLabels() {
		return cellLabels;
	}

	public void setCellLabels(List<CellLabel> cellLabels) {
		this.cellLabels = cellLabels;
	}
	
	
	
}
