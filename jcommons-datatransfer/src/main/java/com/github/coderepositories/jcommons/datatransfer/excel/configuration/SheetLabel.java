package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("sheet")
public class SheetLabel extends PropertyLabel {

	@XStreamAsAttribute
	private String id;

	@XStreamAsAttribute
	private String name;

	@XStreamImplicit(itemFieldName = "list")
	private List<ListLabel> lists = new ArrayList<>();

	@XStreamImplicit(itemFieldName = "map")
	private List<MapLabel> maps = new ArrayList<>();

	@XStreamImplicit(itemFieldName = "listMap")
	private List<ListMapLabel> listMaps = new ArrayList<>();

	@XStreamImplicit(itemFieldName = "mapList")
	private List<MapListLabel> mapLists = new ArrayList<>();
	
	
	public SheetLabel addList(ListLabel list){
		lists.add(list);
		return this;
	}

	public SheetLabel addMap(MapLabel map){
		maps.add(map);
		return this;
	}

	public SheetLabel addListMap(ListMapLabel listMap){
		listMaps.add(listMap);
		return this;
	}

	public SheetLabel addMapList(MapListLabel mapList){
		mapLists.add(mapList);
		return this;
	}
	
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

	public List<ListLabel> getLists() {
		return lists;
	}

	public void setLists(List<ListLabel> lists) {
		this.lists = lists;
	}

	public List<MapLabel> getMaps() {
		return maps;
	}

	public void setMaps(List<MapLabel> maps) {
		this.maps = maps;
	}

	public List<ListMapLabel> getListMaps() {
		return listMaps;
	}

	public void setListMaps(List<ListMapLabel> listMaps) {
		this.listMaps = listMaps;
	}

	public List<MapListLabel> getMapLists() {
		return mapLists;
	}

	public void setMapLists(List<MapListLabel> mapLists) {
		this.mapLists = mapLists;
	}

}
