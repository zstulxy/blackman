package com.maiya.dao;

import com.maiya.bean.CouponTbl;

public interface CouponTblMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CouponTbl record);

    int insertSelective(CouponTbl record);

    CouponTbl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CouponTbl record);

    int updateByPrimaryKey(CouponTbl record);
}