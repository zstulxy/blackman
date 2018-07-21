package com.maiya.dao;

import com.maiya.bean.ProductSku;

public interface ProductSkuMapper {
    int deleteByPrimaryKey(Long psId);

    int insert(ProductSku record);

    int insertSelective(ProductSku record);

    ProductSku selectByPrimaryKey(Long psId);

    int updateByPrimaryKeySelective(ProductSku record);

    int updateByPrimaryKey(ProductSku record);
}