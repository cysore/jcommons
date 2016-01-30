package com.github.coderepositories.jcommons.tools.mgb.config;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("jdbcConnection")
public class JdbcConnection {
	@XStreamAsAttribute
	private String driverClass;

	@XStreamAsAttribute
	private String connectionURL;

	@XStreamAsAttribute
	private String userId;

	@XStreamAsAttribute
	private String password;

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getConnectionURL() {
		return connectionURL;
	}

	public void setConnectionURL(String connectionURL) {
		this.connectionURL = connectionURL;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
