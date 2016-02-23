package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsProcRequestLogEntity;

public interface TmsProcRequestLogEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsProcRequestLogEntity record);

    int insertSelective(TmsProcRequestLogEntity record);

    TmsProcRequestLogEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsProcRequestLogEntity record);

    int updateByPrimaryKey(TmsProcRequestLogEntity record);
}