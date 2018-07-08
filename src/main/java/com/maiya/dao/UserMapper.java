package com.maiya.dao;

import com.maiya.bean.User;
import com.maiya.bean.UserWithBLOBs;
import java.util.List;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int insert(UserWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int insertSelective(UserWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    UserWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int updateByPrimaryKeySelective(UserWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int updateByPrimaryKey(User record);

    int insertBatchSelective(List<User> records);

    int updateBatchByPrimaryKeySelective(List<User> records);
}