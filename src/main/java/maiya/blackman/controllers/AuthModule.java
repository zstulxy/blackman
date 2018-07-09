package maiya.blackman.controllers;

import com.maiya.bean.Auth;
import maiya.blackman.service.AuthService;
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

    public boolean isAuthSuccess(String token) {
        boolean ret = false;
        Auth objects = authService.selectByToken(token);
        if (objects != null && objects.getToken().compareTo(token) == 0) {
            logger.debug("token: " + objects.getToken());
            ret = true;
        }
        logger.debug("==============" );
        userId_ = objects.getUserId();
        userName_ = objects.getLoginId();
        privilege_ = objects.getUser().getPrivilege();
        privilegeType_ = objects.getUser().getPrivilegetype();
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
        return privilegeType_;
    }

    public String getPrivilege() {
        return privilege_;
    }
}
