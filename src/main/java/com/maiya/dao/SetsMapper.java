package com.maiya.dao;

import com.maiya.bean.Sets;

public interface SetsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Sets record);

    int insertSelective(Sets record);

    Sets selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Sets record);

    int updateByPrimaryKey(Sets record);
}