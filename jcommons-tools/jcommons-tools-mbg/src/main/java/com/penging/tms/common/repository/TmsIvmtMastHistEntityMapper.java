package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsIvmtMastHistEntity;

public interface TmsIvmtMastHistEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsIvmtMastHistEntity record);

    int insertSelective(TmsIvmtMastHistEntity record);

    TmsIvmtMastHistEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsIvmtMastHistEntity record);

    int updateByPrimaryKey(TmsIvmtMastHistEntity record);
}