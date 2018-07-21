package com.maiya.service;

import com.maiya.bean.Sets;

import java.util.HashMap;
import java.util.List;

public interface SetsService {
    int deleteByPrimaryKey(Long setsId);

    int insert(Sets record);

    int insertSelective(Sets record);

    Sets selectByPrimaryKey(Long setsId);

    int updateByPrimaryKeySelective(Sets record);

    int updateByPrimaryKey(Sets record);

    List<Object> selectAllSets(HashMap<String, Object> parameters);
}
