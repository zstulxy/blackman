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
import com.maiya.service.AppUserService;
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
@RequestMapping("/app_user")
public class AppUserControllers extends AuthModule {
    private static Logger logger = Logger.getLogger(AppUserControllers.class);
    @Resource
    private AppUserService service;

    @RequestMapping(value = "list", method = RequestMethod.GET)
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

    @RequestMapping(value = "info", method = RequestMethod.GET)
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

       AppUser userInfo = service.selectAppUserByUserId(id);
        if (userInfo == null || userInfo.getId() != id) {
            errCodesIndex = ErrorCode.GET_VENDOR_BYID_ERROR;
            HashMap<String, Object> result_tmp = errorMsg.ErrorCodeMsg(errCodesIndex);
            return result_tmp;
        }

        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        result.put("data", userInfo);
        return result;
    }



    @RequestMapping(value = "create", method = RequestMethod.POST)
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

    private AppUser transformData(AppUserCreate src) {
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

        if (result != null) {
            appUser.setUser(result);
        }

        return appUser;
    }


    private AppUser transformData(AppUserUpate src) {
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

        if (result != null) {
            appUser.setUser(result);
        }

        return appUser;
    }


    @RequestMapping(value = "update", method = RequestMethod.POST)
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

    @RequestMapping(value = "delete", method = RequestMethod.POST)
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