package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("mapList")
public class MapListLabel extends PropertyLabel {

	@XStreamAsAttribute
	private Boolean multiSelect = true;

	@XStreamImplicit(itemFieldName = "cell")
	private List<CellLabel> cells = new ArrayList<>();
	
	public MapListLabel addCell(CellLabel cell){
		cells.add(cell);
		return this;
	}
	
	public Boolean getMultiSelect() {
		return multiSelect;
	}

	public void setMultiSelect(Boolean multiSelect) {
		this.multiSelect = multiSelect;
	}

	public List<CellLabel> getCells() {
		return cells;
	}

	public void setCells(List<CellLabel> cells) {
		this.cells = cells;
	}

}
