package com.penging.tms.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TmsIvmtAmountXrefEntity {
    private Long codId;

    private String codIvmtNo;

    private Integer codCouponType;

    private String codCouponNo;

    private String txtCouponName;

    private BigDecimal amtUsed;

    private Date datApply;

    private String codCouponUsedno;

    private BigDecimal ctrEffectRate;

    private String codIconNo;

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

    public Integer getCodCouponType() {
        return codCouponType;
    }

    public void setCodCouponType(Integer codCouponType) {
        this.codCouponType = codCouponType;
    }

    public String getCodCouponNo() {
        return codCouponNo;
    }

    public void setCodCouponNo(String codCouponNo) {
        this.codCouponNo = codCouponNo;
    }

    public String getTxtCouponName() {
        return txtCouponName;
    }

    public void setTxtCouponName(String txtCouponName) {
        this.txtCouponName = txtCouponName;
    }

    public BigDecimal getAmtUsed() {
        return amtUsed;
    }

    public void setAmtUsed(BigDecimal amtUsed) {
        this.amtUsed = amtUsed;
    }

    public Date getDatApply() {
        return datApply;
    }

    public void setDatApply(Date datApply) {
        this.datApply = datApply;
    }

    public String getCodCouponUsedno() {
        return codCouponUsedno;
    }

    public void setCodCouponUsedno(String codCouponUsedno) {
        this.codCouponUsedno = codCouponUsedno;
    }

    public BigDecimal getCtrEffectRate() {
        return ctrEffectRate;
    }

    public void setCtrEffectRate(BigDecimal ctrEffectRate) {
        this.ctrEffectRate = ctrEffectRate;
    }

    public String getCodIconNo() {
        return codIconNo;
    }

    public void setCodIconNo(String codIconNo) {
        this.codIconNo = codIconNo;
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