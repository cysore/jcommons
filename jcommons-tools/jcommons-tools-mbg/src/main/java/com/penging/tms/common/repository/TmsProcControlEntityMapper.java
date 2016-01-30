package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsProcControlEntity;

public interface TmsProcControlEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsProcControlEntity record);

    int insertSelective(TmsProcControlEntity record);

    TmsProcControlEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsProcControlEntity record);

    int updateByPrimaryKey(TmsProcControlEntity record);
}