package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsProcProdLogEntity;

public interface TmsProcProdLogEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsProcProdLogEntity record);

    int insertSelective(TmsProcProdLogEntity record);

    TmsProcProdLogEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsProcProdLogEntity record);

    int updateByPrimaryKey(TmsProcProdLogEntity record);
}