package com.github.coderepositories.jcommons.datatransfer.excel.configuration;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("resource")
public class ResourceLabel {

	@XStreamAlias("class")
	@XStreamAsAttribute
	private String cls;

	@XStreamAsAttribute
	private String file;

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

}
