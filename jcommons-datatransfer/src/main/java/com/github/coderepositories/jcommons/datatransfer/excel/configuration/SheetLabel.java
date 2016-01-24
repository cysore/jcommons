package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import java.util.List;

public class SheetLabel extends PropertyLabel {

	private String id;
	private String name;

	private List<ListLabel> listLabels;

	private List<MapLabel> mapLabels;

	private List<ListMapLabel> listMapLabels;

	private List<MapListLabel> mapListLabels;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ListLabel> getListLabels() {
		return listLabels;
	}

	public void setListLabels(List<ListLabel> listLabels) {
		this.listLabels = listLabels;
	}

	public List<MapLabel> getMapLabels() {
		return mapLabels;
	}

	public void setMapLabels(List<MapLabel> mapLabels) {
		this.mapLabels = mapLabels;
	}

	public List<ListMapLabel> getListMapLabels() {
		return listMapLabels;
	}

	public void setListMapLabels(List<ListMapLabel> listMapLabels) {
		this.listMapLabels = listMapLabels;
	}

	public List<MapListLabel> getMapListLabels() {
		return mapListLabels;
	}

	public void setMapListLabels(List<MapListLabel> mapListLabels) {
		this.mapListLabels = mapListLabels;
	}

}
