package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsIvmtAmountXrefHistEntity;

public interface TmsIvmtAmountXrefHistEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsIvmtAmountXrefHistEntity record);

    int insertSelective(TmsIvmtAmountXrefHistEntity record);

    TmsIvmtAmountXrefHistEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsIvmtAmountXrefHistEntity record);

    int updateByPrimaryKey(TmsIvmtAmountXrefHistEntity record);
}