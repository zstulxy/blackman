package com.maiya.service;

import com.maiya.bean.BrandSeries;
import com.maiya.bean.BrandSeriesWithBLOBs;

import java.util.HashMap;
import java.util.List;

public interface BrandSeriesService {
    int deleteByPrimaryKey(Long id);

    int insert(BrandSeriesWithBLOBs record);

    int insertSelective(BrandSeriesWithBLOBs record);

    BrandSeriesWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BrandSeriesWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BrandSeriesWithBLOBs record);

    int updateByPrimaryKey(BrandSeries record);

    List<Object> selectByBrand(HashMap<String, Object> parameters);

    List<Object> selectInventory(HashMap<String, Object> parameters);
}
