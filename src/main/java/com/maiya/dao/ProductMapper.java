package com.maiya.dao;

import com.maiya.bean.Product;

public interface ProductMapper {
    int deleteByPrimaryKey(Long pId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Long pId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}