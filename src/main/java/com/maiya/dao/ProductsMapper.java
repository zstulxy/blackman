package com.maiya.dao;

import com.maiya.bean.Products;

public interface ProductsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Products record);

    int insertSelective(Products record);

    Products selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Products record);

    int updateByPrimaryKey(Products record);
}