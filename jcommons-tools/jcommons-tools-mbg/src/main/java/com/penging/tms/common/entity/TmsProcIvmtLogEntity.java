package com.penging.tms.common.entity;

import java.util.Date;

public class TmsProcIvmtLogEntity {
    private Long codId;

    private String codProdNo;

    private String codIvmtNo;

    private Integer codThreads;

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

    public String getCodIvmtNo() {
        return codIvmtNo;
    }

    public void setCodIvmtNo(String codIvmtNo) {
        this.codIvmtNo = codIvmtNo;
    }

    public Integer getCodThreads() {
        return codThreads;
    }

    public void setCodThreads(Integer codThreads) {
        this.codThreads = codThreads;
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
}