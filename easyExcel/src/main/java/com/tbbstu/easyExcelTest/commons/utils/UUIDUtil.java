package com.tbbstu.easyExcelTest.commons.utils;

import java.util.UUID;

/**
 * @author : 柠檬呀
 * @version ：1.0
 * @date : 2022/5/21 22:22:02
 */
public class UUIDUtil {

    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
