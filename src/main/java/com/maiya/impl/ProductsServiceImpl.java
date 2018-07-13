package com.maiya.impl;

import com.maiya.bean.Products;
import com.maiya.dao.ProductsMapper;
import com.maiya.service.ProductsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service("productsService")
public class ProductsServiceImpl implements ProductsService {
    @Resource
    private ProductsMapper dao;

    public int deleteByPrimaryKey(Long id) {
        return dao.deleteByPrimaryKey(id);
    }

    public int insert(Products record) {
        return dao.insert(record);
    }

    public int insertSelective(Products record) {
        return dao.insertSelective(record);
    }

    public Products selectByPrimaryKey(Long id) {
        return dao.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Products record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Products record) {
        return dao.updateByPrimaryKey(record);
    }

    public List<Products> selectByBrandType(Byte brandType) {
        return dao.selectByBrandType(brandType);
    }

    public List<Object> selectAllProducts(HashMap<String, Object> mapPara) {
        return dao.selectAllProducts(mapPara);
    }
}
