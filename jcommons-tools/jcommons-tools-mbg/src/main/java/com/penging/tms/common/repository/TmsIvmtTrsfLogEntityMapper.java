package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsIvmtTrsfLogEntity;

public interface TmsIvmtTrsfLogEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsIvmtTrsfLogEntity record);

    int insertSelective(TmsIvmtTrsfLogEntity record);

    TmsIvmtTrsfLogEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsIvmtTrsfLogEntity record);

    int updateByPrimaryKey(TmsIvmtTrsfLogEntity record);
}