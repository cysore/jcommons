package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsProcSettleLogEntity;

public interface TmsProcSettleLogEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsProcSettleLogEntity record);

    int insertSelective(TmsProcSettleLogEntity record);

    TmsProcSettleLogEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsProcSettleLogEntity record);

    int updateByPrimaryKey(TmsProcSettleLogEntity record);
}