package com.github.coderepositories.jcommons.tools.mgb.dbinfo;

import java.math.BigInteger;

/**
 * 数据库Collumn元数据 参考：MySQL information_schema.columns
 * 
 * @author zhangguangyong
 *
 *         2016年1月6日 下午4:34:20
 */
public class ColumnMetadata {
	private String tableCatalog;

	private String tableSchema;

	private String tableName;

	private String columnName;

	private BigInteger ordinalPosition;

	private String columnDefault;

	private String isNullable;

	private String dataType;

	private BigInteger characterMaximumLength;

	private BigInteger characterOctetLength;

	private BigInteger numericPrecision;

	private BigInteger numericScale;

	private BigInteger datetimePrecision;

	private String characterSetName;

	private String collationName;

	private String columnType;

	private String columnKey;

	private String extra;

	private String privileges;

	private String columnComment;

	public String getTableCatalog() {
		return tableCatalog;
	}

	public void setTableCatalog(String tableCatalog) {
		this.tableCatalog = tableCatalog;
	}

	public String getTableSchema() {
		return tableSchema;
	}

	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public BigInteger getOrdinalPosition() {
		return ordinalPosition;
	}

	public void setOrdinalPosition(BigInteger ordinalPosition) {
		this.ordinalPosition = ordinalPosition;
	}

	public String getColumnDefault() {
		return columnDefault;
	}

	public void setColumnDefault(String columnDefault) {
		this.columnDefault = columnDefault;
	}

	public String getIsNullable() {
		return isNullable;
	}

	public void setIsNullable(String isNullable) {
		this.isNullable = isNullable;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public BigInteger getCharacterMaximumLength() {
		return characterMaximumLength;
	}

	public void setCharacterMaximumLength(BigInteger characterMaximumLength) {
		this.characterMaximumLength = characterMaximumLength;
	}

	public BigInteger getCharacterOctetLength() {
		return characterOctetLength;
	}

	public void setCharacterOctetLength(BigInteger characterOctetLength) {
		this.characterOctetLength = characterOctetLength;
	}

	public BigInteger getNumericPrecision() {
		return numericPrecision;
	}

	public void setNumericPrecision(BigInteger numericPrecision) {
		this.numericPrecision = numericPrecision;
	}

	public BigInteger getNumericScale() {
		return numericScale;
	}

	public void setNumericScale(BigInteger numericScale) {
		this.numericScale = numericScale;
	}

	public BigInteger getDatetimePrecision() {
		return datetimePrecision;
	}

	public void setDatetimePrecision(BigInteger datetimePrecision) {
		this.datetimePrecision = datetimePrecision;
	}

	public String getCharacterSetName() {
		return characterSetName;
	}

	public void setCharacterSetName(String characterSetName) {
		this.characterSetName = characterSetName;
	}

	public String getCollationName() {
		return collationName;
	}

	public void setCollationName(String collationName) {
		this.collationName = collationName;
	}

	public String getColumnType() {
		return columnType;
	}

	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	public String getColumnKey() {
		return columnKey;
	}

	public void setColumnKey(String columnKey) {
		this.columnKey = columnKey;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getPrivileges() {
		return privileges;
	}

	public void setPrivileges(String privileges) {
		this.privileges = privileges;
	}

	public String getColumnComment() {
		return columnComment;
	}

	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}

}
