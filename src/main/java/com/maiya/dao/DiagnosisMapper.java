package com.maiya.dao;

import com.maiya.bean.Diagnosis;
import java.util.List;

public interface DiagnosisMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnosis_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnosis_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int insert(Diagnosis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnosis_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int insertSelective(Diagnosis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnosis_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    Diagnosis selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnosis_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int updateByPrimaryKeySelective(Diagnosis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnosis_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Diagnosis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnosis_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int updateByPrimaryKey(Diagnosis record);

    int insertBatchSelective(List<Diagnosis> records);

    int updateBatchByPrimaryKeySelective(List<Diagnosis> records);
}