package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsIvmtProfitEntity;

public interface TmsIvmtProfitEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_ivmt_profit
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int deleteByPrimaryKey(Long codId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_ivmt_profit
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int insert(TmsIvmtProfitEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_ivmt_profit
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int insertSelective(TmsIvmtProfitEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_ivmt_profit
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    TmsIvmtProfitEntity selectByPrimaryKey(Long codId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_ivmt_profit
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int updateByPrimaryKeySelective(TmsIvmtProfitEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_ivmt_profit
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int updateByPrimaryKey(TmsIvmtProfitEntity record);
}