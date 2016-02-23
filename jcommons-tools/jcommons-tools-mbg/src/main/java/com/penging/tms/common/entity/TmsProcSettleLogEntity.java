package com.penging.tms.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TmsProcSettleLogEntity {
    private Long codId;

    private String codProcessNo;

    private String codProdNo;

    private String codIvmtNo;

    private Integer codPendingType;

    private String codCustIdOut;

    private String codAcctNoOut;

    private BigDecimal amtTxn;

    private String codCustIdIn;

    private String codAcctNoIn;

    private String codRefNo;

    private Integer codProcStatus;

    private String txtMessage;

    private String flgReversal;

    private Date datProcess;

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

    public String getCodProcessNo() {
        return codProcessNo;
    }

    public void setCodProcessNo(String codProcessNo) {
        this.codProcessNo = codProcessNo;
    }

    public String getCodProdNo() {
        return codProdNo;
    }

    public void setCodProdNo(String codProdNo) {
        this.codProdNo = codProdNo;
    }

    public String getCodIvmtNo() {
        return codIvmtNo;
    }

    public void setCodIvmtNo(String codIvmtNo) {
        this.codIvmtNo = codIvmtNo;
    }

    public Integer getCodPendingType() {
        return codPendingType;
    }

    public void setCodPendingType(Integer codPendingType) {
        this.codPendingType = codPendingType;
    }

    public String getCodCustIdOut() {
        return codCustIdOut;
    }

    public void setCodCustIdOut(String codCustIdOut) {
        this.codCustIdOut = codCustIdOut;
    }

    public String getCodAcctNoOut() {
        return codAcctNoOut;
    }

    public void setCodAcctNoOut(String codAcctNoOut) {
        this.codAcctNoOut = codAcctNoOut;
    }

    public BigDecimal getAmtTxn() {
        return amtTxn;
    }

    public void setAmtTxn(BigDecimal amtTxn) {
        this.amtTxn = amtTxn;
    }

    public String getCodCustIdIn() {
        return codCustIdIn;
    }

    public void setCodCustIdIn(String codCustIdIn) {
        this.codCustIdIn = codCustIdIn;
    }

    public String getCodAcctNoIn() {
        return codAcctNoIn;
    }

    public void setCodAcctNoIn(String codAcctNoIn) {
        this.codAcctNoIn = codAcctNoIn;
    }

    public String getCodRefNo() {
        return codRefNo;
    }

    public void setCodRefNo(String codRefNo) {
        this.codRefNo = codRefNo;
    }

    public Integer getCodProcStatus() {
        return codProcStatus;
    }

    public void setCodProcStatus(Integer codProcStatus) {
        this.codProcStatus = codProcStatus;
    }

    public String getTxtMessage() {
        return txtMessage;
    }

    public void setTxtMessage(String txtMessage) {
        this.txtMessage = txtMessage;
    }

    public String getFlgReversal() {
        return flgReversal;
    }

    public void setFlgReversal(String flgReversal) {
        this.flgReversal = flgReversal;
    }

    public Date getDatProcess() {
        return datProcess;
    }

    public void setDatProcess(Date datProcess) {
        this.datProcess = datProcess;
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