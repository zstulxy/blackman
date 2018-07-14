package com.maiya.controllers;

import com.maiya.bean.AppUser;
import com.maiya.bean.Auth;
import com.maiya.bean.User;
import com.maiya.bean.WebUser;
import com.maiya.service.AuthService;
import org.apache.log4j.Logger;

import javax.annotation.Resource;

public class AuthModule {
    private static Logger logger = Logger.getLogger(AuthModule.class);
    @Resource
    private AuthService authService;
    private Long userId_;
    private String userName_;
    private Byte privilegeType_;
    private String privilege_;
    private User user_ = null;
    private WebUser webUser_ = null;
    private AppUser appUser_ = null;

    public boolean isAuthSuccess(String token) {
        boolean ret = false;
        Auth objects = authService.selectByToken(token);
        if (objects == null) {
            return ret;
        }

        if (objects != null && objects.getToken().compareTo(token) == 0) {
            logger.debug("token: " + objects.getToken());
            ret = true;
        }
        logger.debug("==============" );
        userId_ = objects.getUserId();
        userName_ = objects.getName();
        user_ = objects.getUser();
        appUser_ = objects.getAppUser();
        webUser_ = objects.getWebUser();

        logger.debug("userId_: " + userId_ + ", userName_: " + userName_);
        return ret;
    }

    public Long getUserId() {
        return userId_;
    }

    public String getUserName() {
        return userName_;
    }

    public Byte getPrivilegeType() {
        if (webUser_ == null) {
            return -1;
        }
        privilegeType_ = webUser_.getPrivilegetype();
        return privilegeType_;
    }

    public String getPrivilege() {
        privilege_ = (webUser_ == null) ? null : webUser_.getPrivilege();
        return privilege_;
    }

    public User getUser() {
        return user_;
    }

    public AppUser getAppUser() {
        return appUser_;
    }

    public WebUser getWebUser() {
        return webUser_;
    }
}
