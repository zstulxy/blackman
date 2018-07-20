package com.maiya.dao;

import com.maiya.bean.BrandSeries;
import com.maiya.bean.BrandSeriesWithBLOBs;

public interface BrandSeriesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BrandSeriesWithBLOBs record);

    int insertSelective(BrandSeriesWithBLOBs record);

    BrandSeriesWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BrandSeriesWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BrandSeriesWithBLOBs record);

    int updateByPrimaryKey(BrandSeries record);
}