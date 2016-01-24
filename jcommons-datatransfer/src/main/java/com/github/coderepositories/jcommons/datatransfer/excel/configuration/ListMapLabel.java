package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("listMap")
public class ListMapLabel extends PropertyLabel {

	private HeadLabel head;

	public HeadLabel getHead() {
		return head;
	}

	public void setHead(HeadLabel head) {
		this.head = head;
	}

}
