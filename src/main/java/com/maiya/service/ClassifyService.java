package com.maiya.service;

import com.maiya.bean.Classify;

import java.util.HashMap;
import java.util.List;

public interface ClassifyService {
    int deleteByPrimaryKey(Long classifyId);

    int insert(Classify record);

    int insertSelective(Classify record);

    Classify selectByPrimaryKey(Long classifyId);

    int updateByPrimaryKeySelective(Classify record);

    int updateByPrimaryKey(Classify record);

    List<Object> selectAll(HashMap<String, Object> parameters);
}
