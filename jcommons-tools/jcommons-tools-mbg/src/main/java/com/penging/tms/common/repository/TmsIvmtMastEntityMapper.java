package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsIvmtMastEntity;

public interface TmsIvmtMastEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsIvmtMastEntity record);

    int insertSelective(TmsIvmtMastEntity record);

    TmsIvmtMastEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsIvmtMastEntity record);

    int updateByPrimaryKey(TmsIvmtMastEntity record);
}