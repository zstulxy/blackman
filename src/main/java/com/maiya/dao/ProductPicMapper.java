package com.maiya.dao;

import com.maiya.bean.ProductPic;

public interface ProductPicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductPic record);

    int insertSelective(ProductPic record);

    ProductPic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductPic record);

    int updateByPrimaryKey(ProductPic record);
}