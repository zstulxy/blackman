package com.maiya.dao;

import com.maiya.bean.Classify;

public interface ClassifyMapper {
    int deleteByPrimaryKey(Long classifyId);

    int insert(Classify record);

    int insertSelective(Classify record);

    Classify selectByPrimaryKey(Long classifyId);

    int updateByPrimaryKeySelective(Classify record);

    int updateByPrimaryKey(Classify record);
}