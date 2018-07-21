package com.maiya.impl;

import com.maiya.bean.BrandSeries;
import com.maiya.bean.BrandSeriesWithBLOBs;
import com.maiya.dao.BrandSeriesMapper;
import com.maiya.service.BrandSeriesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service("brandSeriesService")
public class BrandSeriesServiceImpl implements BrandSeriesService {
    @Resource
    private BrandSeriesMapper dao;

    public int deleteByPrimaryKey(Long id) {
        return dao.deleteByPrimaryKey(id);
    }

    public int insert(BrandSeriesWithBLOBs record) {
        return dao.insert(record);
    }

    public int insertSelective(BrandSeriesWithBLOBs record) {
        return dao.insertSelective(record);
    }

    public BrandSeriesWithBLOBs selectByPrimaryKey(Long id) {
        return dao.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(BrandSeriesWithBLOBs record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKeyWithBLOBs(BrandSeriesWithBLOBs record) {
        return dao.updateByPrimaryKeyWithBLOBs(record);
    }

    public int updateByPrimaryKey(BrandSeries record) {
        return dao.updateByPrimaryKey(record);
    }

    public List<Object> selectByBrand(HashMap<String, Object> parameters) {
        return dao.selectByBrand(parameters);
    }
}
