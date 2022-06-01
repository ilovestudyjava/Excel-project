package com.tbbstu.easyExcelTest.settings.function;

import com.tbbstu.easyExcelTest.settings.domain.ExcelClass;
import com.tbbstu.easyExcelTest.settings.mapper.StudentMapper;


import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : 柠檬呀
 * @version ：1.0
 * @date : 2022/5/27 14:14:40
 */

@Component
public class WriteConfig {

    public List<ExcelClass> data(StudentMapper studentMapper) {
        List<ExcelClass> excelClassList = studentMapper.getExcelClassList();
        System.out.println(excelClassList.get(0).toString());
        return excelClassList;
    }


}
