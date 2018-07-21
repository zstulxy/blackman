package com.maiya.dao;

import com.maiya.bean.PackProduct;

public interface PackProductMapper {
    int deleteByPrimaryKey(Long papId);

    int insert(PackProduct record);

    int insertSelective(PackProduct record);

    PackProduct selectByPrimaryKey(Long papId);

    int updateByPrimaryKeySelective(PackProduct record);

    int updateByPrimaryKey(PackProduct record);
}