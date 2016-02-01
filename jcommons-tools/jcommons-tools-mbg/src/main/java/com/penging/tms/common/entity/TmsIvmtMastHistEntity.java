package com.penging.tms.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TmsIvmtMastHistEntity {
    private Long codId;

    private String codIvmtNo;

    private String codProdNo;

    private Integer codIvmtType;

    private Integer codProdUnit;

    private BigDecimal codIvmtPropotion;

    private Integer codIvmtUnit;

    private BigDecimal amtDistribution;

    private BigDecimal amtIvmtTotal;

    private BigDecimal amtIvmtPrincipal;

    private BigDecimal amtReceivePrincipal;

    private BigDecimal amtProfitExpect;

    private BigDecimal amtTotalEstimate;

    private BigDecimal amtProfitActual;

    private BigDecimal amtProfitAdditional;

    private BigDecimal amtServiceCharge;

    private BigDecimal amtProfitAdjust;

    private Date amtAdjust;

    private BigDecimal amtProfitRecover;

    private BigDecimal amtSumExtraSource;

    private BigDecimal amtRatSumExtraSource;

    private BigDecimal amtTransfer;

    private BigDecimal amtTrade;

    private String codCustId;

    private String codAcctNo;

    private Date datIvmt;

    private Integer codTrsfPortion;

    private Integer codTradePortion;

    private Integer codTrsfCount;

    private Integer codFreezeNo;

    private Date datCalculation;

    private Date datDistribution;

    private String codChannelId;

    private String codUserRef;

    private String codTxnRef;

    private Date datCreate;

    private String codCreateUser;

    private String codCreateOrg;

    private Date datModify;

    private String codModifyUser;

    private String codModifyOrg;

    private Integer ctrUpdateSrlno;

    private String flgDisburse;

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

    public String getCodProdNo() {
        return codProdNo;
    }

    public void setCodProdNo(String codProdNo) {
        this.codProdNo = codProdNo;
    }

    public Integer getCodIvmtType() {
        return codIvmtType;
    }

    public void setCodIvmtType(Integer codIvmtType) {
        this.codIvmtType = codIvmtType;
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

    public BigDecimal getAmtDistribution() {
        return amtDistribution;
    }

    public void setAmtDistribution(BigDecimal amtDistribution) {
        this.amtDistribution = amtDistribution;
    }

    public BigDecimal getAmtIvmtTotal() {
        return amtIvmtTotal;
    }

    public void setAmtIvmtTotal(BigDecimal amtIvmtTotal) {
        this.amtIvmtTotal = amtIvmtTotal;
    }

    public BigDecimal getAmtIvmtPrincipal() {
        return amtIvmtPrincipal;
    }

    public void setAmtIvmtPrincipal(BigDecimal amtIvmtPrincipal) {
        this.amtIvmtPrincipal = amtIvmtPrincipal;
    }

    public BigDecimal getAmtReceivePrincipal() {
        return amtReceivePrincipal;
    }

    public void setAmtReceivePrincipal(BigDecimal amtReceivePrincipal) {
        this.amtReceivePrincipal = amtReceivePrincipal;
    }

    public BigDecimal getAmtProfitExpect() {
        return amtProfitExpect;
    }

    public void setAmtProfitExpect(BigDecimal amtProfitExpect) {
        this.amtProfitExpect = amtProfitExpect;
    }

    public BigDecimal getAmtTotalEstimate() {
        return amtTotalEstimate;
    }

    public void setAmtTotalEstimate(BigDecimal amtTotalEstimate) {
        this.amtTotalEstimate = amtTotalEstimate;
    }

    public BigDecimal getAmtProfitActual() {
        return amtProfitActual;
    }

    public void setAmtProfitActual(BigDecimal amtProfitActual) {
        this.amtProfitActual = amtProfitActual;
    }

    public BigDecimal getAmtProfitAdditional() {
        return amtProfitAdditional;
    }

    public void setAmtProfitAdditional(BigDecimal amtProfitAdditional) {
        this.amtProfitAdditional = amtProfitAdditional;
    }

    public BigDecimal getAmtServiceCharge() {
        return amtServiceCharge;
    }

    public void setAmtServiceCharge(BigDecimal amtServiceCharge) {
        this.amtServiceCharge = amtServiceCharge;
    }

    public BigDecimal getAmtProfitAdjust() {
        return amtProfitAdjust;
    }

    public void setAmtProfitAdjust(BigDecimal amtProfitAdjust) {
        this.amtProfitAdjust = amtProfitAdjust;
    }

    public Date getAmtAdjust() {
        return amtAdjust;
    }

    public void setAmtAdjust(Date amtAdjust) {
        this.amtAdjust = amtAdjust;
    }

    public BigDecimal getAmtProfitRecover() {
        return amtProfitRecover;
    }

    public void setAmtProfitRecover(BigDecimal amtProfitRecover) {
        this.amtProfitRecover = amtProfitRecover;
    }

    public BigDecimal getAmtSumExtraSource() {
        return amtSumExtraSource;
    }

    public void setAmtSumExtraSource(BigDecimal amtSumExtraSource) {
        this.amtSumExtraSource = amtSumExtraSource;
    }

    public BigDecimal getAmtRatSumExtraSource() {
        return amtRatSumExtraSource;
    }

    public void setAmtRatSumExtraSource(BigDecimal amtRatSumExtraSource) {
        this.amtRatSumExtraSource = amtRatSumExtraSource;
    }

    public BigDecimal getAmtTransfer() {
        return amtTransfer;
    }

    public void setAmtTransfer(BigDecimal amtTransfer) {
        this.amtTransfer = amtTransfer;
    }

    public BigDecimal getAmtTrade() {
        return amtTrade;
    }

    public void setAmtTrade(BigDecimal amtTrade) {
        this.amtTrade = amtTrade;
    }

    public String getCodCustId() {
        return codCustId;
    }

    public void setCodCustId(String codCustId) {
        this.codCustId = codCustId;
    }

    public String getCodAcctNo() {
        return codAcctNo;
    }

    public void setCodAcctNo(String codAcctNo) {
        this.codAcctNo = codAcctNo;
    }

    public Date getDatIvmt() {
        return datIvmt;
    }

    public void setDatIvmt(Date datIvmt) {
        this.datIvmt = datIvmt;
    }

    public Integer getCodTrsfPortion() {
        return codTrsfPortion;
    }

    public void setCodTrsfPortion(Integer codTrsfPortion) {
        this.codTrsfPortion = codTrsfPortion;
    }

    public Integer getCodTradePortion() {
        return codTradePortion;
    }

    public void setCodTradePortion(Integer codTradePortion) {
        this.codTradePortion = codTradePortion;
    }

    public Integer getCodTrsfCount() {
        return codTrsfCount;
    }

    public void setCodTrsfCount(Integer codTrsfCount) {
        this.codTrsfCount = codTrsfCount;
    }

    public Integer getCodFreezeNo() {
        return codFreezeNo;
    }

    public void setCodFreezeNo(Integer codFreezeNo) {
        this.codFreezeNo = codFreezeNo;
    }

    public Date getDatCalculation() {
        return datCalculation;
    }

    public void setDatCalculation(Date datCalculation) {
        this.datCalculation = datCalculation;
    }

    public Date getDatDistribution() {
        return datDistribution;
    }

    public void setDatDistribution(Date datDistribution) {
        this.datDistribution = datDistribution;
    }

    public String getCodChannelId() {
        return codChannelId;
    }

    public void setCodChannelId(String codChannelId) {
        this.codChannelId = codChannelId;
    }

    public String getCodUserRef() {
        return codUserRef;
    }

    public void setCodUserRef(String codUserRef) {
        this.codUserRef = codUserRef;
    }

    public String getCodTxnRef() {
        return codTxnRef;
    }

    public void setCodTxnRef(String codTxnRef) {
        this.codTxnRef = codTxnRef;
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

    public String getFlgDisburse() {
        return flgDisburse;
    }

    public void setFlgDisburse(String flgDisburse) {
        this.flgDisburse = flgDisburse;
    }
}