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
import com.maiya.service.AppUserService;
import com.maiya.service.AuthService;
import com.maiya.service.WebUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
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
    private AppUserService appUserService;
    @Resource
    private WebUserService webUserService;

    @RequestMapping(value = "/web_value", method = RequestMethod.GET)
    public @ResponseBody
    HashMap<String, Object> getWebByUserNameAndPwd(HttpServletRequest request) {
        String name = request.getParameter("name");
        String passwd = request.getParameter("password");

        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        WebUser userInfo = webUserService.selectWebUserByPassword(name,passwd);
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
        auth.setUserId(userInfo.getUser().getId());
        auth.setWebUser(userInfo);

        if (userInfo.getUser() != null
                && userInfo.getUser().getId() != null
                && userInfo.getUser().getId() > 0) {
            auth.setWebUserId(userInfo.getId());
        }

        int rc = authService.insert(auth);
        if (rc != -1) {
            logger.info("rc: " + rc);
        }

        HashMap<String, Object> dataMap = new HashMap<String, Object>();
        User user = userInfo.getUser();
        if (user != null) {
            dataMap.put("userid", user.getId());
            dataMap.put("avatar", user.getAvatar());
            dataMap.put("name", user.getName());
            dataMap.put("password", passwd);
            dataMap.put("token", token);
            dataMap.put("phoneNumber", user.getPhoneNumber());
            dataMap.put("sex", user.getSex());
            dataMap.put("age", user.getAge());
        }

        dataMap.put("webUserId",userInfo.getId());
        dataMap.put("privilege",userInfo.getPrivilege());
        dataMap.put("privilegetype",userInfo.getPrivilegetype());
        dataMap.put("careers",userInfo.getCareers());
        dataMap.put("certificate",userInfo.getCertificate());
        dataMap.put("identity",userInfo.getIdentity());
        dataMap.put("assess",userInfo.getAssess());

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

        AppUser userInfo = appUserService.selectAppUserByPassword(name, passwd);
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
        auth.setUserId(userInfo.getUser().getId());
        if (userInfo != null
                && userInfo.getId() != null
                && userInfo.getId() > 0) {
            auth.setAppUserId(userInfo.getId());
        }

        int rc = authService.insert(auth);
        if (rc != -1) {
            logger.info("rc: " + rc);
        }

        HashMap<String, Object> dataMap = new HashMap<String, Object>();
        User user = userInfo.getUser();
        if (user != null) {
            dataMap.put("userid", user.getId());
            dataMap.put("avatar", user.getAvatar());
            dataMap.put("name", user.getName());
            dataMap.put("password", passwd);
            dataMap.put("token", token);
            dataMap.put("phoneNumber", user.getPhoneNumber());
            dataMap.put("sex", user.getSex());
            dataMap.put("age", user.getAge());
        }

        dataMap.put("appUserId",userInfo.getId());
        dataMap.put("address",userInfo.getAddress());
        dataMap.put("points",userInfo.getPoints());

        result.put("data", dataMap);
        return result;
    }
}