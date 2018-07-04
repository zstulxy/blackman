package com.maiya.dao;

import com.maiya.bean.UserTbl;

public interface UserTblMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserTbl record);

    int insertSelective(UserTbl record);

    UserTbl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserTbl record);

    int updateByPrimaryKeyWithBLOBs(UserTbl record);

    int updateByPrimaryKey(UserTbl record);
}