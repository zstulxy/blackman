package com.maiya.dao;

import com.maiya.bean.Knowlege;
import java.util.List;

public interface KnowlegeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int insert(Knowlege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int insertSelective(Knowlege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    Knowlege selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int updateByPrimaryKeySelective(Knowlege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Knowlege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    int updateByPrimaryKey(Knowlege record);

    int insertBatchSelective(List<Knowlege> records);

    int updateBatchByPrimaryKeySelective(List<Knowlege> records);
}