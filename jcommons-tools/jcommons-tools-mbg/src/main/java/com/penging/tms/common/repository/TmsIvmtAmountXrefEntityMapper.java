package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsIvmtAmountXrefEntity;

public interface TmsIvmtAmountXrefEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsIvmtAmountXrefEntity record);

    int insertSelective(TmsIvmtAmountXrefEntity record);

    TmsIvmtAmountXrefEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsIvmtAmountXrefEntity record);

    int updateByPrimaryKey(TmsIvmtAmountXrefEntity record);
}