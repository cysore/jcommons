package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("map")
public class MapLabel extends PropertyLabel {

	@XStreamImplicit(itemFieldName = "cell")
	private List<CellLabel> cells = new ArrayList<>();

	public MapLabel addCell(CellLabel cell){
		cells.add(cell);
		return this;
	}
	
	public List<CellLabel> getCells() {
		return cells;
	}

	public void setCells(List<CellLabel> cells) {
		this.cells = cells;
	}

}
