package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsProcPendingProdEntity;

public interface TmsProcPendingProdEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsProcPendingProdEntity record);

    int insertSelective(TmsProcPendingProdEntity record);

    TmsProcPendingProdEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsProcPendingProdEntity record);

    int updateByPrimaryKey(TmsProcPendingProdEntity record);
}