package com.maiya.service;

import com.maiya.bean.Products;

import java.util.List;

public interface ProductsService {
    public int deleteByPrimaryKey(Long id);

    public int insert(Products record);

    public int insertSelective(Products record);

    public Products selectByPrimaryKey(Long id);

    public int updateByPrimaryKeySelective(Products record);

    public int updateByPrimaryKey(Products record);

    public List<Products> selectByBrandType(Byte brandType);
}
