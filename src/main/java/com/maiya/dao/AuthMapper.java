package com.maiya.dao;

import com.maiya.bean.Auth;

public interface AuthMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Auth record);

    int insertSelective(Auth record);

    Auth selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Auth record);

    int updateByPrimaryKey(Auth record);

    Auth selectByToken(String token);
}