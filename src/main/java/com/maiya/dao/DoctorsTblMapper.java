package com.maiya.dao;

import com.maiya.bean.DoctorsTbl;

public interface DoctorsTblMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DoctorsTbl record);

    int insertSelective(DoctorsTbl record);

    DoctorsTbl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DoctorsTbl record);

    int updateByPrimaryKeyWithBLOBs(DoctorsTbl record);
}