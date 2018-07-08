package com.maiya.dao;

import com.maiya.bean.PromotionTbl;

public interface PromotionTblMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PromotionTbl record);

    int insertSelective(PromotionTbl record);

    PromotionTbl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PromotionTbl record);

    int updateByPrimaryKey(PromotionTbl record);
}