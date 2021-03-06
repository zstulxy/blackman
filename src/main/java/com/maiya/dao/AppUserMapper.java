package com.maiya.dao;

import com.maiya.bean.AppUser;

import java.util.HashMap;
import java.util.List;

public interface AppUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AppUser record);

    int insertSelective(AppUser record);

    AppUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AppUser record);

    int updateByPrimaryKey(AppUser record);

    List<Object> selectAppAllUser(String name);

    List<Object> selectAllAppByUserId(HashMap<String, Object> parameters);

    Long selectLastUserId();

    AppUser selectAppUserByUserId(Long id);

    int deleteAppByPrimaryKey(Long id);

    AppUser selectAppUserByPassword(String name, String password);
}