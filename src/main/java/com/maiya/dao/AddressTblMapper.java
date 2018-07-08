package com.maiya.dao;

import com.maiya.bean.AddressTbl;

public interface AddressTblMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AddressTbl record);

    int insertSelective(AddressTbl record);

    AddressTbl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AddressTbl record);

    int updateByPrimaryKey(AddressTbl record);
}