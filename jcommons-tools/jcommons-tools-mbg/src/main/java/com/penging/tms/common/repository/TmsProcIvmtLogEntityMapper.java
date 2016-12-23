package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsProcIvmtLogEntity;

public interface TmsProcIvmtLogEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsProcIvmtLogEntity record);

    int insertSelective(TmsProcIvmtLogEntity record);

    TmsProcIvmtLogEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsProcIvmtLogEntity record);

    int updateByPrimaryKey(TmsProcIvmtLogEntity record);
}