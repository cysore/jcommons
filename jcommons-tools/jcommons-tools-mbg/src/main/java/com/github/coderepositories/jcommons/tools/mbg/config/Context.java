package com.github.coderepositories.jcommons.tools.mbg.config;

import java.util.List;

import com.github.coderepositories.jcommons.tools.mbg.config.table.Table;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("context")
public class Context {
	@XStreamAsAttribute
	private String id;

	@XStreamAsAttribute
	private String targetRuntime;

	@XStreamAsAttribute
	private String defaultModelType;

	private CommentGenerator commentGenerator;

	private JdbcConnection jdbcConnection;

	private JavaTypeResolver javaTypeResolver;

	private JavaModelGenerator javaModelGenerator;

	private SqlMapGenerator sqlMapGenerator;

	private JavaClientGenerator javaClientGenerator;

	@XStreamImplicit(itemFieldName = "table")
	private List<Table> tables;

	public CommentGenerator getCommentGenerator() {
		return commentGenerator;
	}

	public void setCommentGenerator(CommentGenerator commentGenerator) {
		this.commentGenerator = commentGenerator;
	}

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	public JavaTypeResolver getJavaTypeResolver() {
		return javaTypeResolver;
	}

	public void setJavaTypeResolver(JavaTypeResolver javaTypeResolver) {
		this.javaTypeResolver = javaTypeResolver;
	}

	public JavaModelGenerator getJavaModelGenerator() {
		return javaModelGenerator;
	}

	public void setJavaModelGenerator(JavaModelGenerator javaModelGenerator) {
		this.javaModelGenerator = javaModelGenerator;
	}

	public SqlMapGenerator getSqlMapGenerator() {
		return sqlMapGenerator;
	}

	public void setSqlMapGenerator(SqlMapGenerator sqlMapGenerator) {
		this.sqlMapGenerator = sqlMapGenerator;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTargetRuntime() {
		return targetRuntime;
	}

	public void setTargetRuntime(String targetRuntime) {
		this.targetRuntime = targetRuntime;
	}

	public String getDefaultModelType() {
		return defaultModelType;
	}

	public void setDefaultModelType(String defaultModelType) {
		this.defaultModelType = defaultModelType;
	}

	public JavaClientGenerator getJavaClientGenerator() {
		return javaClientGenerator;
	}

	public void setJavaClientGenerator(JavaClientGenerator javaClientGenerator) {
		this.javaClientGenerator = javaClientGenerator;
	}

	public List<Table> getTables() {
		return tables;
	}

	public void setTables(List<Table> tables) {
		this.tables = tables;
	}

}
