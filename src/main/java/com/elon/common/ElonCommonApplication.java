package com.elon.common;

import com.elon.common.excel.ExcelReaderUtil;

import java.util.List;
import java.util.Map;

public class ElonCommonApplication {
    public static void main(String[] args) {
        ExcelReaderUtil excelReaderUtil = new ExcelReaderUtil();

        try {
            excelReaderUtil.readOneSheetByName("E:\\temp\\测试.xlsx", "测试2");
            List<Map<String, String>> dataList = excelReaderUtil.getDataList();

            excelReaderUtil.readOneSheetByName("E:\\temp\\测试.xlsx", "测试1");
            List<Map<String, String>> dataList2 = excelReaderUtil.getDataList();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Startup ElonCommonApplication success.");
    }
}
