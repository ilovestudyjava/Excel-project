package com.tbbstu.easyExcelTest.commons.domain;

/**
 * @author : 柠檬呀
 * @version ：1.0
 * @date : 2022/5/17 21:21:53
 */
public class returnObject {

    public String code;
    public String message;
    public Object retDate;
    public int count;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getRetDate() {
        return retDate;
    }

    public void setRetDate(Object retDate) {
        this.retDate = retDate;
    }
}
