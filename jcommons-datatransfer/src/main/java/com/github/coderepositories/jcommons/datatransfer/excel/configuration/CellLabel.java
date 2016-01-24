package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("cell")
public class CellLabel {

	@XStreamAsAttribute
	private Integer x;

	@XStreamAsAttribute
	private Integer y;

	@XStreamAsAttribute
	private Integer index;

	@XStreamAsAttribute
	private String key;

	@XStreamAsAttribute
	private Boolean multiSelect;

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Boolean getMultiSelect() {
		return multiSelect;
	}

	public void setMultiSelect(Boolean multiSelect) {
		this.multiSelect = multiSelect;
	}

}
