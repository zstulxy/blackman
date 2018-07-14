package com.maiya.controllers;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.maiya.bean.User;
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
public class UserControllers  extends AuthModule {
    private static Logger logger = Logger.getLogger(UserControllers.class);
    @Resource
    private UserService service;

    @RequestMapping(value="list",method= RequestMethod.GET)
    public @ResponseBody
    HashMap<String, Object> selectAllUser(HttpServletRequest request) {
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
        List<Object> userInfos = service.selectAll(userName);
        Long userId = this.getUserId();
        switch (this.getPrivilegeType()) {
            case 1:
            case 2:
                break;
            case 3: {
                HashMap<String, Object> paras = new HashMap<String, Object>();
                paras.put("name",userName);
                paras.put("userId",userId);
                userInfos = service.selectAllByUserId(paras);
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
        data_result.put("list", userInfos);
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        result.put("data", data_result);
        return result;
    }

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public @ResponseBody HashMap<String, Object> getUserById(HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();
        long id = Long.parseLong(request.getParameter("user_id"));
        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }

        User userInfo = service.selectByPrimaryKey(id);
        if (userInfo == null || userInfo.getId() != id) {
            errCodesIndex = ErrorCode.GET_VENDOR_BYID_ERROR;
            HashMap<String, Object> result_tmp = errorMsg.ErrorCodeMsg(errCodesIndex);
            return result_tmp;
        }

        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        result.put("data", userInfo);
        return result;
    }

    @RequestMapping(value="create",method=RequestMethod.POST)
    public @ResponseBody HashMap<String, Object> inertUser(@RequestBody String data, HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("*************data: " + data);

        UserTblCreate user_tbl = JSON.parseObject(data, UserTblCreate.class);
        logger.debug(JSON.toJSON(user_tbl));
        int rc = service.insertSelective(transformData(user_tbl));
        if (rc == 0) {
            errCodesIndex = ErrorCode.INSERT_USER_ERROR;
        }

        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }

    private User transformData(UserTblCreate src) {
        User result = new User();
        Byte privilegetType = src.getPrivilegetype();
        if (privilegetType > 0) {
            result.setPrivilegetype(privilegetType);
            result.setPrivilege(PrivilegeType.getName(privilegetType));
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

    @RequestMapping(value="update",method=RequestMethod.POST)
    public @ResponseBody HashMap<String, Object> updateUser(@RequestBody String data, HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("*************data: " + data);

        User user_tbl = JSON.parseObject(data, User.class);
        logger.debug(JSON.toJSON(user_tbl));
        int rc = service.updateByPrimaryKeySelective(user_tbl);
        if (rc == 0) {
            errCodesIndex = ErrorCode.UPDATE_USER_ERROR;
        }
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }

    @RequestMapping(value="delete",method=RequestMethod.POST)
    public @ResponseBody HashMap<String, Object> deleteUser(@RequestBody String data,HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("***************data: " + data);

        UserTblDel del_info = JSON.parseObject(data, UserTblDel.class);
        int rc = service.deleteByPrimaryKey(del_info.getUserId());
        if (rc == 0) {
            errCodesIndex = ErrorCode.DELETE_USER_ERROR;
        }
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }
}