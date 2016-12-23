package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsProdMastLogEntity;

public interface TmsProdMastLogEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsProdMastLogEntity record);

    int insertSelective(TmsProdMastLogEntity record);

    TmsProdMastLogEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsProdMastLogEntity record);

    int updateByPrimaryKeyWithBLOBs(TmsProdMastLogEntity record);

    int updateByPrimaryKey(TmsProdMastLogEntity record);
}