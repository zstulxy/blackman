package com.maiya.controllers;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.maiya.bean.BrandSeriesWithBLOBs;
import com.maiya.common.ErrorCode;
import com.maiya.common.ErrorMsg;
import com.maiya.service.BrandSeriesService;
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
@RequestMapping("/product")
public class BrandSeriesController extends AuthModule{
    private static Logger logger = Logger.getLogger(BrandSeriesController.class);
    @Resource
    private BrandSeriesService service;

    //商品管理接口
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

    //库存接口
    @RequestMapping(value = "inventory", method = RequestMethod.GET)
    public @ResponseBody
    HashMap<String, Object> selectInventory(HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        Integer pageNo = (request.getParameter("page_no") == null) ? 1
                : Integer.parseInt(request.getParameter("page_no"));
        Integer pageSize = (request.getParameter("page_size") == null) ? 10
                : Integer.parseInt(request.getParameter("page_size"));
        String brand_name_cn = request.getParameter("brand_name_cn");
        String brand_name_en = request.getParameter("brand_name_en");
        String classify_name = request.getParameter("classify_name");
        String product_name = request.getParameter("product_name");
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
        parameters.put("p_name",product_name);
        List<Object> products = service.selectInventory(parameters);
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

        BrandBase brand = JSON.parseObject(data, BrandBase.class);
        logger.debug(JSON.toJSON(brand));
        int rc = service.insertSelective(TransformData(brand));
        if (rc == 0) {
            errCodesIndex = ErrorCode.INSERT_USER_ERROR;
        }

        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }

    private BrandSeriesWithBLOBs TransformData(BrandBase src) {
        BrandSeriesWithBLOBs result = new BrandSeriesWithBLOBs();
        result.setbClassifyId(src.getbClassifyId());
        result.setBrandNameCn(src.getBrandNameCn());
        result.setBrandNameEn(src.getBrandNameEn());
        result.setLogo(src.getLogo());
        result.setbStatus(src.getbStatus());
        result.setDescr(src.getDescr());
        result.setStory(src.getStory());
        return result;
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public @ResponseBody
    HashMap<String, Object> updateBrand(@RequestBody String data, HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("*************data: " + data);

        BrandUpdate brand = JSON.parseObject(data, BrandUpdate.class);
        logger.debug(JSON.toJSON(brand));
        int rc = service.updateByPrimaryKeyWithBLOBs(TransformData(brand));
        if (rc == 0) {
            errCodesIndex = ErrorCode.INSERT_USER_ERROR;
        }

        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }

    private BrandSeriesWithBLOBs TransformData(BrandUpdate src) {
        BrandSeriesWithBLOBs result = new BrandSeriesWithBLOBs();
        result.setBrandId(src.getBrandId());
        result.setbClassifyId(src.getbClassifyId());
        result.setBrandNameCn(src.getBrandNameCn());
        result.setBrandNameEn(src.getBrandNameEn());
        result.setLogo(src.getLogo());
        result.setbStatus(src.getbStatus());
        result.setDescr(src.getDescr());
        result.setStory(src.getStory());
        return result;
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public @ResponseBody
    HashMap<String, Object> deleteBrand(@RequestBody String data, HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }
        logger.debug("*************data: " + data);

        BrandDel brand = JSON.parseObject(data, BrandDel.class);
        logger.debug(JSON.toJSON(brand));
        int rc = service.deleteByPrimaryKey(brand.getBrandId());
        if (rc == 0) {
            errCodesIndex = ErrorCode.INSERT_USER_ERROR;
        }

        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }
}
