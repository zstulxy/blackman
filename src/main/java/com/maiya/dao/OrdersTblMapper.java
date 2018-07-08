package com.maiya.dao;

import com.maiya.bean.OrdersTbl;

public interface OrdersTblMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrdersTbl record);

    int insertSelective(OrdersTbl record);

    OrdersTbl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrdersTbl record);

    int updateByPrimaryKey(OrdersTbl record);
}