package com.penging.tms.common.entity;

import java.util.Date;

public class TmsProcControlEntity {
    private Long codId;

    private String codProcessId;

    private String txtProcessName;

    private String codProcessClass;

    private Integer codProcessType;

    private Integer codProcessSeq;

    private Integer codProcessFreq;

    private Integer codThreads;

    private Integer codHandle;

    private Integer codNumCommit;

    private String codProcessStatus;

    private Date datLastProcess;

    private Date datProcess;

    private Date datNextProcess;

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

    public String getCodProcessId() {
        return codProcessId;
    }

    public void setCodProcessId(String codProcessId) {
        this.codProcessId = codProcessId;
    }

    public String getTxtProcessName() {
        return txtProcessName;
    }

    public void setTxtProcessName(String txtProcessName) {
        this.txtProcessName = txtProcessName;
    }

    public String getCodProcessClass() {
        return codProcessClass;
    }

    public void setCodProcessClass(String codProcessClass) {
        this.codProcessClass = codProcessClass;
    }

    public Integer getCodProcessType() {
        return codProcessType;
    }

    public void setCodProcessType(Integer codProcessType) {
        this.codProcessType = codProcessType;
    }

    public Integer getCodProcessSeq() {
        return codProcessSeq;
    }

    public void setCodProcessSeq(Integer codProcessSeq) {
        this.codProcessSeq = codProcessSeq;
    }

    public Integer getCodProcessFreq() {
        return codProcessFreq;
    }

    public void setCodProcessFreq(Integer codProcessFreq) {
        this.codProcessFreq = codProcessFreq;
    }

    public Integer getCodThreads() {
        return codThreads;
    }

    public void setCodThreads(Integer codThreads) {
        this.codThreads = codThreads;
    }

    public Integer getCodHandle() {
        return codHandle;
    }

    public void setCodHandle(Integer codHandle) {
        this.codHandle = codHandle;
    }

    public Integer getCodNumCommit() {
        return codNumCommit;
    }

    public void setCodNumCommit(Integer codNumCommit) {
        this.codNumCommit = codNumCommit;
    }

    public String getCodProcessStatus() {
        return codProcessStatus;
    }

    public void setCodProcessStatus(String codProcessStatus) {
        this.codProcessStatus = codProcessStatus;
    }

    public Date getDatLastProcess() {
        return datLastProcess;
    }

    public void setDatLastProcess(Date datLastProcess) {
        this.datLastProcess = datLastProcess;
    }

    public Date getDatProcess() {
        return datProcess;
    }

    public void setDatProcess(Date datProcess) {
        this.datProcess = datProcess;
    }

    public Date getDatNextProcess() {
        return datNextProcess;
    }

    public void setDatNextProcess(Date datNextProcess) {
        this.datNextProcess = datNextProcess;
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