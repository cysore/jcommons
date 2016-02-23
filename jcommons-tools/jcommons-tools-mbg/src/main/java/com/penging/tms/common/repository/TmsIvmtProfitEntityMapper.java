package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsIvmtProfitEntity;

public interface TmsIvmtProfitEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsIvmtProfitEntity record);

    int insertSelective(TmsIvmtProfitEntity record);

    TmsIvmtProfitEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsIvmtProfitEntity record);

    int updateByPrimaryKey(TmsIvmtProfitEntity record);
}