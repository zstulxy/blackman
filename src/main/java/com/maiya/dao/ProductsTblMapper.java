package com.maiya.dao;

import com.maiya.bean.ProductsTbl;

public interface ProductsTblMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductsTbl record);

    int insertSelective(ProductsTbl record);

    ProductsTbl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductsTbl record);

    int updateByPrimaryKey(ProductsTbl record);
}