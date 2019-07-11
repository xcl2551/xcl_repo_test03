package com.pccw.createtablesql.service;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.*;

/**
 * @Author: xcl
 * @Date: 2019-4-18 15:26
 * @Version 1.0
 */
@Service
public class ExcelService {


    public List<List<Object>> getBankListByExcel(InputStream in, String fileName) throws Exception {
        List list = new ArrayList<>();
        //创建Excel工作薄
        Workbook work = this.getWorkbook(in, fileName);
        if (null == work) {
            throw new Exception("创建Excel工作薄为空！");
        }
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;

        for (int i = 0; i < work.getNumberOfSheets(); i++) {
            sheet = work.getSheetAt(i);
            if (sheet == null) {
                continue;
            }

            for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {
                row = sheet.getRow(j);
                if (row == null || row.getFirstCellNum() == j) {
                    continue;
                }

                List<Object> li = new ArrayList<>();
                for (int y = row.getFirstCellNum(); y < row.getLastCellNum(); y++) {
                    cell = row.getCell(y);
                    li.add(cell);
                }
                list.add(li);
            }
        }
        work.close();

        return list;
    }


    /**
     * 通过sheet名称返回 建表sql
     * @param inputStream
     * @param fileName
     * @param sheetName
     * @param keyPrimaryNum
     * @return
     * @throws Exception
     */
    public String getCreateTableSql(InputStream inputStream, String fileName, String sheetName,String keyPrimaryNum) throws Exception {
        //创建Excel工作薄
        Workbook work = this.getWorkbook(inputStream, fileName);
        if (work == null) {
            throw new Exception("创建Excel工作薄为空！");
        }
        //通过 工作簿 的 sheet 名称 获取 工作表
        Sheet sheet = work.getSheet(sheetName);
        //从第  四行开始是表字段 ,注释, 字段类型
        //定义行
        Row row = null;
        //定义具体字段信息集合
        List<Map<String, String>> detailFieldList = new ArrayList<>();
        //
        String keyFieldStr = null;
        //遍历工作表的所有行,对每一行进行封装
        for (int i = 3; i < sheet.getLastRowNum() + 1; i++) {
            row = sheet.getRow(i);
            if (row == null) {
                break;
            }
            Map<String, String> oneToTableMap = new HashMap<>();
            String fieldStr = row.getCell(5).getStringCellValue();   //获取表的字段名称
            String commonStr = row.getCell(6).getStringCellValue();   //获取表的字段含义
            String typeDataStr = row.getCell(8).getStringCellValue();   //获取表的字段类型
            oneToTableMap.put("fieldStr", fieldStr);
            oneToTableMap.put("commonStr", commonStr);
            oneToTableMap.put("typeDataStr", typeDataStr);
            detailFieldList.add(oneToTableMap);
            if (commonStr.equals("主键")){
                keyFieldStr = fieldStr;
            }
        }

        //获取表名称
        String tableName = sheet.getRow(3).getCell(3).getStringCellValue();
        //获取组件字段的 str


        return this.setTableListToSql(detailFieldList, tableName,keyPrimaryNum,keyFieldStr);
    }

    /**
     * 针对oracle 数据库的sql拼接
     * @param detailFieldList
     * @param tableName
     * @param keyPrimaryNum
     * @param keyIdStr
     * @return
     */
    public String setTableListToSql(List<Map<String, String>> detailFieldList, String tableName,String keyPrimaryNum,String keyIdStr) {
        String sql = "";
        //sql 拼接第一段
        sql += "create table " + tableName + "   (\n";
        //拼接第二段 spdda_id 主键	,
        for (int i = 0; i < detailFieldList.size(); i++) {
            if (i == detailFieldList.size() - 1) {
                sql += detailFieldList.get(i).get("fieldStr") + "      " + detailFieldList.get(i).get("typeDataStr") + ")\n";
            } else {
                sql += detailFieldList.get(i).get("fieldStr") + "      " + detailFieldList.get(i).get("typeDataStr") + ",\n";
            }
        }

        //第二段拼接
        sql += "pctfree 10\n" +
                "        initrans 1\n" +
                "        maxtrans 255\n" +
                "        storage\n" +
                "                (\n" +
                "                        initial 64K\n" +
                "                        next 1\n" +
                "                        minextents 1\n" +
                "                        maxextents unlimited\n" +
                "                );\n";
        //第三段拼接-- 定义主键
        if (keyIdStr != null){
            sql+="alter table "+ tableName + " add constraint " + keyPrimaryNum +"  primary key ("+ keyIdStr+");\n";
        }
        //第四段拼接  --- 备注
        for (Map<String, String> stringStringMap : detailFieldList) {
            String commonStr = stringStringMap.get("commonStr");
            String fieldStr = stringStringMap.get("fieldStr");

            if (commonStr != null && commonStr != ""){
                sql += "comment on column  " + tableName + "."+ fieldStr + "   is  '"+ commonStr+"';\n";
            }
        }
        return sql;
    }


    /**
     * 判断文件格式
     *
     * @param inStr
     * @param fileName
     * @return
     * @throws Exception
     */
    public Workbook getWorkbook(InputStream inStr, String fileName) throws Exception {
        Workbook workbook = null;
        String fileType = fileName.substring(fileName.lastIndexOf("."));
        if (".xls".equals(fileType)) {
            workbook = new HSSFWorkbook(inStr);
        } else if (".xlsx".equals(fileType)) {
            workbook = new XSSFWorkbook(inStr);
        } else {
            throw new Exception("请上传excel文件！");
        }
        return workbook;
    }
}
