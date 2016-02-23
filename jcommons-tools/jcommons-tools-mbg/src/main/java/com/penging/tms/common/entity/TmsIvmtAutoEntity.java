package com.penging.tms.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TmsIvmtAutoEntity {
    private Long codId;

    private String codCustCode;

    private BigDecimal amtAutobid;

    private BigDecimal amtMinBalance;

    private BigDecimal ctrMinProfit;

    private BigDecimal ctrMaxProfit;

    private Date ctrStartReserveDate;

    private Date ctrEndReserveDate;

    private Integer codProdType;

    private String flgActivate;

    private String flgUseVc;

    private Integer ctrLoanTermMin;

    private Integer ctrLoanTermMax;

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

    public String getCodCustCode() {
        return codCustCode;
    }

    public void setCodCustCode(String codCustCode) {
        this.codCustCode = codCustCode;
    }

    public BigDecimal getAmtAutobid() {
        return amtAutobid;
    }

    public void setAmtAutobid(BigDecimal amtAutobid) {
        this.amtAutobid = amtAutobid;
    }

    public BigDecimal getAmtMinBalance() {
        return amtMinBalance;
    }

    public void setAmtMinBalance(BigDecimal amtMinBalance) {
        this.amtMinBalance = amtMinBalance;
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

    public Integer getCodProdType() {
        return codProdType;
    }

    public void setCodProdType(Integer codProdType) {
        this.codProdType = codProdType;
    }

    public String getFlgActivate() {
        return flgActivate;
    }

    public void setFlgActivate(String flgActivate) {
        this.flgActivate = flgActivate;
    }

    public String getFlgUseVc() {
        return flgUseVc;
    }

    public void setFlgUseVc(String flgUseVc) {
        this.flgUseVc = flgUseVc;
    }

    public Integer getCtrLoanTermMin() {
        return ctrLoanTermMin;
    }

    public void setCtrLoanTermMin(Integer ctrLoanTermMin) {
        this.ctrLoanTermMin = ctrLoanTermMin;
    }

    public Integer getCtrLoanTermMax() {
        return ctrLoanTermMax;
    }

    public void setCtrLoanTermMax(Integer ctrLoanTermMax) {
        this.ctrLoanTermMax = ctrLoanTermMax;
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