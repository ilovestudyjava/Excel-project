package com.tbbstu.easyExcelTest.settings.mapper;

import com.tbbstu.easyExcelTest.settings.domain.ExcelClass;
import com.tbbstu.easyExcelTest.settings.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Fri May 27 16:01:41 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Fri May 27 16:01:41 CST 2022
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Fri May 27 16:01:41 CST 2022
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Fri May 27 16:01:41 CST 2022
     */
    Student selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Fri May 27 16:01:41 CST 2022
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Fri May 27 16:01:41 CST 2022
     */
    int updateByPrimaryKey(Student record);

    void save(@Param("studentList") List<Student> list);

    List<ExcelClass> getExcelClassList();
}