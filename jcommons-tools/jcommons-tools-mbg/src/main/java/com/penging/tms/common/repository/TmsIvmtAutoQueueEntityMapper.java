package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsIvmtAutoQueueEntity;

public interface TmsIvmtAutoQueueEntityMapper {
    int deleteByPrimaryKey(Long codQueueId);

    int insert(TmsIvmtAutoQueueEntity record);

    int insertSelective(TmsIvmtAutoQueueEntity record);

    TmsIvmtAutoQueueEntity selectByPrimaryKey(Long codQueueId);

    int updateByPrimaryKeySelective(TmsIvmtAutoQueueEntity record);

    int updateByPrimaryKey(TmsIvmtAutoQueueEntity record);
}