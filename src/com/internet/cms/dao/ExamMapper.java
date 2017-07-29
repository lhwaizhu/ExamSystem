package com.internet.cms.dao;

import com.internet.cms.model.Exam;
import com.internet.cms.model.ExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbggenerated Sun Apr 09 17:19:10 CST 2017
     */
    int countByExample(ExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbggenerated Sun Apr 09 17:19:10 CST 2017
     */
    int deleteByExample(ExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbggenerated Sun Apr 09 17:19:10 CST 2017
     */
    int deleteByPrimaryKey(Integer examId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbggenerated Sun Apr 09 17:19:10 CST 2017
     */
    int insert(Exam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbggenerated Sun Apr 09 17:19:10 CST 2017
     */
    int insertSelective(Exam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbggenerated Sun Apr 09 17:19:10 CST 2017
     */
    List<Exam> selectByExample(ExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbggenerated Sun Apr 09 17:19:10 CST 2017
     */
    Exam selectByPrimaryKey(Integer examId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbggenerated Sun Apr 09 17:19:10 CST 2017
     */
    int updateByExampleSelective(@Param("record") Exam record, @Param("example") ExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbggenerated Sun Apr 09 17:19:10 CST 2017
     */
    int updateByExample(@Param("record") Exam record, @Param("example") ExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbggenerated Sun Apr 09 17:19:10 CST 2017
     */
    int updateByPrimaryKeySelective(Exam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbggenerated Sun Apr 09 17:19:10 CST 2017
     */
    int updateByPrimaryKey(Exam record);
}