package com.penging.tms.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TmsProdMastLogEntity {
    private Long codId;

    private String codProdNo;

    private String codTemplateNo;

    private String codExternProdNo;

    private String codOrigProdNo;

    private String codIvmtNo;

    private String txtProdSource;

    private Integer codProdUnit;

    private BigDecimal amtProd;

    private BigDecimal amtProdRest;

    private BigDecimal amtPerUnit;

    private Integer codNumberUnit;

    private Integer codProdRestUnit;

    private BigDecimal amtProdBreak;

    private String codProdCurrency;

    private Integer codProdCategory;

    private Integer codProdStatus;

    private Integer codProdSupport;

    private String codHolderNo;

    private String txtHolderName;

    private Date datPlanStart;

    private Date datPlanEnd;

    private Date datAcctualStart;

    private Date datAcctualEnd;

    private Integer codProdSearchTerm;

    private Integer codStopType;

    private String txtTag;

    private Integer codProcMantissa;

    private String flgTransferAllow;

    private Integer codCouponAllow;

    private BigDecimal ctrTrsfRatioMax;

    private BigDecimal ctrTrsfRatioMin;

    private BigDecimal ctrRatioMinLimit;

    private BigDecimal ctrRatioMaxLimit;

    private BigDecimal amtIvmtMin;

    private BigDecimal amtIvmtMax;

    private Date datReserveStart;

    private Date datReserveEnd;

    private BigDecimal amtReserveMax;

    private BigDecimal amtReserveCustLimit;

    private Date datAutoStart;

    private Date datAutoEnd;

    private Date datVipStart;

    private Date datVipEnd;

    private BigDecimal amtVipMax;

    private BigDecimal amtVipCustLimit;

    private Date datTrsfStart;

    private Date datTrsfEnd;

    private Integer codApplyUserType;

    private String flgSpecifyUsers;

    private Date datShow;

    private BigDecimal codAnnualRate;

    private BigDecimal amtProdProfit;

    private BigDecimal amtProdCharge;

    private Integer codCompToday;

    private Integer codCompTotally;

    private Date datLastProcess;

    private Date datNextProcess;

    private Date datLastCharge;

    private Date datNextCharge;

    private String flgPrincipalization;

    private Date datCreate;

    private String codCreateUser;

    private String codCreateOrg;

    private Date datModify;

    private String codModifyUser;

    private String codModifyOrg;

    private Integer ctrUpdateSrlno;

    private BigDecimal amtAdjust;

    private BigDecimal codAdjustRatio;

    private String codBreakHoldNo;

    private String codAcctGuarantee;

    private Integer codProfitMethod;

    private String flgLoadHandled;

    private String txtSpecifyUsers;

    private String txtProdInfo;

    public Long getCodId() {
        return codId;
    }

    public void setCodId(Long codId) {
        this.codId = codId;
    }

    public String getCodProdNo() {
        return codProdNo;
    }

    public void setCodProdNo(String codProdNo) {
        this.codProdNo = codProdNo;
    }

    public String getCodTemplateNo() {
        return codTemplateNo;
    }

    public void setCodTemplateNo(String codTemplateNo) {
        this.codTemplateNo = codTemplateNo;
    }

    public String getCodExternProdNo() {
        return codExternProdNo;
    }

    public void setCodExternProdNo(String codExternProdNo) {
        this.codExternProdNo = codExternProdNo;
    }

    public String getCodOrigProdNo() {
        return codOrigProdNo;
    }

    public void setCodOrigProdNo(String codOrigProdNo) {
        this.codOrigProdNo = codOrigProdNo;
    }

    public String getCodIvmtNo() {
        return codIvmtNo;
    }

    public void setCodIvmtNo(String codIvmtNo) {
        this.codIvmtNo = codIvmtNo;
    }

    public String getTxtProdSource() {
        return txtProdSource;
    }

    public void setTxtProdSource(String txtProdSource) {
        this.txtProdSource = txtProdSource;
    }

    public Integer getCodProdUnit() {
        return codProdUnit;
    }

    public void setCodProdUnit(Integer codProdUnit) {
        this.codProdUnit = codProdUnit;
    }

    public BigDecimal getAmtProd() {
        return amtProd;
    }

    public void setAmtProd(BigDecimal amtProd) {
        this.amtProd = amtProd;
    }

    public BigDecimal getAmtProdRest() {
        return amtProdRest;
    }

    public void setAmtProdRest(BigDecimal amtProdRest) {
        this.amtProdRest = amtProdRest;
    }

    public BigDecimal getAmtPerUnit() {
        return amtPerUnit;
    }

    public void setAmtPerUnit(BigDecimal amtPerUnit) {
        this.amtPerUnit = amtPerUnit;
    }

    public Integer getCodNumberUnit() {
        return codNumberUnit;
    }

    public void setCodNumberUnit(Integer codNumberUnit) {
        this.codNumberUnit = codNumberUnit;
    }

    public Integer getCodProdRestUnit() {
        return codProdRestUnit;
    }

    public void setCodProdRestUnit(Integer codProdRestUnit) {
        this.codProdRestUnit = codProdRestUnit;
    }

    public BigDecimal getAmtProdBreak() {
        return amtProdBreak;
    }

    public void setAmtProdBreak(BigDecimal amtProdBreak) {
        this.amtProdBreak = amtProdBreak;
    }

    public String getCodProdCurrency() {
        return codProdCurrency;
    }

    public void setCodProdCurrency(String codProdCurrency) {
        this.codProdCurrency = codProdCurrency;
    }

    public Integer getCodProdCategory() {
        return codProdCategory;
    }

    public void setCodProdCategory(Integer codProdCategory) {
        this.codProdCategory = codProdCategory;
    }

    public Integer getCodProdStatus() {
        return codProdStatus;
    }

    public void setCodProdStatus(Integer codProdStatus) {
        this.codProdStatus = codProdStatus;
    }

    public Integer getCodProdSupport() {
        return codProdSupport;
    }

    public void setCodProdSupport(Integer codProdSupport) {
        this.codProdSupport = codProdSupport;
    }

    public String getCodHolderNo() {
        return codHolderNo;
    }

    public void setCodHolderNo(String codHolderNo) {
        this.codHolderNo = codHolderNo;
    }

    public String getTxtHolderName() {
        return txtHolderName;
    }

    public void setTxtHolderName(String txtHolderName) {
        this.txtHolderName = txtHolderName;
    }

    public Date getDatPlanStart() {
        return datPlanStart;
    }

    public void setDatPlanStart(Date datPlanStart) {
        this.datPlanStart = datPlanStart;
    }

    public Date getDatPlanEnd() {
        return datPlanEnd;
    }

    public void setDatPlanEnd(Date datPlanEnd) {
        this.datPlanEnd = datPlanEnd;
    }

    public Date getDatAcctualStart() {
        return datAcctualStart;
    }

    public void setDatAcctualStart(Date datAcctualStart) {
        this.datAcctualStart = datAcctualStart;
    }

    public Date getDatAcctualEnd() {
        return datAcctualEnd;
    }

    public void setDatAcctualEnd(Date datAcctualEnd) {
        this.datAcctualEnd = datAcctualEnd;
    }

    public Integer getCodProdSearchTerm() {
        return codProdSearchTerm;
    }

    public void setCodProdSearchTerm(Integer codProdSearchTerm) {
        this.codProdSearchTerm = codProdSearchTerm;
    }

    public Integer getCodStopType() {
        return codStopType;
    }

    public void setCodStopType(Integer codStopType) {
        this.codStopType = codStopType;
    }

    public String getTxtTag() {
        return txtTag;
    }

    public void setTxtTag(String txtTag) {
        this.txtTag = txtTag;
    }

    public Integer getCodProcMantissa() {
        return codProcMantissa;
    }

    public void setCodProcMantissa(Integer codProcMantissa) {
        this.codProcMantissa = codProcMantissa;
    }

    public String getFlgTransferAllow() {
        return flgTransferAllow;
    }

    public void setFlgTransferAllow(String flgTransferAllow) {
        this.flgTransferAllow = flgTransferAllow;
    }

    public Integer getCodCouponAllow() {
        return codCouponAllow;
    }

    public void setCodCouponAllow(Integer codCouponAllow) {
        this.codCouponAllow = codCouponAllow;
    }

    public BigDecimal getCtrTrsfRatioMax() {
        return ctrTrsfRatioMax;
    }

    public void setCtrTrsfRatioMax(BigDecimal ctrTrsfRatioMax) {
        this.ctrTrsfRatioMax = ctrTrsfRatioMax;
    }

    public BigDecimal getCtrTrsfRatioMin() {
        return ctrTrsfRatioMin;
    }

    public void setCtrTrsfRatioMin(BigDecimal ctrTrsfRatioMin) {
        this.ctrTrsfRatioMin = ctrTrsfRatioMin;
    }

    public BigDecimal getCtrRatioMinLimit() {
        return ctrRatioMinLimit;
    }

    public void setCtrRatioMinLimit(BigDecimal ctrRatioMinLimit) {
        this.ctrRatioMinLimit = ctrRatioMinLimit;
    }

    public BigDecimal getCtrRatioMaxLimit() {
        return ctrRatioMaxLimit;
    }

    public void setCtrRatioMaxLimit(BigDecimal ctrRatioMaxLimit) {
        this.ctrRatioMaxLimit = ctrRatioMaxLimit;
    }

    public BigDecimal getAmtIvmtMin() {
        return amtIvmtMin;
    }

    public void setAmtIvmtMin(BigDecimal amtIvmtMin) {
        this.amtIvmtMin = amtIvmtMin;
    }

    public BigDecimal getAmtIvmtMax() {
        return amtIvmtMax;
    }

    public void setAmtIvmtMax(BigDecimal amtIvmtMax) {
        this.amtIvmtMax = amtIvmtMax;
    }

    public Date getDatReserveStart() {
        return datReserveStart;
    }

    public void setDatReserveStart(Date datReserveStart) {
        this.datReserveStart = datReserveStart;
    }

    public Date getDatReserveEnd() {
        return datReserveEnd;
    }

    public void setDatReserveEnd(Date datReserveEnd) {
        this.datReserveEnd = datReserveEnd;
    }

    public BigDecimal getAmtReserveMax() {
        return amtReserveMax;
    }

    public void setAmtReserveMax(BigDecimal amtReserveMax) {
        this.amtReserveMax = amtReserveMax;
    }

    public BigDecimal getAmtReserveCustLimit() {
        return amtReserveCustLimit;
    }

    public void setAmtReserveCustLimit(BigDecimal amtReserveCustLimit) {
        this.amtReserveCustLimit = amtReserveCustLimit;
    }

    public Date getDatAutoStart() {
        return datAutoStart;
    }

    public void setDatAutoStart(Date datAutoStart) {
        this.datAutoStart = datAutoStart;
    }

    public Date getDatAutoEnd() {
        return datAutoEnd;
    }

    public void setDatAutoEnd(Date datAutoEnd) {
        this.datAutoEnd = datAutoEnd;
    }

    public Date getDatVipStart() {
        return datVipStart;
    }

    public void setDatVipStart(Date datVipStart) {
        this.datVipStart = datVipStart;
    }

    public Date getDatVipEnd() {
        return datVipEnd;
    }

    public void setDatVipEnd(Date datVipEnd) {
        this.datVipEnd = datVipEnd;
    }

    public BigDecimal getAmtVipMax() {
        return amtVipMax;
    }

    public void setAmtVipMax(BigDecimal amtVipMax) {
        this.amtVipMax = amtVipMax;
    }

    public BigDecimal getAmtVipCustLimit() {
        return amtVipCustLimit;
    }

    public void setAmtVipCustLimit(BigDecimal amtVipCustLimit) {
        this.amtVipCustLimit = amtVipCustLimit;
    }

    public Date getDatTrsfStart() {
        return datTrsfStart;
    }

    public void setDatTrsfStart(Date datTrsfStart) {
        this.datTrsfStart = datTrsfStart;
    }

    public Date getDatTrsfEnd() {
        return datTrsfEnd;
    }

    public void setDatTrsfEnd(Date datTrsfEnd) {
        this.datTrsfEnd = datTrsfEnd;
    }

    public Integer getCodApplyUserType() {
        return codApplyUserType;
    }

    public void setCodApplyUserType(Integer codApplyUserType) {
        this.codApplyUserType = codApplyUserType;
    }

    public String getFlgSpecifyUsers() {
        return flgSpecifyUsers;
    }

    public void setFlgSpecifyUsers(String flgSpecifyUsers) {
        this.flgSpecifyUsers = flgSpecifyUsers;
    }

    public Date getDatShow() {
        return datShow;
    }

    public void setDatShow(Date datShow) {
        this.datShow = datShow;
    }

    public BigDecimal getCodAnnualRate() {
        return codAnnualRate;
    }

    public void setCodAnnualRate(BigDecimal codAnnualRate) {
        this.codAnnualRate = codAnnualRate;
    }

    public BigDecimal getAmtProdProfit() {
        return amtProdProfit;
    }

    public void setAmtProdProfit(BigDecimal amtProdProfit) {
        this.amtProdProfit = amtProdProfit;
    }

    public BigDecimal getAmtProdCharge() {
        return amtProdCharge;
    }

    public void setAmtProdCharge(BigDecimal amtProdCharge) {
        this.amtProdCharge = amtProdCharge;
    }

    public Integer getCodCompToday() {
        return codCompToday;
    }

    public void setCodCompToday(Integer codCompToday) {
        this.codCompToday = codCompToday;
    }

    public Integer getCodCompTotally() {
        return codCompTotally;
    }

    public void setCodCompTotally(Integer codCompTotally) {
        this.codCompTotally = codCompTotally;
    }

    public Date getDatLastProcess() {
        return datLastProcess;
    }

    public void setDatLastProcess(Date datLastProcess) {
        this.datLastProcess = datLastProcess;
    }

    public Date getDatNextProcess() {
        return datNextProcess;
    }

    public void setDatNextProcess(Date datNextProcess) {
        this.datNextProcess = datNextProcess;
    }

    public Date getDatLastCharge() {
        return datLastCharge;
    }

    public void setDatLastCharge(Date datLastCharge) {
        this.datLastCharge = datLastCharge;
    }

    public Date getDatNextCharge() {
        return datNextCharge;
    }

    public void setDatNextCharge(Date datNextCharge) {
        this.datNextCharge = datNextCharge;
    }

    public String getFlgPrincipalization() {
        return flgPrincipalization;
    }

    public void setFlgPrincipalization(String flgPrincipalization) {
        this.flgPrincipalization = flgPrincipalization;
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

    public BigDecimal getAmtAdjust() {
        return amtAdjust;
    }

    public void setAmtAdjust(BigDecimal amtAdjust) {
        this.amtAdjust = amtAdjust;
    }

    public BigDecimal getCodAdjustRatio() {
        return codAdjustRatio;
    }

    public void setCodAdjustRatio(BigDecimal codAdjustRatio) {
        this.codAdjustRatio = codAdjustRatio;
    }

    public String getCodBreakHoldNo() {
        return codBreakHoldNo;
    }

    public void setCodBreakHoldNo(String codBreakHoldNo) {
        this.codBreakHoldNo = codBreakHoldNo;
    }

    public String getCodAcctGuarantee() {
        return codAcctGuarantee;
    }

    public void setCodAcctGuarantee(String codAcctGuarantee) {
        this.codAcctGuarantee = codAcctGuarantee;
    }

    public Integer getCodProfitMethod() {
        return codProfitMethod;
    }

    public void setCodProfitMethod(Integer codProfitMethod) {
        this.codProfitMethod = codProfitMethod;
    }

    public String getFlgLoadHandled() {
        return flgLoadHandled;
    }

    public void setFlgLoadHandled(String flgLoadHandled) {
        this.flgLoadHandled = flgLoadHandled;
    }

    public String getTxtSpecifyUsers() {
        return txtSpecifyUsers;
    }

    public void setTxtSpecifyUsers(String txtSpecifyUsers) {
        this.txtSpecifyUsers = txtSpecifyUsers;
    }

    public String getTxtProdInfo() {
        return txtProdInfo;
    }

    public void setTxtProdInfo(String txtProdInfo) {
        this.txtProdInfo = txtProdInfo;
    }
}