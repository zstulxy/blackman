package com.maiya.impl;

import com.maiya.bean.User;
import com.maiya.bean.WebUser;
import com.maiya.dao.UserMapper;
import com.maiya.dao.WebUserMapper;
import com.maiya.service.WebUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service("webUserService")
public class WebUserServiceImpl implements WebUserService {
    @Resource
    private WebUserMapper userDao;

    public int deleteByPrimaryKey(Long id) {
        return userDao.deleteByPrimaryKey(id);
    }

    public int insert(WebUser record) {
        return userDao.insert(record);
    }

    public int insertSelective(WebUser record) {
        return userDao.insertSelective(record);
    }

    public WebUser selectByPrimaryKey(Long id) {
        return userDao.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(WebUser record) {
        return userDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(WebUser record) {
        return userDao.updateByPrimaryKey(record);
    }

    public WebUser selectWebUserByPassword(String name, String password) {
        return userDao.selectWebUserByPassword(name, password);
    }

    public List<Object> selectWebAllUser(String name) {
        return userDao.selectWebAllUser(name);
    }

    public List<Object> selectAllWebByUserId(HashMap<String, Object> parameters) {
        return userDao.selectAllWebByUserId(parameters);
    }

    public Long selectLastUserId() {
        return userDao.selectLastUserId();
    }

    public WebUser selectWebUserByUserId(Long id) {
        return userDao.selectWebUserByUserId(id);
    }

    public int deleteWebByPrimaryKey(Long id) {
        return userDao.deleteWebByPrimaryKey(id);
    }
}
