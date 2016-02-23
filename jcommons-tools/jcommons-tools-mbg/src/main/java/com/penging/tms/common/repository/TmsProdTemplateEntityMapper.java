package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsProdTemplateEntity;

public interface TmsProdTemplateEntityMapper {
    int deleteByPrimaryKey(Long codId);

    int insert(TmsProdTemplateEntity record);

    int insertSelective(TmsProdTemplateEntity record);

    TmsProdTemplateEntity selectByPrimaryKey(Long codId);

    int updateByPrimaryKeySelective(TmsProdTemplateEntity record);

    int updateByPrimaryKeyWithBLOBs(TmsProdTemplateEntity record);

    int updateByPrimaryKey(TmsProdTemplateEntity record);
}