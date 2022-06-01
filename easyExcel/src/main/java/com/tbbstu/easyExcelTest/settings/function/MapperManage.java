package com.tbbstu.easyExcelTest.settings.function;

import com.tbbstu.easyExcelTest.settings.mapper.ClassMapper;
import com.tbbstu.easyExcelTest.settings.mapper.CollegeMapper;
import com.tbbstu.easyExcelTest.settings.mapper.MajorMapper;
import com.tbbstu.easyExcelTest.settings.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : 柠檬呀
 * @version ：1.0
 * @date : 2022/5/31 11:11:08
 */
@Component
public class MapperManage {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private ClassMapper classMapper;
    @Autowired
    private MajorMapper majorMapper;
    @Autowired
    private CollegeMapper collegeMapper;
    @Autowired
    private WriteConfig writeConfig;

    public MapperManage() {
    }

    public StudentMapper getStudentMapper() {
        return studentMapper;
    }

    public ClassMapper getClassMapper() {
        return classMapper;
    }

    public MajorMapper getMajorMapper() {
        return majorMapper;
    }

    public CollegeMapper getCollegeMapper() {
        return collegeMapper;
    }

    public WriteConfig getWriteConfig() {
        return writeConfig;
    }
}
