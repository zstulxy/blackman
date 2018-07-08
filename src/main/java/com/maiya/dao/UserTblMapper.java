package com.maiya.dao;

import com.maiya.bean.UserTbl;
import com.maiya.bean.UserTblWithBLOBs;

public interface UserTblMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserTblWithBLOBs record);

    int insertSelective(UserTblWithBLOBs record);

    UserTblWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserTblWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserTblWithBLOBs record);

    int updateByPrimaryKey(UserTbl record);
}