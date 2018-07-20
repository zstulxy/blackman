package com.maiya.dao;

import com.maiya.bean.PackProduct;

public interface PackProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PackProduct record);

    int insertSelective(PackProduct record);

    PackProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PackProduct record);

    int updateByPrimaryKey(PackProduct record);
}