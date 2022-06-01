package com.tbbstu.easyExcelTest.settings.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import lombok.Data;

import java.net.URL;
import java.sql.Date;
import java.time.LocalDateTime;

/**
 * @author : 柠檬呀
 * @version ：1.0
 * @date : 2022/5/27 16:16:05
 */

@Data
public class ExcelClass {
    @ExcelProperty("学号")
    private String id;
    @ExcelProperty("学院")
    private String college;
    @ExcelProperty("专业")
    private String major;
    @ExcelProperty("班级")
    private String className;

    @ExcelProperty("身份证号")
    private String identity;

    @ExcelProperty("报到时间")
    @DateTimeFormat(value="yyyy-MM-dd hh:mm:ss")
    private String report_date;

    @ExcelProperty("照片")
    private String image;
    @ExcelProperty("状态(在校、辍学)")
    private String state;

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }


    public String getReport_date() {
        return report_date;
    }

    public void setReport_date(String report_date) {
        this.report_date = report_date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "excelClass{" +
                "id='" + id + '\'' +
                ", college='" + college + '\'' +
                ", major='" + major + '\'' +
                ", className='" + className + '\'' +
                ", identity='" + identity + '\'' +
                ", report_date='" + report_date + '\'' +
                ", image='" + image + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
