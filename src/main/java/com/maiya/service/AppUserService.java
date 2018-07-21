package com.maiya.service;

import com.maiya.bean.AppUser;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface AppUserService {
    int deleteByPrimaryKey(Long id);

    int insert(AppUser record);

    int insertSelective(AppUser record);

    AppUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AppUser record);

    int updateByPrimaryKey(AppUser record);

    AppUser selectAppUserByPassword(@Param("name") String name, @Param("password") String password);

    List<Object> selectAppAllUser(String name);

    List<Object> selectAllAppByUserId(HashMap<String, Object> parameters);

    Long selectLastUserId();

    AppUser selectAppUserByUserId(Long id);

    int deleteAppByPrimaryKey(Long id);
}
