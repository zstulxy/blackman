package com.maiya.dao;

import com.maiya.bean.PackProductInfo;

public interface PackProductInfoMapper {
    int deleteByPrimaryKey(Long ppiId);

    int insert(PackProductInfo record);

    int insertSelective(PackProductInfo record);

    PackProductInfo selectByPrimaryKey(Long ppiId);

    int updateByPrimaryKeySelective(PackProductInfo record);

    int updateByPrimaryKey(PackProductInfo record);
}