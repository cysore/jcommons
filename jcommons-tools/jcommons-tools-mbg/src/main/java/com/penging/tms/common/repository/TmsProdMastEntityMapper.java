package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsProdMastEntity;

public interface TmsProdMastEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsProdMastEntity record);

    int insertSelective(TmsProdMastEntity record);

    TmsProdMastEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsProdMastEntity record);

    int updateByPrimaryKeyWithBLOBs(TmsProdMastEntity record);

    int updateByPrimaryKey(TmsProdMastEntity record);
}