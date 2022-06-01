package com.tbbstu.easyExcelTest.settings.function;

import com.alibaba.excel.EasyExcel;
import com.tbbstu.easyExcelTest.commons.utils.UUIDUtil;
import com.tbbstu.easyExcelTest.settings.domain.ExcelClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : 柠檬呀
 * @version ：1.0
 * @date : 2022/5/27 17:17:36
 */


public class Start {
    private String path="E:\\excel\\";
    private MapperManage mapper;
    private WriteConfig writeConfig;

    public Start(){
        ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.mapper = (MapperManage) ap.getBean("mapperManage");
        this.writeConfig = (WriteConfig) ap.getBean("writeConfig");
    }

    /**
     * Function: 把Excel中的数据读入保存在Mysql数据库中(导入)
     * name:文件的名字（带有后缀）
     */
    @Test
    public void read(){
        String name = "EasyExcelba71aa14d0b0479fb9560bf1d1c2641d.xlsx";
        String fileName = path+name;
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, ExcelClass.class, new ReadConfig(mapper.getStudentMapper(),mapper.getClassMapper(),mapper.getMajorMapper(),mapper.getCollegeMapper())).sheet().doRead();
    }

    /**
     * Function: 把Mysql数据库里的数据写在Excel中(导出)
     * name:文件的名字
     * suffix:文件的后缀
     */
    @Test
    public void write() {
        String name = "EasyExcel"+ UUIDUtil.getUUID();
        String suffix = ".xlsx";
        String fileName = path+name+suffix;
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(fileName, ExcelClass.class).sheet("StudentList").doWrite(writeConfig.data(mapper.getStudentMapper()));
    }
}
