package com.maiya.dao;

import com.maiya.bean.Doctors;

public interface DoctorsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Doctors record);

    int insertSelective(Doctors record);

    Doctors selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Doctors record);

    int updateByPrimaryKeyWithBLOBs(Doctors record);
}