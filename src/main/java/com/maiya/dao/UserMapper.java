package com.maiya.dao;

import com.maiya.bean.User;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectWebUserByPassword(String login_id, String password);

    User selectAppUserByPassword(String login_id, String password);

    List<Object> selectAppAllUser(String name);

    List<Object> selectAllAppByUserId(HashMap<String, Object> parameters);

    List<Object> selectWebAllUser(String name);

    List<Object> selectAllWebByUserId(HashMap<String, Object> parameters);

    User selectVerifyCodeByPhone(String phone_number);

    int updateByPhone(User record);
}