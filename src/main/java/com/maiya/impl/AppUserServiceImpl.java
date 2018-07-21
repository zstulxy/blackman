package com.maiya.impl;

import com.maiya.bean.AppUser;
import com.maiya.bean.User;
import com.maiya.bean.WebUser;
import com.maiya.dao.AppUserMapper;
import com.maiya.service.AppUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service("appUserService")
public class AppUserServiceImpl implements AppUserService {
	@Resource  
    private AppUserMapper userDao;


    public int deleteByPrimaryKey(Long id) {
        return userDao.deleteByPrimaryKey(id);
    }

    public int insert(AppUser record) {
        return userDao.insert(record);
    }

    public int insertSelective(AppUser record) {
        return userDao.insertSelective(record);
    }

    public AppUser selectByPrimaryKey(Long id) {
        return userDao.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(AppUser record) {
        return userDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AppUser record) {
        return userDao.updateByPrimaryKey(record);
    }

    public AppUser selectAppUserByPassword(String name, String password) {
        return userDao.selectAppUserByPassword(name, password);
    }

    public List<Object> selectAppAllUser(String name) {
        return userDao.selectAppAllUser(name);
    }

    public List<Object> selectAllAppByUserId(HashMap<String, Object> parameters) {
        return userDao.selectAllAppByUserId(parameters);
    }

    public Long selectLastUserId() {
        return userDao.selectLastUserId();
    }

    public AppUser selectAppUserByUserId(Long id) {
        return userDao.selectAppUserByUserId(id);
    }

    public int deleteAppByPrimaryKey(Long id) {
        return userDao.deleteAppByPrimaryKey(id);
    }
}

