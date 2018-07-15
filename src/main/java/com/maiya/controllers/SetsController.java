package com.maiya.controllers;

import com.alibaba.fastjson.JSON;
import com.maiya.bean.Sets;
import com.maiya.bean.WebUser;
import com.maiya.common.ErrorCode;
import com.maiya.common.ErrorMsg;
import com.maiya.service.SetsService;
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
@RequestMapping("/sets")
public class SetsController extends AuthModule {
    private static Logger logger = Logger.getLogger(SetsController.class);
    @Resource
    private SetsService service;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public @ResponseBody
    HashMap<String, Object> selectByUserId(HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();
        long id = Long.parseLong(request.getParameter("user_id"));
        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }

        List<Object> sets = service.selectByUserId(id);
        if (sets.size() == 0) {
            errCodesIndex = ErrorCode.GET_VENDOR_BYID_ERROR;
            HashMap<String, Object> result_tmp = errorMsg.ErrorCodeMsg(errCodesIndex);
            return result_tmp;
        }

        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        result.put("data", sets);
        return result;
    }

    @RequestMapping(value="create",method=RequestMethod.POST)
    public @ResponseBody HashMap<String, Object> insertSets(@RequestBody String data, HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();
        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }

        Long userId = this.getUserId();
        String userName = this.getUserName();
        logger.debug("userId: " + userId + ", userName: " + userName);
        logger.debug("data: " + data);

        SetsCreate productTbl = JSON.parseObject(data, SetsCreate.class);
        int rc = service.insertSelective(transformData(productTbl));
        if (rc == 0) {
            errCodesIndex = ErrorCode.INSERT_PRODUCT_BYID_ERROR;
        }
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }

    @RequestMapping(value="update",method=RequestMethod.POST)
    public @ResponseBody HashMap<String, Object> updateProduct(@RequestBody String data, HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("*************data: " + data);

        Sets sets = JSON.parseObject(data, Sets.class);
        int rc = service.updateByPrimaryKeySelective(sets);
        if (rc == 0) {
            errCodesIndex = ErrorCode.UPDATE_PRODUCT_ERROR;
        }
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }

    @RequestMapping(value="delete",method=RequestMethod.POST)
    public @ResponseBody HashMap<String, Object> deleteProduct(@RequestBody String data,HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("***************data: " + data);

        SetsDel del_info = JSON.parseObject(data, SetsDel.class);
        int rc = service.deleteByPrimaryKey(del_info.getSetsId());
        if (rc == 0) {
            errCodesIndex = ErrorCode.DELETE_PRODUCT_ERROR;
        }
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }

    private Sets transformData(SetsCreate src) {
        Sets result = new Sets();

        if (src.getDentalfloss() != null) {
            result.setDentalfloss(src.getDentalfloss());
        }

        if (src.getDentalflossId() != null) {
            result.setDentalflossId(src.getDentalflossId());
        }

        if (src.getName() != null) {
            result.setName(src.getName());
        }

        if (src.getToothbrush() != null) {
            result.setToothbrush(src.getToothbrush());
        }

        if (src.getToothbrushId() != null) {
            result.setToothbrushId(src.getToothbrushId());
        }

        if (src.getMouthwash() != null) {
            result.setMouthwash(src.getMouthwash());
        }

        if (src.getMouthwashId() != null) {
            result.setMouthwashId(src.getMouthwashId());
        }

        if (src.getSales() != null) {
            result.setSales(src.getSales());
        }

        result.setUserId(getUserId());

        return result;
    }
}
