package com.maiya.dao;

import com.maiya.bean.Knowlege;

public interface KnowlegeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Knowlege record);

    int insertSelective(Knowlege record);

    Knowlege selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Knowlege record);

    int updateByPrimaryKeyWithBLOBs(Knowlege record);

    int updateByPrimaryKey(Knowlege record);
}