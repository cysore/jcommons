package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsProcClearLogEntity;

public interface TmsProcClearLogEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsProcClearLogEntity record);

    int insertSelective(TmsProcClearLogEntity record);

    TmsProcClearLogEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsProcClearLogEntity record);

    int updateByPrimaryKey(TmsProcClearLogEntity record);
}