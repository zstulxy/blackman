package com.maiya.dao;

import com.maiya.bean.PersontagTbl;

public interface PersontagTblMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PersontagTbl record);

    int insertSelective(PersontagTbl record);

    PersontagTbl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PersontagTbl record);

    int updateByPrimaryKey(PersontagTbl record);
}