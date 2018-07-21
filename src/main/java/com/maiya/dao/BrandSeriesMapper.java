package com.maiya.dao;

import com.maiya.bean.BrandSeries;
import com.maiya.bean.BrandSeriesWithBLOBs;

import java.util.HashMap;
import java.util.List;

public interface BrandSeriesMapper {
    int deleteByPrimaryKey(Long brandId);

    int insert(BrandSeriesWithBLOBs record);

    int insertSelective(BrandSeriesWithBLOBs record);

    BrandSeriesWithBLOBs selectByPrimaryKey(Long brandId);

    int updateByPrimaryKeySelective(BrandSeriesWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BrandSeriesWithBLOBs record);

    int updateByPrimaryKey(BrandSeries record);

    List<Object> selectByBrand(HashMap<String, Object> parameters);

    List<Object> selectInventory(HashMap<String, Object> parameters);
}