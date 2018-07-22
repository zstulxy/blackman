package com.maiya.controllers;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.maiya.bean.BrandSeriesWithBLOBs;
import com.maiya.bean.Classify;
import com.maiya.common.ErrorCode;
import com.maiya.common.ErrorMsg;
import com.maiya.service.ClassifyService;
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
@RequestMapping("/classify")
public class ClassifyController extends AuthModule {
    private static Logger logger = Logger.getLogger(ClassifyController.class);
    @Resource
    private ClassifyService service;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public @ResponseBody
    HashMap<String, Object> selectAll(HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        Integer pageNo = (request.getParameter("page_no") == null) ? 1
                : Integer.parseInt(request.getParameter("page_no"));
        Integer pageSize = (request.getParameter("page_size") == null) ? 10
                : Integer.parseInt(request.getParameter("page_size"));
        String token = request.getParameter("token");

        logger.debug("pageNo: " + pageNo + ", pageSIZE: " + pageSize + "token: " + token);
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }

        PageHelper.startPage(pageNo, pageSize);
        HashMap<String, Object> parameters = new HashMap<String, Object>();
        List<Object> products = service.selectAll(parameters);
        if (products.size() == 0) {
            errCodesIndex = ErrorCode.SELECT_USER_ERROR;
            HashMap<String, Object> result_tmp = errorMsg.ErrorCodeMsg(errCodesIndex);
            return result_tmp;
        }
        PageInfo page = new PageInfo(products);

        HashMap<String, Object> data_result = new HashMap<String, Object>();
        data_result.put("total", page.getTotal());
        data_result.put("pageNo", pageNo);
        data_result.put("type", "web");
        data_result.put("list", products);
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        result.put("data", data_result);

        return result;
    }


    @RequestMapping(value = "create", method = RequestMethod.POST)
    public @ResponseBody
    HashMap<String, Object> inertBrand(@RequestBody String data, HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("*************data: " + data);

        ClassifyBase brand = JSON.parseObject(data, ClassifyBase.class);
        logger.debug(JSON.toJSON(brand));
        int rc = service.insertSelective(TransformData(brand));
        if (rc == 0) {
            errCodesIndex = ErrorCode.INSERT_USER_ERROR;
        }

        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }

    private Classify TransformData(ClassifyBase src) {
        Classify result = new Classify();
        result.setClName(result.getClName());
        return result;
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public @ResponseBody
    HashMap<String, Object> updateClassify(@RequestBody String data, HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("*************data: " + data);

        ClassifyUpdate brand = JSON.parseObject(data, ClassifyUpdate.class);
        logger.debug(JSON.toJSON(brand));
        int rc = service.updateByPrimaryKeySelective(TransformData(brand));
        if (rc == 0) {
            errCodesIndex = ErrorCode.INSERT_USER_ERROR;
        }

        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }

    private Classify TransformData(ClassifyUpdate src) {
        Classify result = new Classify();
        result.setClassifyId(result.getClassifyId());
        result.setClName(result.getClName());
        return result;
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public @ResponseBody
    HashMap<String, Object> deleteClassify(@RequestBody String data, HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("*************data: " + data);

        ClassifyDel classifyDel = JSON.parseObject(data, ClassifyDel.class);
        logger.debug(JSON.toJSON(classifyDel));
        int rc = service.deleteByPrimaryKey(classifyDel.getClassifyId());
        if (rc == 0) {
            errCodesIndex = ErrorCode.INSERT_USER_ERROR;
        }

        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }
}
