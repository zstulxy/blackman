/**
 * @author cx
 */
/**
 * @author cx
 *
 */
package com.maiya.controllers;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.maiya.bean.AppUser;
import com.maiya.bean.Auth;
import com.maiya.bean.User;
import com.maiya.bean.WebUser;
import com.maiya.common.DataEncode;
import com.maiya.common.ErrorCode;
import com.maiya.common.ErrorMsg;
import com.maiya.service.AuthService;
import com.maiya.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("/login")
public class LoginController extends AuthModule {
    private static Logger logger = Logger.getLogger(LoginController.class);
    @Resource
    private AuthService authService;
    @Resource
    private UserService userService;

    @RequestMapping(value = "/web_value", method = RequestMethod.GET)
    public @ResponseBody
    HashMap<String, Object> getWebByUserNameAndPwd(HttpServletRequest request) {
        String name = request.getParameter("name");
        String passwd = request.getParameter("password");

        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        User userInfo = userService.selectByPassword(name, passwd);
        if (userInfo == null) {
            errCodesIndex = ErrorCode.LOGIN_SELECT_ERROR;
            return null;
        }

        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        String info = name + passwd;
        String token = DataEncode.getSHA256StrJava(info);
        Auth auth = new Auth();
        auth.setName(name);
        auth.setToken(token);
        auth.setUserId(userInfo.getId());
        auth.setUser(userInfo);
        auth.setAppUser(userInfo.getAppUser());
        auth.setWebUser(userInfo.getWebUser());
        if (userInfo.getAppUser() != null
                && userInfo.getAppUser() != null
                && userInfo.getAppUser().getId() > 0) {
            auth.setAppUserId(userInfo.getAppUser().getId());
        }

        if (userInfo.getWebUser() != null
                && userInfo.getWebUser() != null
                && userInfo.getWebUser().getId() > 0) {
            auth.setWebUserId(userInfo.getWebUser().getId());
        }

        int rc = authService.insert(auth);
        if (rc != -1) {
            logger.info("rc: " + rc);
        }

        HashMap<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("id", userInfo.getId());
        dataMap.put("avatar", userInfo.getAvatar());
        dataMap.put("name", userInfo.getName());
        dataMap.put("password", passwd);
        dataMap.put("token", token);
        dataMap.put("phoneNumber", userInfo.getPhoneNumber());
        dataMap.put("sex", userInfo.getSex());
        dataMap.put("age", userInfo.getAge());

        if (userInfo.getWebUser() != null) {
            WebUser webUser = userInfo.getWebUser();
            dataMap.put("webUserId",webUser.getId());
            dataMap.put("privilege",webUser.getPrivilege());
            dataMap.put("privilegetype",webUser.getPrivilegetype());
            dataMap.put("careers",webUser.getCareers());
            dataMap.put("certificate",webUser.getCertificate());
            dataMap.put("identity",webUser.getIdentity());
            dataMap.put("assess",webUser.getAssess());
        }
        result.put("data", dataMap);
        return result;
    }

    @RequestMapping(value = "/app_value", method = RequestMethod.GET)
    public @ResponseBody
    HashMap<String, Object> getAppByUserNameAndPwd(HttpServletRequest request) {
        String name = request.getParameter("name");
        String passwd = request.getParameter("password");

        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        User userInfo = userService.selectByPassword(name, passwd);
        if (userInfo == null) {
            errCodesIndex = ErrorCode.LOGIN_SELECT_ERROR;
            return null;
        }

        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        String info = name + passwd;
        String token = DataEncode.getSHA256StrJava(info);
        Auth auth = new Auth();
        auth.setName(name);
        auth.setToken(token);
        auth.setUserId(userInfo.getId());
        auth.setUser(userInfo);
        auth.setAppUser(userInfo.getAppUser());
        auth.setWebUser(userInfo.getWebUser());
        if (userInfo.getAppUser() != null
                && userInfo.getAppUser() != null
                && userInfo.getAppUser().getId() > 0) {
            auth.setAppUserId(userInfo.getAppUser().getId());
        }

        if (userInfo.getWebUser() != null
                && userInfo.getWebUser() != null
                && userInfo.getWebUser().getId() > 0) {
            auth.setWebUserId(userInfo.getWebUser().getId());
        }

        int rc = authService.insert(auth);
        if (rc != -1) {
            logger.info("rc: " + rc);
        }

        HashMap<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("id", userInfo.getId());
        dataMap.put("avatar", userInfo.getAvatar());
        dataMap.put("name", userInfo.getName());
        dataMap.put("password", passwd);
        dataMap.put("token", token);
        dataMap.put("phoneNumber", userInfo.getPhoneNumber());
        dataMap.put("sex", userInfo.getSex());
        dataMap.put("age", userInfo.getAge());

        if (userInfo.getAppUser() != null) {
            AppUser appUser = userInfo.getAppUser();
            dataMap.put("appUserId",appUser.getId());
            dataMap.put("address",appUser.getAddress());
            dataMap.put("points",appUser.getPoints());
        }
        result.put("data", dataMap);
        return result;
    }


    @RequestMapping(value = "update", method = RequestMethod.POST)
    public @ResponseBody
    HashMap<String, Object> updateUser(@RequestBody String data, HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("*************data: " + data);

        UserTblUpdate user_tbl = JSON.parseObject(data, UserTblUpdate.class);
        logger.debug(JSON.toJSON(user_tbl));
        int rc = userService.updateByPrimaryKeySelective(transformUpdateData(user_tbl));
        if (rc == 0) {
            errCodesIndex = ErrorCode.UPDATE_USER_ERROR;
        }
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }


    private User transformUpdateData(UserTblUpdate src) {
        User result = new User();
        byte privilegetType = src.getPrivilegetype().byteValue();
//        if (privilegetType > 0) {
//            result.setPrivilegetype(privilegetType);
//        }
//
//        if (src.getPrivilege() != null) {
//            result.setPrivilege(src.getPrivilege());
//        }

        if (src.getId() > 0) {
            result.setId(src.getId());
        }

        if (src.getAvatar() != null) {
            result.setAvatar(src.getAvatar());
        }

        if (src.getName() != null) {
            result.setName(src.getName());
        }

        if (src.getPassword() != null) {
            result.setPassword(src.getPassword());
        }

        if (src.getPhoneNumber() != null) {
            result.setPhoneNumber(src.getPhoneNumber());
        }

        return result;
    }

}