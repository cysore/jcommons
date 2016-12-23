package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class ExcelData {
	
	// list数据
	private List listDatas;
	
	// listMap数据
	private List listMapDatas;
	
	// map数据
	private List<Map> mapDatas;
	
	// mapList数据
	private Map mapListDatas;
	
	public ExcelData addListData(List listData){
		listDatas.add(listData);
		return this;
	}

	public ExcelData addMapData(Map mapData){
		mapDatas.add(mapData);
		return this;
	}

	public ExcelData addListMapData(List<Map> listMapData){
		listMapDatas.add(listMapData);
		return this;
	}

	public List getListDatas() {
		return listDatas;
	}

	public void setListDatas(List listDatas) {
		this.listDatas = listDatas;
	}

	public List getListMapDatas() {
		return listMapDatas;
	}

	public void setListMapDatas(List listMapDatas) {
		this.listMapDatas = listMapDatas;
	}

	public List<Map> getMapDatas() {
		return mapDatas;
	}

	public void setMapDatas(List<Map> mapDatas) {
		this.mapDatas = mapDatas;
	}

	public Map getMapListDatas() {
		return mapListDatas;
	}

	public void setMapListDatas(Map mapListDatas) {
		this.mapListDatas = mapListDatas;
	}
	
	
	
	
}
