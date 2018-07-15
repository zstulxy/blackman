package com.maiya.dao;

import com.maiya.bean.WebUser;

import java.util.HashMap;
import java.util.List;

public interface WebUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WebUser record);

    int insertSelective(WebUser record);

    WebUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WebUser record);

    int updateByPrimaryKey(WebUser record);

    List<Object> selectWebAllUser(String name);

    List<Object> selectAllWebByUserId(HashMap<String, Object> parameters);

    Long selectLastUserId();

    WebUser selectWebUserByUserId(Long id);

    int deleteWebByPrimaryKey(Long id);

    WebUser selectWebUserByPassword(String name, String password);
}