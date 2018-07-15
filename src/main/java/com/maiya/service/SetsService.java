package com.maiya.service;

import com.maiya.bean.Sets;

import java.util.List;

public interface SetsService {
    int deleteByPrimaryKey(Long id);

    int insert(Sets record);

    int insertSelective(Sets record);

    Sets selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Sets record);

    int updateByPrimaryKey(Sets record);

    List<Object> selectByUserId(Long id);
}
