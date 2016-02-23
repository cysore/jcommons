package com.penging.tms.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TmsIvmtProfitHistEntity {
    private Long codId;

    private String codIvmtNo;

    private String codAcctNo;

    private String codCustId;

    private Integer codProdUnit;

    private BigDecimal codIvmtPropotion;

    private Integer codIvmtUnit;

    private BigDecimal amtIvmt;

    private String codProfitClass;

    private BigDecimal amtProfit;

    private BigDecimal amtProfitCoupon;

    private Integer codProfitType;

    private Date datCompStart;

    private Date datCompEnd;

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

    public String getCodIvmtNo() {
        return codIvmtNo;
    }

    public void setCodIvmtNo(String codIvmtNo) {
        this.codIvmtNo = codIvmtNo;
    }

    public String getCodAcctNo() {
        return codAcctNo;
    }

    public void setCodAcctNo(String codAcctNo) {
        this.codAcctNo = codAcctNo;
    }

    public String getCodCustId() {
        return codCustId;
    }

    public void setCodCustId(String codCustId) {
        this.codCustId = codCustId;
    }

    public Integer getCodProdUnit() {
        return codProdUnit;
    }

    public void setCodProdUnit(Integer codProdUnit) {
        this.codProdUnit = codProdUnit;
    }

    public BigDecimal getCodIvmtPropotion() {
        return codIvmtPropotion;
    }

    public void setCodIvmtPropotion(BigDecimal codIvmtPropotion) {
        this.codIvmtPropotion = codIvmtPropotion;
    }

    public Integer getCodIvmtUnit() {
        return codIvmtUnit;
    }

    public void setCodIvmtUnit(Integer codIvmtUnit) {
        this.codIvmtUnit = codIvmtUnit;
    }

    public BigDecimal getAmtIvmt() {
        return amtIvmt;
    }

    public void setAmtIvmt(BigDecimal amtIvmt) {
        this.amtIvmt = amtIvmt;
    }

    public String getCodProfitClass() {
        return codProfitClass;
    }

    public void setCodProfitClass(String codProfitClass) {
        this.codProfitClass = codProfitClass;
    }

    public BigDecimal getAmtProfit() {
        return amtProfit;
    }

    public void setAmtProfit(BigDecimal amtProfit) {
        this.amtProfit = amtProfit;
    }

    public BigDecimal getAmtProfitCoupon() {
        return amtProfitCoupon;
    }

    public void setAmtProfitCoupon(BigDecimal amtProfitCoupon) {
        this.amtProfitCoupon = amtProfitCoupon;
    }

    public Integer getCodProfitType() {
        return codProfitType;
    }

    public void setCodProfitType(Integer codProfitType) {
        this.codProfitType = codProfitType;
    }

    public Date getDatCompStart() {
        return datCompStart;
    }

    public void setDatCompStart(Date datCompStart) {
        this.datCompStart = datCompStart;
    }

    public Date getDatCompEnd() {
        return datCompEnd;
    }

    public void setDatCompEnd(Date datCompEnd) {
        this.datCompEnd = datCompEnd;
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