package com.penging.tms.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TmsIvmtAutoEntity {
    private Long codId;

    private String codReserveNo;

    private String codCustId;

    private Integer codProdCategory;

    private Integer codReserveType;

    private Integer codProdUnit;

    private Integer codReservePortion;

    private BigDecimal amtReserve;

    private BigDecimal ctrMinProfit;

    private BigDecimal ctrMaxProfit;

    private Integer ctrMinUnit;

    private Integer ctrMaxUnit;

    private BigDecimal ctrMinIvmtAmount;

    private BigDecimal ctrMaxIvmtAmount;

    private Date ctrStartProfitDate;

    private Date ctrEndProfitDate;

    private BigDecimal ctrMinBalance;

    private Date ctrStartReserveDate;

    private Date ctrEndReserveDate;

    private Date datCreate;

    private String codCreateUser;

    private String codCreateOrg;

    private Date datModify;

    private String codModifyUser;

    private String codModifyOrg;

    private Integer ctrUpdateSrlno;

    public Long getCodId() {
        return codId;
    }

    public void setCodId(Long codId) {
        this.codId = codId;
    }

    public String getCodReserveNo() {
        return codReserveNo;
    }

    public void setCodReserveNo(String codReserveNo) {
        this.codReserveNo = codReserveNo;
    }

    public String getCodCustId() {
        return codCustId;
    }

    public void setCodCustId(String codCustId) {
        this.codCustId = codCustId;
    }

    public Integer getCodProdCategory() {
        return codProdCategory;
    }

    public void setCodProdCategory(Integer codProdCategory) {
        this.codProdCategory = codProdCategory;
    }

    public Integer getCodReserveType() {
        return codReserveType;
    }

    public void setCodReserveType(Integer codReserveType) {
        this.codReserveType = codReserveType;
    }

    public Integer getCodProdUnit() {
        return codProdUnit;
    }

    public void setCodProdUnit(Integer codProdUnit) {
        this.codProdUnit = codProdUnit;
    }

    public Integer getCodReservePortion() {
        return codReservePortion;
    }

    public void setCodReservePortion(Integer codReservePortion) {
        this.codReservePortion = codReservePortion;
    }

    public BigDecimal getAmtReserve() {
        return amtReserve;
    }

    public void setAmtReserve(BigDecimal amtReserve) {
        this.amtReserve = amtReserve;
    }

    public BigDecimal getCtrMinProfit() {
        return ctrMinProfit;
    }

    public void setCtrMinProfit(BigDecimal ctrMinProfit) {
        this.ctrMinProfit = ctrMinProfit;
    }

    public BigDecimal getCtrMaxProfit() {
        return ctrMaxProfit;
    }

    public void setCtrMaxProfit(BigDecimal ctrMaxProfit) {
        this.ctrMaxProfit = ctrMaxProfit;
    }

    public Integer getCtrMinUnit() {
        return ctrMinUnit;
    }

    public void setCtrMinUnit(Integer ctrMinUnit) {
        this.ctrMinUnit = ctrMinUnit;
    }

    public Integer getCtrMaxUnit() {
        return ctrMaxUnit;
    }

    public void setCtrMaxUnit(Integer ctrMaxUnit) {
        this.ctrMaxUnit = ctrMaxUnit;
    }

    public BigDecimal getCtrMinIvmtAmount() {
        return ctrMinIvmtAmount;
    }

    public void setCtrMinIvmtAmount(BigDecimal ctrMinIvmtAmount) {
        this.ctrMinIvmtAmount = ctrMinIvmtAmount;
    }

    public BigDecimal getCtrMaxIvmtAmount() {
        return ctrMaxIvmtAmount;
    }

    public void setCtrMaxIvmtAmount(BigDecimal ctrMaxIvmtAmount) {
        this.ctrMaxIvmtAmount = ctrMaxIvmtAmount;
    }

    public Date getCtrStartProfitDate() {
        return ctrStartProfitDate;
    }

    public void setCtrStartProfitDate(Date ctrStartProfitDate) {
        this.ctrStartProfitDate = ctrStartProfitDate;
    }

    public Date getCtrEndProfitDate() {
        return ctrEndProfitDate;
    }

    public void setCtrEndProfitDate(Date ctrEndProfitDate) {
        this.ctrEndProfitDate = ctrEndProfitDate;
    }

    public BigDecimal getCtrMinBalance() {
        return ctrMinBalance;
    }

    public void setCtrMinBalance(BigDecimal ctrMinBalance) {
        this.ctrMinBalance = ctrMinBalance;
    }

    public Date getCtrStartReserveDate() {
        return ctrStartReserveDate;
    }

    public void setCtrStartReserveDate(Date ctrStartReserveDate) {
        this.ctrStartReserveDate = ctrStartReserveDate;
    }

    public Date getCtrEndReserveDate() {
        return ctrEndReserveDate;
    }

    public void setCtrEndReserveDate(Date ctrEndReserveDate) {
        this.ctrEndReserveDate = ctrEndReserveDate;
    }

    public Date getDatCreate() {
        return datCreate;
    }

    public void setDatCreate(Date datCreate) {
        this.datCreate = datCreate;
    }

    public String getCodCreateUser() {
        return codCreateUser;
    }

    public void setCodCreateUser(String codCreateUser) {
        this.codCreateUser = codCreateUser;
    }

    public String getCodCreateOrg() {
        return codCreateOrg;
    }

    public void setCodCreateOrg(String codCreateOrg) {
        this.codCreateOrg = codCreateOrg;
    }

    public Date getDatModify() {
        return datModify;
    }

    public void setDatModify(Date datModify) {
        this.datModify = datModify;
    }

    public String getCodModifyUser() {
        return codModifyUser;
    }

    public void setCodModifyUser(String codModifyUser) {
        this.codModifyUser = codModifyUser;
    }

    public String getCodModifyOrg() {
        return codModifyOrg;
    }

    public void setCodModifyOrg(String codModifyOrg) {
        this.codModifyOrg = codModifyOrg;
    }

    public Integer getCtrUpdateSrlno() {
        return ctrUpdateSrlno;
    }

    public void setCtrUpdateSrlno(Integer ctrUpdateSrlno) {
        this.ctrUpdateSrlno = ctrUpdateSrlno;
    }
}