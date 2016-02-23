package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsIvmtAutoEntity;

public interface TmsIvmtAutoEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsIvmtAutoEntity record);

    int insertSelective(TmsIvmtAutoEntity record);

    TmsIvmtAutoEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsIvmtAutoEntity record);

    int updateByPrimaryKey(TmsIvmtAutoEntity record);
}