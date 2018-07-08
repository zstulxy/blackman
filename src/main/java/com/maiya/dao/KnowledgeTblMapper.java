package com.maiya.dao;

import com.maiya.bean.KnowledgeTbl;

public interface KnowledgeTblMapper {
    int deleteByPrimaryKey(Long id);

    int insert(KnowledgeTbl record);

    int insertSelective(KnowledgeTbl record);

    KnowledgeTbl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(KnowledgeTbl record);

    int updateByPrimaryKeyWithBLOBs(KnowledgeTbl record);

    int updateByPrimaryKey(KnowledgeTbl record);
}