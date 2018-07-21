package com.maiya.dao;

import com.maiya.bean.Sets;

public interface SetsMapper {
    int deleteByPrimaryKey(Long setsId);

    int insert(Sets record);

    int insertSelective(Sets record);

    Sets selectByPrimaryKey(Long setsId);

    int updateByPrimaryKeySelective(Sets record);

    int updateByPrimaryKey(Sets record);
}