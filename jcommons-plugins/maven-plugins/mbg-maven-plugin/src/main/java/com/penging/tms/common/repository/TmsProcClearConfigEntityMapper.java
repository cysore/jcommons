package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsProcClearConfigEntity;

public interface TmsProcClearConfigEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsProcClearConfigEntity record);

    int insertSelective(TmsProcClearConfigEntity record);

    TmsProcClearConfigEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsProcClearConfigEntity record);

    int updateByPrimaryKey(TmsProcClearConfigEntity record);
}