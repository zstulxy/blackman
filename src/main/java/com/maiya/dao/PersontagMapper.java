package com.maiya.dao;

import com.maiya.bean.Persontag;

public interface PersontagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Persontag record);

    int insertSelective(Persontag record);

    Persontag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Persontag record);

    int updateByPrimaryKey(Persontag record);
}