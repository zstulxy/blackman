package com.maiya.dao;

import com.maiya.bean.PackProductInfo;

public interface PackProductInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PackProductInfo record);

    int insertSelective(PackProductInfo record);

    PackProductInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PackProductInfo record);

    int updateByPrimaryKey(PackProductInfo record);
}