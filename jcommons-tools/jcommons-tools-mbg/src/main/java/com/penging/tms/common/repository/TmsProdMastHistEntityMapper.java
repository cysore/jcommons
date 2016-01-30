package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsProdMastHistEntity;

public interface TmsProdMastHistEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsProdMastHistEntity record);

    int insertSelective(TmsProdMastHistEntity record);

    TmsProdMastHistEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsProdMastHistEntity record);

    int updateByPrimaryKeyWithBLOBs(TmsProdMastHistEntity record);

    int updateByPrimaryKey(TmsProdMastHistEntity record);
}