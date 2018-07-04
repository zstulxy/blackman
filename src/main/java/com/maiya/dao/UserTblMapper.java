package com.maiya.dao;

import com.maiya.bean.UserTbl;
import com.maiya.bean.UserTblExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTblMapper {
    int countByExample(UserTblExample example);

    int deleteByExample(UserTblExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTbl record);

    int insertSelective(UserTbl record);

    List<UserTbl> selectByExampleWithBLOBs(UserTblExample example);

    List<UserTbl> selectByExample(UserTblExample example);

    UserTbl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserTbl record, @Param("example") UserTblExample example);

    int updateByExampleWithBLOBs(@Param("record") UserTbl record, @Param("example") UserTblExample example);

    int updateByExample(@Param("record") UserTbl record, @Param("example") UserTblExample example);

    int updateByPrimaryKeySelective(UserTbl record);

    int updateByPrimaryKeyWithBLOBs(UserTbl record);

    int updateByPrimaryKey(UserTbl record);
}