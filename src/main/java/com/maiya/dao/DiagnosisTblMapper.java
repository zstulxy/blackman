package com.maiya.dao;

import com.maiya.bean.DiagnosisTbl;

public interface DiagnosisTblMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DiagnosisTbl record);

    int insertSelective(DiagnosisTbl record);

    DiagnosisTbl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DiagnosisTbl record);

    int updateByPrimaryKeyWithBLOBs(DiagnosisTbl record);

    int updateByPrimaryKey(DiagnosisTbl record);
}