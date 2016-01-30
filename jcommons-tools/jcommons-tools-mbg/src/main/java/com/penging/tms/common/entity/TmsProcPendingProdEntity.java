package com.penging.tms.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TmsProcPendingProdEntity {
    private Long codId;

    private String codProcessNo;

    private String codTableName;

    private Date datProcess;

    private Integer codRecordType;

    private String txtMessage;

    private Date datCreate;

    private String codCreateUser;

    private String codCreateOrg;

    private Date datModify;

    private String codModifyUser;

    private String codModifyOrg;

    private Integer ctrUpdateSrlno;

    private String codLoanAccount;

    private String flgBreachAgreement;

    private BigDecimal amtProductProfit;

    private BigDecimal amtProductPrincipal;

    private BigDecimal amtOverduePenalty;

    private BigDecimal amtPrepaymentPenalty;

    private BigDecimal amtInterestIncome;

    private BigDecimal amtBaltimore;

    public Long getCodId() {
        return codId;
    }

    public void setCodId(Long codId) {
        this.codId = codId;
    }

    public String getCodProcessNo() {
        return codProcessNo;
    }

    public void setCodProcessNo(String codProcessNo) {
        this.codProcessNo = codProcessNo;
    }

    public String getCodTableName() {
        return codTableName;
    }

    public void setCodTableName(String codTableName) {
        this.codTableName = codTableName;
    }

    public Date getDatProcess() {
        return datProcess;
    }

    public void setDatProcess(Date datProcess) {
        this.datProcess = datProcess;
    }

    public Integer getCodRecordType() {
        return codRecordType;
    }

    public void setCodRecordType(Integer codRecordType) {
        this.codRecordType = codRecordType;
    }

    public String getTxtMessage() {
        return txtMessage;
    }

    public void setTxtMessage(String txtMessage) {
        this.txtMessage = txtMessage;
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

    public String getCodLoanAccount() {
        return codLoanAccount;
    }

    public void setCodLoanAccount(String codLoanAccount) {
        this.codLoanAccount = codLoanAccount;
    }

    public String getFlgBreachAgreement() {
        return flgBreachAgreement;
    }

    public void setFlgBreachAgreement(String flgBreachAgreement) {
        this.flgBreachAgreement = flgBreachAgreement;
    }

    public BigDecimal getAmtProductProfit() {
        return amtProductProfit;
    }

    public void setAmtProductProfit(BigDecimal amtProductProfit) {
        this.amtProductProfit = amtProductProfit;
    }

    public BigDecimal getAmtProductPrincipal() {
        return amtProductPrincipal;
    }

    public void setAmtProductPrincipal(BigDecimal amtProductPrincipal) {
        this.amtProductPrincipal = amtProductPrincipal;
    }

    public BigDecimal getAmtOverduePenalty() {
        return amtOverduePenalty;
    }

    public void setAmtOverduePenalty(BigDecimal amtOverduePenalty) {
        this.amtOverduePenalty = amtOverduePenalty;
    }

    public BigDecimal getAmtPrepaymentPenalty() {
        return amtPrepaymentPenalty;
    }

    public void setAmtPrepaymentPenalty(BigDecimal amtPrepaymentPenalty) {
        this.amtPrepaymentPenalty = amtPrepaymentPenalty;
    }

    public BigDecimal getAmtInterestIncome() {
        return amtInterestIncome;
    }

    public void setAmtInterestIncome(BigDecimal amtInterestIncome) {
        this.amtInterestIncome = amtInterestIncome;
    }

    public BigDecimal getAmtBaltimore() {
        return amtBaltimore;
    }

    public void setAmtBaltimore(BigDecimal amtBaltimore) {
        this.amtBaltimore = amtBaltimore;
    }
}