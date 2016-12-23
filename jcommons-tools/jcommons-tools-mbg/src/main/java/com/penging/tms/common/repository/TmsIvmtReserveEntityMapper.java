package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsIvmtReserveEntity;

public interface TmsIvmtReserveEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsIvmtReserveEntity record);

    int insertSelective(TmsIvmtReserveEntity record);

    TmsIvmtReserveEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsIvmtReserveEntity record);

    int updateByPrimaryKey(TmsIvmtReserveEntity record);
}