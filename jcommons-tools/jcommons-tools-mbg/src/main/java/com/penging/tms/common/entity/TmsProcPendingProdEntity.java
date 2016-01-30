package com.penging.tms.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TmsProcPendingProdEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.cod_id
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private Long codId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.cod_process_no
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private String codProcessNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.cod_table_name
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private String codTableName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.dat_process
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private Date datProcess;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.cod_record_type
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private Integer codRecordType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.txt_message
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private String txtMessage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.dat_create
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private Date datCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.cod_create_user
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private String codCreateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.cod_create_org
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private String codCreateOrg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.dat_modify
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private Date datModify;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.cod_modify_user
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private String codModifyUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.cod_modify_org
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private String codModifyOrg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.ctr_update_srlno
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private Integer ctrUpdateSrlno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.cod_loan_account
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private String codLoanAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.flg_breach_agreement
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private String flgBreachAgreement;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.amt_product_profit
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private BigDecimal amtProductProfit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.amt_product_principal
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private BigDecimal amtProductPrincipal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.amt_overdue_penalty
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private BigDecimal amtOverduePenalty;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.amt_prepayment_penalty
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private BigDecimal amtPrepaymentPenalty;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.amt_interest_income
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private BigDecimal amtInterestIncome;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tms_proc_pending_prod.amt_baltimore
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    private BigDecimal amtBaltimore;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.cod_id
     *
     * @return the value of tms_proc_pending_prod.cod_id
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public Long getCodId() {
        return codId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.cod_id
     *
     * @param codId the value for tms_proc_pending_prod.cod_id
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setCodId(Long codId) {
        this.codId = codId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.cod_process_no
     *
     * @return the value of tms_proc_pending_prod.cod_process_no
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public String getCodProcessNo() {
        return codProcessNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.cod_process_no
     *
     * @param codProcessNo the value for tms_proc_pending_prod.cod_process_no
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setCodProcessNo(String codProcessNo) {
        this.codProcessNo = codProcessNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.cod_table_name
     *
     * @return the value of tms_proc_pending_prod.cod_table_name
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public String getCodTableName() {
        return codTableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.cod_table_name
     *
     * @param codTableName the value for tms_proc_pending_prod.cod_table_name
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setCodTableName(String codTableName) {
        this.codTableName = codTableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.dat_process
     *
     * @return the value of tms_proc_pending_prod.dat_process
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public Date getDatProcess() {
        return datProcess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.dat_process
     *
     * @param datProcess the value for tms_proc_pending_prod.dat_process
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setDatProcess(Date datProcess) {
        this.datProcess = datProcess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.cod_record_type
     *
     * @return the value of tms_proc_pending_prod.cod_record_type
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public Integer getCodRecordType() {
        return codRecordType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.cod_record_type
     *
     * @param codRecordType the value for tms_proc_pending_prod.cod_record_type
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setCodRecordType(Integer codRecordType) {
        this.codRecordType = codRecordType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.txt_message
     *
     * @return the value of tms_proc_pending_prod.txt_message
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public String getTxtMessage() {
        return txtMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.txt_message
     *
     * @param txtMessage the value for tms_proc_pending_prod.txt_message
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setTxtMessage(String txtMessage) {
        this.txtMessage = txtMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.dat_create
     *
     * @return the value of tms_proc_pending_prod.dat_create
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public Date getDatCreate() {
        return datCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.dat_create
     *
     * @param datCreate the value for tms_proc_pending_prod.dat_create
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setDatCreate(Date datCreate) {
        this.datCreate = datCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.cod_create_user
     *
     * @return the value of tms_proc_pending_prod.cod_create_user
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public String getCodCreateUser() {
        return codCreateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.cod_create_user
     *
     * @param codCreateUser the value for tms_proc_pending_prod.cod_create_user
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setCodCreateUser(String codCreateUser) {
        this.codCreateUser = codCreateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.cod_create_org
     *
     * @return the value of tms_proc_pending_prod.cod_create_org
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public String getCodCreateOrg() {
        return codCreateOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.cod_create_org
     *
     * @param codCreateOrg the value for tms_proc_pending_prod.cod_create_org
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setCodCreateOrg(String codCreateOrg) {
        this.codCreateOrg = codCreateOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.dat_modify
     *
     * @return the value of tms_proc_pending_prod.dat_modify
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public Date getDatModify() {
        return datModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.dat_modify
     *
     * @param datModify the value for tms_proc_pending_prod.dat_modify
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setDatModify(Date datModify) {
        this.datModify = datModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.cod_modify_user
     *
     * @return the value of tms_proc_pending_prod.cod_modify_user
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public String getCodModifyUser() {
        return codModifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.cod_modify_user
     *
     * @param codModifyUser the value for tms_proc_pending_prod.cod_modify_user
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setCodModifyUser(String codModifyUser) {
        this.codModifyUser = codModifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.cod_modify_org
     *
     * @return the value of tms_proc_pending_prod.cod_modify_org
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public String getCodModifyOrg() {
        return codModifyOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.cod_modify_org
     *
     * @param codModifyOrg the value for tms_proc_pending_prod.cod_modify_org
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setCodModifyOrg(String codModifyOrg) {
        this.codModifyOrg = codModifyOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.ctr_update_srlno
     *
     * @return the value of tms_proc_pending_prod.ctr_update_srlno
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public Integer getCtrUpdateSrlno() {
        return ctrUpdateSrlno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.ctr_update_srlno
     *
     * @param ctrUpdateSrlno the value for tms_proc_pending_prod.ctr_update_srlno
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setCtrUpdateSrlno(Integer ctrUpdateSrlno) {
        this.ctrUpdateSrlno = ctrUpdateSrlno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.cod_loan_account
     *
     * @return the value of tms_proc_pending_prod.cod_loan_account
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public String getCodLoanAccount() {
        return codLoanAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.cod_loan_account
     *
     * @param codLoanAccount the value for tms_proc_pending_prod.cod_loan_account
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setCodLoanAccount(String codLoanAccount) {
        this.codLoanAccount = codLoanAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.flg_breach_agreement
     *
     * @return the value of tms_proc_pending_prod.flg_breach_agreement
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public String getFlgBreachAgreement() {
        return flgBreachAgreement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.flg_breach_agreement
     *
     * @param flgBreachAgreement the value for tms_proc_pending_prod.flg_breach_agreement
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setFlgBreachAgreement(String flgBreachAgreement) {
        this.flgBreachAgreement = flgBreachAgreement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.amt_product_profit
     *
     * @return the value of tms_proc_pending_prod.amt_product_profit
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public BigDecimal getAmtProductProfit() {
        return amtProductProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.amt_product_profit
     *
     * @param amtProductProfit the value for tms_proc_pending_prod.amt_product_profit
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setAmtProductProfit(BigDecimal amtProductProfit) {
        this.amtProductProfit = amtProductProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.amt_product_principal
     *
     * @return the value of tms_proc_pending_prod.amt_product_principal
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public BigDecimal getAmtProductPrincipal() {
        return amtProductPrincipal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.amt_product_principal
     *
     * @param amtProductPrincipal the value for tms_proc_pending_prod.amt_product_principal
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setAmtProductPrincipal(BigDecimal amtProductPrincipal) {
        this.amtProductPrincipal = amtProductPrincipal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.amt_overdue_penalty
     *
     * @return the value of tms_proc_pending_prod.amt_overdue_penalty
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public BigDecimal getAmtOverduePenalty() {
        return amtOverduePenalty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.amt_overdue_penalty
     *
     * @param amtOverduePenalty the value for tms_proc_pending_prod.amt_overdue_penalty
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setAmtOverduePenalty(BigDecimal amtOverduePenalty) {
        this.amtOverduePenalty = amtOverduePenalty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.amt_prepayment_penalty
     *
     * @return the value of tms_proc_pending_prod.amt_prepayment_penalty
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public BigDecimal getAmtPrepaymentPenalty() {
        return amtPrepaymentPenalty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.amt_prepayment_penalty
     *
     * @param amtPrepaymentPenalty the value for tms_proc_pending_prod.amt_prepayment_penalty
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setAmtPrepaymentPenalty(BigDecimal amtPrepaymentPenalty) {
        this.amtPrepaymentPenalty = amtPrepaymentPenalty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.amt_interest_income
     *
     * @return the value of tms_proc_pending_prod.amt_interest_income
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public BigDecimal getAmtInterestIncome() {
        return amtInterestIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.amt_interest_income
     *
     * @param amtInterestIncome the value for tms_proc_pending_prod.amt_interest_income
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setAmtInterestIncome(BigDecimal amtInterestIncome) {
        this.amtInterestIncome = amtInterestIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tms_proc_pending_prod.amt_baltimore
     *
     * @return the value of tms_proc_pending_prod.amt_baltimore
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public BigDecimal getAmtBaltimore() {
        return amtBaltimore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tms_proc_pending_prod.amt_baltimore
     *
     * @param amtBaltimore the value for tms_proc_pending_prod.amt_baltimore
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    public void setAmtBaltimore(BigDecimal amtBaltimore) {
        this.amtBaltimore = amtBaltimore;
    }
}