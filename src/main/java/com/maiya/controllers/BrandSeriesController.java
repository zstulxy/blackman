package com.maiya.controllers;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.maiya.bean.BrandSeries;
import com.maiya.common.ErrorCode;
import com.maiya.common.ErrorMsg;
import com.maiya.service.BrandSeriesService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/product")
public class BrandSeriesController extends AuthModule{
    private static Logger logger = Logger.getLogger(BrandSeriesController.class);
    @Resource
    private BrandSeriesService service;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public @ResponseBody
    HashMap<String, Object> selectAllProducts(HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        Integer pageNo = (request.getParameter("page_no") == null) ? 1
                : Integer.parseInt(request.getParameter("page_no"));
        Integer pageSize = (request.getParameter("page_size") == null) ? 10
                : Integer.parseInt(request.getParameter("page_size"));
        String brand_name_cn = request.getParameter("brand_name_cn");
        String brand_name_en = request.getParameter("brand_name_en");
        String classify_name = request.getParameter("classify_name");
        String token = request.getParameter("token");

        logger.debug("pageNo: " + pageNo + ", pageSIZE: " + pageSize + "userName: " + brand_name_cn + "token: " + token);
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }

        PageHelper.startPage(pageNo, pageSize);
        HashMap<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("brand_name_cn", brand_name_cn);
        parameters.put("brand_name_en", brand_name_en);
        parameters.put("cl_name", classify_name);
        List<Object> products = service.selectByBrand(parameters);
        if (products.size() == 0) {
            errCodesIndex = ErrorCode.SELECT_USER_ERROR;
            HashMap<String, Object> result_tmp = errorMsg.ErrorCodeMsg(errCodesIndex);
            return result_tmp;
        }
        PageInfo page = new PageInfo(products);

        HashMap<String, Object> data_result = new HashMap<String, Object>();
        data_result.put("total", page.getTotal());
        data_result.put("pageNo", pageNo);
        data_result.put("filterName", brand_name_cn);
        data_result.put("type", "web");
        data_result.put("list", products);
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        result.put("data", data_result);

        return result;
    }

}
