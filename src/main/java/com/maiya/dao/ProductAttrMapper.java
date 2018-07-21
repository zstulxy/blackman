package com.maiya.dao;

import com.maiya.bean.ProductAttr;

public interface ProductAttrMapper {
    int deleteByPrimaryKey(Long paId);

    int insert(ProductAttr record);

    int insertSelective(ProductAttr record);

    ProductAttr selectByPrimaryKey(Long paId);

    int updateByPrimaryKeySelective(ProductAttr record);

    int updateByPrimaryKey(ProductAttr record);
}