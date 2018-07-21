package com.maiya.service;

import com.maiya.bean.WebUser;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface WebUserService {
    int deleteByPrimaryKey(Long id);

    int insert(WebUser record);

    int insertSelective(WebUser record);

    WebUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WebUser record);

    int updateByPrimaryKey(WebUser record);

    WebUser selectWebUserByPassword(@Param("name") String name, @Param("password") String password);

    List<Object> selectWebAllUser(String name);

    List<Object> selectAllWebByUserId(HashMap<String, Object> parameters);

    Long selectLastUserId();

    WebUser selectWebUserByUserId(Long id);

    int deleteWebByPrimaryKey(Long id);
}
