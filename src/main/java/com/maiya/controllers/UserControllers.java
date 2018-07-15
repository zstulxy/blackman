package com.maiya.controllers;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.maiya.bean.AppUser;
import com.maiya.bean.User;
import com.maiya.bean.WebUser;
import com.maiya.common.ErrorCode;
import com.maiya.common.ErrorMsg;
import com.maiya.common.PrivilegeType;
import com.maiya.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserControllers extends AuthModule {
    private static Logger logger = Logger.getLogger(UserControllers.class);
    @Resource
    private UserService service;

    @RequestMapping(value = "app_list", method = RequestMethod.GET)
    public @ResponseBody
    HashMap<String, Object> selectAllAppUser(HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        Integer pageNo = (request.getParameter("page_no") == null) ? 1
                : Integer.parseInt(request.getParameter("page_no"));
        Integer pageSize = (request.getParameter("page_size") == null) ? 10
                : Integer.parseInt(request.getParameter("page_size"));
        String userName = request.getParameter("name");
        String token = request.getParameter("token");
        if (userName == null || token == null) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }

        logger.debug("pageNo: " + pageNo + ", pageSIZE: " + pageSize + "userName: " + userName + "token: " + token);
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }

        PageHelper.startPage(pageNo, pageSize);
        List<Object> userInfos = service.selectAppAllUser(userName);
        if (userInfos.size() == 0) {
            errCodesIndex = ErrorCode.SELECT_USER_ERROR;
            HashMap<String, Object> result_tmp = errorMsg.ErrorCodeMsg(errCodesIndex);
            return result_tmp;
        }
        PageInfo page = new PageInfo(userInfos);

        HashMap<String, Object> data_result = new HashMap<String, Object>();
        data_result.put("total", page.getTotal());
        data_result.put("pageNo", pageNo);
        data_result.put("filterName", userName);
        data_result.put("type", "app");
        data_result.put("list", userInfos);
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        result.put("data", data_result);
        return result;
    }

    @RequestMapping(value = "web_list", method = RequestMethod.GET)
    public @ResponseBody
    HashMap<String, Object> selectAllWebUser(HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        Integer pageNo = (request.getParameter("page_no") == null) ? 1
                : Integer.parseInt(request.getParameter("page_no"));
        Integer pageSize = (request.getParameter("page_size") == null) ? 10
                : Integer.parseInt(request.getParameter("page_size"));
        String userName = request.getParameter("name");
        String token = request.getParameter("token");
        logger.debug("pageNo: " + pageNo + ", pageSIZE: " + pageSize + "userName: " + userName + "token: " + token);
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }

        PageHelper.startPage(pageNo, pageSize);
        List<Object> userInfos = service.selectWebAllUser(userName);
        Long userId = this.getUserId();
        switch (this.getPrivilegeType()) {
            case 1:
            case 2:
                break;
            case 3: {
                HashMap<String, Object> paras = new HashMap<String, Object>();
                paras.put("name", userName);
                paras.put("userId", userId);
                userInfos = service.selectAllWebByUserId(paras);
            }
            break;
            default:
                break;
        }
        if (userInfos.size() == 0) {
            errCodesIndex = ErrorCode.SELECT_USER_ERROR;
            HashMap<String, Object> result_tmp = errorMsg.ErrorCodeMsg(errCodesIndex);
            return result_tmp;
        }
        PageInfo page = new PageInfo(userInfos);

        HashMap<String, Object> data_result = new HashMap<String, Object>();
        data_result.put("total", page.getTotal());
        data_result.put("pageNo", pageNo);
        data_result.put("filterName", userName);
        data_result.put("type", "web");
        data_result.put("list", userInfos);
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        result.put("data", data_result);
        return result;
    }

    @RequestMapping(value = "web_info", method = RequestMethod.GET)
    public @ResponseBody
    HashMap<String, Object> getWebUserById(HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();
        long id = Long.parseLong(request.getParameter("user_id"));
        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }

        User userInfo = service.selectWebUserByUserId(id);
        if (userInfo == null || userInfo.getId() != id) {
            errCodesIndex = ErrorCode.GET_VENDOR_BYID_ERROR;
            HashMap<String, Object> result_tmp = errorMsg.ErrorCodeMsg(errCodesIndex);
            return result_tmp;
        }

        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        result.put("data", userInfo);
        return result;
    }

    @RequestMapping(value = "app_info", method = RequestMethod.GET)
    public @ResponseBody
    HashMap<String, Object> getAppUserById(HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();
        long id = Long.parseLong(request.getParameter("user_id"));
        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }

        User userInfo = service.selectAppUserByUserId(id);
        if (userInfo == null || userInfo.getId() != id) {
            errCodesIndex = ErrorCode.GET_VENDOR_BYID_ERROR;
            HashMap<String, Object> result_tmp = errorMsg.ErrorCodeMsg(errCodesIndex);
            return result_tmp;
        }

        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        result.put("data", userInfo);
        return result;
    }

    @RequestMapping(value = "web_create", method = RequestMethod.POST)
    public @ResponseBody
    HashMap<String, Object> inertWebUser(@RequestBody String data, HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("*************data: " + data);

        WebUserCreate user_tbl = JSON.parseObject(data, WebUserCreate.class);
        logger.debug(JSON.toJSON(user_tbl));
        int rc = service.insertSelective(transformData(user_tbl));
        if (rc == 0) {
            errCodesIndex = ErrorCode.INSERT_USER_ERROR;
        }

        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }

    @RequestMapping(value = "app_create", method = RequestMethod.POST)
    public @ResponseBody
    HashMap<String, Object> inertAppUser(@RequestBody String data, HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("*************data: " + data);

        AppUserCreate user_tbl = JSON.parseObject(data, AppUserCreate.class);
        logger.debug(JSON.toJSON(user_tbl));
        int rc = service.insertSelective(transformData(user_tbl));
        if (rc == 0) {
            errCodesIndex = ErrorCode.INSERT_USER_ERROR;
        }

        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }

    private User transformData(AppUserCreate src) {
        User result = new User();
        AppUser appUser = new AppUser();

        Long userId = service.selectLastUserId() + 1;
        appUser.setUserId(userId);

        if (src.getName() != null) {
            result.setName(src.getName());
        }

        if (src.getSex() != null) {
            result.setSex(src.getSex());
        }

        if (src.getAge() != null) {
            result.setAge(src.getAge());
        }

        if (src.getAvatar() != null) {
            result.setAvatar(src.getAvatar());
        }

        if (src.getEmail() != null) {
            result.setEmail(src.getEmail());
        }

        if (src.getPhoneNumber() != null) {
            result.setPhoneNumber(src.getPhoneNumber());
        }

        if (src.getVerification() != null) {
            result.setVerification(src.getVerification());
        }

        if (src.getPassword() != null) {
            result.setPassword(src.getPassword());
        }

        if (src.getBackgroundIcon() != null) {
            result.setBackgroundIcon(src.getBackgroundIcon());
        }

        if (src.getIdCard() != null) {
            result.setIdCard(src.getIdCard());
        }

        if (src.getAddress() != null) {
            appUser.setAddress(src.getAddress());
        }

        if (src.getPoints() != null) {
            appUser.setPoints(src.getPoints());
        }

        if (appUser != null) {
            result.setAppUser(appUser);
        }

        result.setWebUser(null);

        return result;
    }

    private User transformData(WebUserCreate src) {
        User result = new User();
        WebUser webUser = new WebUser();

        Long userId = service.selectLastUserId() + 1;
        webUser.setUserId(userId);

        if (src.getName() != null) {
            result.setName(src.getName());
        }

        if (src.getSex() != null) {
            result.setSex(src.getSex());
        }

        if (src.getAge() != null) {
            result.setAge(src.getAge());
        }

        if (src.getAvatar() != null) {
            result.setAvatar(src.getAvatar());
        }

        if (src.getEmail() != null) {
            result.setEmail(src.getEmail());
        }

        if (src.getPhoneNumber() != null) {
            result.setPhoneNumber(src.getPhoneNumber());
        }

        if (src.getVerification() != null) {
            result.setVerification(src.getVerification());
        }

        if (src.getPassword() != null) {
            result.setPassword(src.getPassword());
        }

        if (src.getBackgroundIcon() != null) {
            result.setBackgroundIcon(src.getBackgroundIcon());
        }

        if (src.getIdCard() != null) {
            result.setIdCard(src.getIdCard());
        }

        if (src.getCareers() != null) {
            webUser.setCareers(src.getCareers());
        }

        if (src.getPrivilege() != null) {
            webUser.setPrivilege(src.getPrivilege());
        }

        if (src.getPrivilegetype() != null) {
            webUser.setPrivilegetype(src.getPrivilegetype());
        }

        if (src.getCertificate() != null) {
            webUser.setCertificate(src.getCertificate());
        }

        if (src.getAssess() != null) {
            webUser.setAssess(src.getAssess());
        }

        if (webUser != null) {
            result.setWebUser(webUser);
        }

        result.setAppUser(null);

        return result;
    }

    private User transformData(AppUserUpate src) {
        User result = new User();
        AppUser appUser = new AppUser();

        if (src.getName() != null) {
            result.setName(src.getName());
        }

        if (src.getSex() != null) {
            result.setSex(src.getSex());
        }

        if (src.getAge() != null) {
            result.setAge(src.getAge());
        }

        if (src.getAvatar() != null) {
            result.setAvatar(src.getAvatar());
        }

        if (src.getEmail() != null) {
            result.setEmail(src.getEmail());
        }

        if (src.getPhoneNumber() != null) {
            result.setPhoneNumber(src.getPhoneNumber());
        }

        if (src.getVerification() != null) {
            result.setVerification(src.getVerification());
        }

        if (src.getPassword() != null) {
            result.setPassword(src.getPassword());
        }

        if (src.getBackgroundIcon() != null) {
            result.setBackgroundIcon(src.getBackgroundIcon());
        }

        if (src.getIdCard() != null) {
            result.setIdCard(src.getIdCard());
        }

        if (src.getAddress() != null) {
            appUser.setAddress(src.getAddress());
        }

        if (src.getPoints() != null) {
            appUser.setPoints(src.getPoints());
        }

        if (appUser != null) {
            result.setAppUser(appUser);
        }

        result.setWebUser(null);

        return result;
    }

    private User transformData(WebUserUpdate src) {
        User result = new User();
        WebUser webUser = new WebUser();

        if (src.getName() != null) {
            result.setName(src.getName());
        }

        if (src.getSex() != null) {
            result.setSex(src.getSex());
        }

        if (src.getAge() != null) {
            result.setAge(src.getAge());
        }

        if (src.getAvatar() != null) {
            result.setAvatar(src.getAvatar());
        }

        if (src.getEmail() != null) {
            result.setEmail(src.getEmail());
        }

        if (src.getPhoneNumber() != null) {
            result.setPhoneNumber(src.getPhoneNumber());
        }

        if (src.getVerification() != null) {
            result.setVerification(src.getVerification());
        }

        if (src.getPassword() != null) {
            result.setPassword(src.getPassword());
        }

        if (src.getBackgroundIcon() != null) {
            result.setBackgroundIcon(src.getBackgroundIcon());
        }

        if (src.getIdCard() != null) {
            result.setIdCard(src.getIdCard());
        }

        if (src.getCareers() != null) {
            webUser.setCareers(src.getCareers());
        }

        if (src.getPrivilege() != null) {
            webUser.setPrivilege(src.getPrivilege());
        }

        if (src.getPrivilegetype() != null) {
            webUser.setPrivilegetype(src.getPrivilegetype());
        }

        if (src.getCertificate() != null) {
            webUser.setCertificate(src.getCertificate());
        }

        if (src.getAssess() != null) {
            webUser.setAssess(src.getAssess());
        }

        if (webUser != null) {
            result.setWebUser(webUser);
        }

        result.setAppUser(null);

        return result;
    }

    @RequestMapping(value = "app_update", method = RequestMethod.POST)
    public @ResponseBody
    HashMap<String, Object> updateAppUser(@RequestBody String data, HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("*************data: " + data);

        AppUserUpate user_tbl = JSON.parseObject(data, AppUserUpate.class);
        logger.debug(JSON.toJSON(user_tbl));
        int rc = service.updateByPrimaryKeySelective(transformData(user_tbl));
        if (rc == 0) {
            errCodesIndex = ErrorCode.UPDATE_USER_ERROR;
        }
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }

    @RequestMapping(value = "web_update", method = RequestMethod.POST)
    public @ResponseBody
    HashMap<String, Object> updateWebUser(@RequestBody String data, HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("*************data: " + data);

        WebUserUpdate user_tbl = JSON.parseObject(data, WebUserUpdate.class);
        logger.debug(JSON.toJSON(user_tbl));
        int rc = service.updateByPrimaryKeySelective(transformData(user_tbl));
        if (rc == 0) {
            errCodesIndex = ErrorCode.UPDATE_USER_ERROR;
        }
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }

    @RequestMapping(value = "web_delete", method = RequestMethod.POST)
    public @ResponseBody
    HashMap<String, Object> deleteWebUser(@RequestBody String data, HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("***************data: " + data);

        UserDel del_info = JSON.parseObject(data, UserDel.class);
        int rc = service.deleteWebByPrimaryKey(del_info.getUserId());
        if (rc == 0) {
            errCodesIndex = ErrorCode.DELETE_USER_ERROR;
        }
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }

    @RequestMapping(value = "app_delete", method = RequestMethod.POST)
    public @ResponseBody
    HashMap<String, Object> deleteAppUser(@RequestBody String data, HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("***************data: " + data);

        UserDel del_info = JSON.parseObject(data, UserDel.class);
        int rc = service.deleteAppByPrimaryKey(del_info.getUserId());
        if (rc == 0) {
            errCodesIndex = ErrorCode.DELETE_USER_ERROR;
        }
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }
}