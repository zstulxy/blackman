package com.maiya.service;

import com.maiya.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface UserService {
	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tbl
     *
     * @mbggenerated
     */
    public int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tbl
     *
     * @mbggenerated
     */
    public int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tbl
     *
     * @mbggenerated
     */
    public User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tbl
     *
     * @mbggenerated
     */
    public int updateByPrimaryKeySelective(User record);

    public User selectWebUserByPassword(@Param("name") String name, @Param("password") String password);

    public User selectAppUserByPassword(@Param("name") String name, @Param("password") String password);

	public List<Object> selectAppAllUser(String name);

    public List<Object> selectAllAppByUserId(HashMap<String, Object> parameters);

    public List<Object> selectWebAllUser(String name);

    public List<Object> selectAllWebByUserId(HashMap<String, Object> parameters);

    public User selectVerifyCodeByPhone(String phone_number);

    public int updateByPhone(User record);
}
