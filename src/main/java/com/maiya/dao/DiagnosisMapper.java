package com.maiya.dao;

import com.maiya.bean.Diagnosis;

public interface DiagnosisMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Diagnosis record);

    int insertSelective(Diagnosis record);

    Diagnosis selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Diagnosis record);

    int updateByPrimaryKeyWithBLOBs(Diagnosis record);

    int updateByPrimaryKey(Diagnosis record);
}