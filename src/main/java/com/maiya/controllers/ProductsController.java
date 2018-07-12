package com.maiya.controllers;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.maiya.bean.Products;
import com.maiya.common.ErrorCode;
import com.maiya.common.ErrorMsg;
import com.maiya.service.ProductsService;
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
@RequestMapping("/products")
public class ProductsController extends AuthModule {
    private static Logger logger = Logger.getLogger(ProductsController.class);
    @Resource
    private ProductsService service;

    @RequestMapping(value="list", method= RequestMethod.GET)
    public @ResponseBody
    HashMap<String, Object> getProducts(HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        Integer pageNo = (request.getParameter("page_no") == null) ? 1
                : Integer.parseInt(request.getParameter("page_no"));
        Integer pageSize = (request.getParameter("page_size") == null) ? 10
                : Integer.parseInt(request.getParameter("page_size"));
        String name = request.getParameter("name");
        String token = request.getParameter("token");
        Byte brandType = Byte.parseByte(request.getParameter("type"));
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }

        PageHelper.startPage(pageNo, pageSize);
        List<Products> products = service.selectByBrandType(brandType);
        if (products.size() == 0) {
            errCodesIndex = ErrorCode.GET_PRODUCTS_LIST_ERROR;
            HashMap<String, Object> result_tmp = errorMsg.ErrorCodeMsg(errCodesIndex);
            return result_tmp;
        }

        PageInfo page = new PageInfo(products);
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        result.put("list", products);
        result.put("pageNo", pageNo);
        result.put("total", page.getTotal());
        result.put("filterName", name);
//		logger.info(JSON.toJSONString(result));
        return result;
    }

    @RequestMapping(value="info", method=RequestMethod.GET)
    public @ResponseBody HashMap<String, Object> getProductById(HttpServletRequest request) {
        ErrorCode errCodesIndex = ErrorCode.SUCCESS;
        ErrorMsg errorMsg = new ErrorMsg();

        long product_id = Long.parseLong(request.getParameter("product_id"));

        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            errCodesIndex = ErrorCode.TOKEN_ERROR;
            return errorMsg.ErrorCodeMsg(errCodesIndex);
        }

        Products products = service.selectByPrimaryKey(product_id);
        if (products != null && products.getId() != product_id) {
            errCodesIndex = ErrorCode.GET_PRODUCTS_LIST_ERROR;
            HashMap<String, Object> result_tmp = errorMsg.ErrorCodeMsg(errCodesIndex);
            return result_tmp;
        }
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        result.put("data", products);

        return result;
    }

    @RequestMapping(value="create",method=RequestMethod.POST)
    public @ResponseBody HashMap<String, Object> inertProduct(@RequestBody String data, HttpServletRequest request) {
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

        ProductTblCreate vendor_tbl = JSON.parseObject(data, ProductTblCreate.class);
        int rc = service.insert(transformData(vendor_tbl));
        if (rc == 0) {
            errCodesIndex = ErrorCode.INSERT_PRODUCT_BYID_ERROR;
        }
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }

    private Products transformData(ProductTblCreate src) {
        Products result = new Products();
        result.setBrand(src.getBrand());
        result.setBrandType(src.getBrandType());
        result.setPrice(src.getPrice());
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

        Products products = JSON.parseObject(data, Products.class);
        int rc = service.updateByPrimaryKeySelective(products);
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

        ProductTblDelete del_info = JSON.parseObject(data, ProductTblDelete.class);
        int rc = service.deleteByPrimaryKey(del_info.getProductId());
        if (rc == 0) {
            errCodesIndex = ErrorCode.DELETE_PRODUCT_ERROR;
        }
        HashMap<String, Object> result = errorMsg.ErrorCodeMsg(errCodesIndex);
        return result;
    }

}
