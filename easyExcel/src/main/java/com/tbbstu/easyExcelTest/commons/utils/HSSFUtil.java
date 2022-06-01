//package com.tbbstu.easyExcelTest.commons.utils;
//
//import org.apache.poi.hssf.usermodel.HSSFCell;
//
///**
// * @author : 柠檬呀
// * @version ：1.0
// * @date : 2022/5/25 14:14:56
// */
//public class HSSFUtil {
//    public static String getHSSFCellValue(HSSFCell cell){
//        String res = "";
//        if(cell.getCellType() == HSSFCell.CELL_TYPE_BOOLEAN){
//            res = cell.getBooleanCellValue() + "";
//        }else if(cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC){
//            res = (int)cell.getNumericCellValue() + "";
//        }else if(cell.getCellType() == HSSFCell.CELL_TYPE_STRING){
//            res = cell.getStringCellValue();
//        }else if(cell.getCellType() == HSSFCell.CELL_TYPE_FORMULA){
//            res = cell.getCellFormula();
//        }
//        return res;
//    }
//}
