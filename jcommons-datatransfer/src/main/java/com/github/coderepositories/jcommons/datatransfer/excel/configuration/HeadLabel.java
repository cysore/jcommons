package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("head")
public class HeadLabel {

	@XStreamAsAttribute
	private Integer x;

	@XStreamImplicit(itemFieldName = "cell")
	private List<CellLabel> cells;

	public HeadLabel addCell(CellLabel cell) {
		cells.add(cell);
		return this;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public List<CellLabel> getCells() {
		return cells;
	}

	public void setCells(List<CellLabel> cells) {
		this.cells = cells;
	}

}
