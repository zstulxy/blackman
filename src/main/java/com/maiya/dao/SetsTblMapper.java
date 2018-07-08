package com.maiya.dao;

import com.maiya.bean.SetsTbl;

public interface SetsTblMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SetsTbl record);

    int insertSelective(SetsTbl record);

    SetsTbl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SetsTbl record);

    int updateByPrimaryKey(SetsTbl record);
}