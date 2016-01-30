package com.penging.tms.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TmsIvmtTrsfLogEntity {
    private Long codId;

    private String codIvmtNo;

    private String codOrigProdNo;

    private String codProdNo;

    private String codCustId;

    private String codAcctNo;

    private Date datTrsf;

    private Integer codProjUnit;

    private BigDecimal amtPerUnit;

    private Integer ctrTrsfPortion;

    private BigDecimal amtTrsf;

    private Date datTrsfStart;

    private Date datTrsfEnd;

    private BigDecimal amtPriincipal;

    private BigDecimal amtEstimate;

    private BigDecimal ctrAdjustRatio;

    private BigDecimal amtTrsfPer;

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

    public String getCodOrigProdNo() {
        return codOrigProdNo;
    }

    public void setCodOrigProdNo(String codOrigProdNo) {
        this.codOrigProdNo = codOrigProdNo;
    }

    public String getCodProdNo() {
        return codProdNo;
    }

    public void setCodProdNo(String codProdNo) {
        this.codProdNo = codProdNo;
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

    public Date getDatTrsf() {
        return datTrsf;
    }

    public void setDatTrsf(Date datTrsf) {
        this.datTrsf = datTrsf;
    }

    public Integer getCodProjUnit() {
        return codProjUnit;
    }

    public void setCodProjUnit(Integer codProjUnit) {
        this.codProjUnit = codProjUnit;
    }

    public BigDecimal getAmtPerUnit() {
        return amtPerUnit;
    }

    public void setAmtPerUnit(BigDecimal amtPerUnit) {
        this.amtPerUnit = amtPerUnit;
    }

    public Integer getCtrTrsfPortion() {
        return ctrTrsfPortion;
    }

    public void setCtrTrsfPortion(Integer ctrTrsfPortion) {
        this.ctrTrsfPortion = ctrTrsfPortion;
    }

    public BigDecimal getAmtTrsf() {
        return amtTrsf;
    }

    public void setAmtTrsf(BigDecimal amtTrsf) {
        this.amtTrsf = amtTrsf;
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

    public BigDecimal getAmtPriincipal() {
        return amtPriincipal;
    }

    public void setAmtPriincipal(BigDecimal amtPriincipal) {
        this.amtPriincipal = amtPriincipal;
    }

    public BigDecimal getAmtEstimate() {
        return amtEstimate;
    }

    public void setAmtEstimate(BigDecimal amtEstimate) {
        this.amtEstimate = amtEstimate;
    }

    public BigDecimal getCtrAdjustRatio() {
        return ctrAdjustRatio;
    }

    public void setCtrAdjustRatio(BigDecimal ctrAdjustRatio) {
        this.ctrAdjustRatio = ctrAdjustRatio;
    }

    public BigDecimal getAmtTrsfPer() {
        return amtTrsfPer;
    }

    public void setAmtTrsfPer(BigDecimal amtTrsfPer) {
        this.amtTrsfPer = amtTrsfPer;
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