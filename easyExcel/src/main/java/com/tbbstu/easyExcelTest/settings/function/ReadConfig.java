package com.tbbstu.easyExcelTest.settings.function;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.tbbstu.easyExcelTest.settings.domain.*;
import com.tbbstu.easyExcelTest.settings.domain.Class;
import com.tbbstu.easyExcelTest.settings.mapper.ClassMapper;
import com.tbbstu.easyExcelTest.settings.mapper.CollegeMapper;
import com.tbbstu.easyExcelTest.settings.mapper.MajorMapper;
import com.tbbstu.easyExcelTest.settings.mapper.StudentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : 柠檬呀
 * @version ：1.0
 * @date : 2022/5/27 14:14:43
 */


// 有个很重要的点 excelClassListener 不能被spring管理，要每次读取excel都要new,然后里面用到spring可以构造方法传进去
public class ReadConfig extends AnalysisEventListener<ExcelClass> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReadConfig.class);
    /**
     * 每隔3000条存储到数据库，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 3000;
    List<Student> list = new ArrayList<Student>();
    private StudentMapper studentMapper;

    private ClassMapper classMapper;

    private MajorMapper majorMapper;

    private CollegeMapper collegeMapper;

    public ReadConfig() {
    }

    /**
     * 如果使用了spring,请使用这个构造方法。每次创建Listener的时候需要把spring管理的类传进来
     *
     * @param studentMapper
     */
    public ReadConfig(StudentMapper studentMapper, ClassMapper classMapper, MajorMapper majorMapper, CollegeMapper collegeMapper) {
        this.studentMapper = studentMapper;
        this.collegeMapper = collegeMapper;
        this.classMapper = classMapper;
        this.majorMapper = majorMapper;
    }

    /**
     * 这个每一条数据解析都会来调用
     *
     * @param excelClass
     *            one row value. Is is same as {@link AnalysisContext#readRowHolder()}
     * @param context
     */
    @Override
    public void invoke(ExcelClass excelClass, AnalysisContext context) {
        Student student = new Student();
        Class className = classMapper.getClassByName(excelClass.getClassName());
        Major major = majorMapper.getMajorByName(excelClass.getMajor());
        College college = collegeMapper.getCollegeByName(excelClass.getCollege());

        student.setId(excelClass.getId());
        student.setClassId(className.getId());
        student.setCollegeId(college.getId());
        student.setMajorId(major.getId());

        student.setIdentityId(excelClass.getIdentity());
        student.setImage(excelClass.getImage());
        student.setReportTime(excelClass.getReport_date()+"");
        student.setState(excelClass.getState());

        list.add(student);
        System.out.println(list);
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (list.size() >= BATCH_COUNT) {
            saveData();
            // 存储完成清理 list
            list.clear();
        }
    }
    /**
     * 所有数据解析完成了 都会来调用
     *
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
//         这里也要保存数据，确保最后遗留的数据也存储到数据库
            saveData();
        LOGGER.info("所有数据解析完成！");
    }
    /**
     * 加上存储数据库
     */
    private void saveData() {
        studentMapper.save(list);
    }



}
