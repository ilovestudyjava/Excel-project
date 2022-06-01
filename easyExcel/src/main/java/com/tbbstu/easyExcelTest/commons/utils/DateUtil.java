package com.tbbstu.easyExcelTest.commons.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : 柠檬呀
 * @version ：1.0
 * @date : 2022/5/17 21:21:59
 */
public class DateUtil {

    public static String formateDateTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowDateTime = sdf.format(new Date());
        return nowDateTime;
    }
    public static String formateDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String nowDate = sdf.format(new Date());
        return nowDate;
    }
    public static String formateTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String nowTime = sdf.format(new Date());
        return nowTime;
    }
}
