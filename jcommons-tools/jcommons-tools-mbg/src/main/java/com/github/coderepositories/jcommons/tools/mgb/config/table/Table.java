package com.github.coderepositories.jcommons.tools.mgb.config.table;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("table")
public class Table {
	@XStreamAsAttribute
	private String tableName;
	
	@XStreamAsAttribute
	private String schema;
	
	@XStreamAsAttribute
	private String catalog;

	@XStreamAsAttribute
	private String alias;
	
	@XStreamAsAttribute
	private String domainObjectName;
	
	@XStreamAsAttribute
	private String enableInsert;
	
	@XStreamAsAttribute
	private String enableSelectByExample;
	
	@XStreamAsAttribute
	private String enableUpdateByPrimaryKey;
	
	@XStreamAsAttribute
	private String enableDeleteByPrimaryKey;
	
	@XStreamAsAttribute
	private String enableDeleteByExample;
	
	@XStreamAsAttribute
	private String enableCountByExample;
	
	@XStreamAsAttribute
	private String enableUpdateByExample;
	
	@XStreamAsAttribute
	private String selectByPrimaryKeyQueryId;
	
	@XStreamAsAttribute
	private String selectByExampleQueryId;
	
	@XStreamAsAttribute
	private String modelType;
	
	@XStreamAsAttribute
	private String escapeWildcards;
	
	@XStreamAsAttribute
	private String delimitIdentifiers;
	
	@XStreamAsAttribute
	private String delimitAllColumns;
	
	private GeneratedKey generatedKey;
	
	private ColumnOverride columnOverride;
	
	private IgnoreColumn ignoreColumn;
	
	private ColumnRenamingRule columnRenamingRule;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getDomainObjectName() {
		return domainObjectName;
	}

	public void setDomainObjectName(String domainObjectName) {
		this.domainObjectName = domainObjectName;
	}

	public String getEnableInsert() {
		return enableInsert;
	}

	public void setEnableInsert(String enableInsert) {
		this.enableInsert = enableInsert;
	}

	public String getEnableSelectByExample() {
		return enableSelectByExample;
	}

	public void setEnableSelectByExample(String enableSelectByExample) {
		this.enableSelectByExample = enableSelectByExample;
	}

	public String getEnableUpdateByPrimaryKey() {
		return enableUpdateByPrimaryKey;
	}

	public void setEnableUpdateByPrimaryKey(String enableUpdateByPrimaryKey) {
		this.enableUpdateByPrimaryKey = enableUpdateByPrimaryKey;
	}

	public String getEnableDeleteByPrimaryKey() {
		return enableDeleteByPrimaryKey;
	}

	public void setEnableDeleteByPrimaryKey(String enableDeleteByPrimaryKey) {
		this.enableDeleteByPrimaryKey = enableDeleteByPrimaryKey;
	}

	public String getEnableDeleteByExample() {
		return enableDeleteByExample;
	}

	public void setEnableDeleteByExample(String enableDeleteByExample) {
		this.enableDeleteByExample = enableDeleteByExample;
	}

	public String getEnableCountByExample() {
		return enableCountByExample;
	}

	public void setEnableCountByExample(String enableCountByExample) {
		this.enableCountByExample = enableCountByExample;
	}

	public String getEnableUpdateByExample() {
		return enableUpdateByExample;
	}

	public void setEnableUpdateByExample(String enableUpdateByExample) {
		this.enableUpdateByExample = enableUpdateByExample;
	}

	public String getSelectByPrimaryKeyQueryId() {
		return selectByPrimaryKeyQueryId;
	}

	public void setSelectByPrimaryKeyQueryId(String selectByPrimaryKeyQueryId) {
		this.selectByPrimaryKeyQueryId = selectByPrimaryKeyQueryId;
	}

	public String getSelectByExampleQueryId() {
		return selectByExampleQueryId;
	}

	public void setSelectByExampleQueryId(String selectByExampleQueryId) {
		this.selectByExampleQueryId = selectByExampleQueryId;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getEscapeWildcards() {
		return escapeWildcards;
	}

	public void setEscapeWildcards(String escapeWildcards) {
		this.escapeWildcards = escapeWildcards;
	}

	public String getDelimitIdentifiers() {
		return delimitIdentifiers;
	}

	public void setDelimitIdentifiers(String delimitIdentifiers) {
		this.delimitIdentifiers = delimitIdentifiers;
	}

	public String getDelimitAllColumns() {
		return delimitAllColumns;
	}

	public void setDelimitAllColumns(String delimitAllColumns) {
		this.delimitAllColumns = delimitAllColumns;
	}

	public GeneratedKey getGeneratedKey() {
		return generatedKey;
	}

	public void setGeneratedKey(GeneratedKey generatedKey) {
		this.generatedKey = generatedKey;
	}

	public ColumnOverride getColumnOverride() {
		return columnOverride;
	}

	public void setColumnOverride(ColumnOverride columnOverride) {
		this.columnOverride = columnOverride;
	}

	public IgnoreColumn getIgnoreColumn() {
		return ignoreColumn;
	}

	public void setIgnoreColumn(IgnoreColumn ignoreColumn) {
		this.ignoreColumn = ignoreColumn;
	}

	public ColumnRenamingRule getColumnRenamingRule() {
		return columnRenamingRule;
	}

	public void setColumnRenamingRule(ColumnRenamingRule columnRenamingRule) {
		this.columnRenamingRule = columnRenamingRule;
	}
}
