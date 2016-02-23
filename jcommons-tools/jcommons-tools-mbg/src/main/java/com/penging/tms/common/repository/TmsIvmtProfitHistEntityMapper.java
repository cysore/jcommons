package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsIvmtProfitHistEntity;

public interface TmsIvmtProfitHistEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsIvmtProfitHistEntity record);

    int insertSelective(TmsIvmtProfitHistEntity record);

    TmsIvmtProfitHistEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsIvmtProfitHistEntity record);

    int updateByPrimaryKey(TmsIvmtProfitHistEntity record);
}