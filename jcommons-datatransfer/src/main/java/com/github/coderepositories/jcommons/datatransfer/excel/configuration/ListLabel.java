package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("list")
public class ListLabel extends PropertyLabel {

	@XStreamAsAttribute
	private Integer startRow;

	@XStreamAsAttribute
	private Integer startColumn;

	@XStreamAsAttribute
	private Integer rowInterval;

	@XStreamAsAttribute
	private Integer eachRowCount;

	@XStreamImplicit(itemFieldName = "cell")
	private List<CellLabel> cells = new ArrayList<>();
	
	public ListLabel addCell(CellLabel cell){
		cells.add(cell);
		return this;
	}
	
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

	public List<CellLabel> getCells() {
		return cells;
	}

	public void setCells(List<CellLabel> cells) {
		this.cells = cells;
	}

}
