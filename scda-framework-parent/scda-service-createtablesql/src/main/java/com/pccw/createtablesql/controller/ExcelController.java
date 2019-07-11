package com.pccw.createtablesql.controller;

import com.pccw.createtablesql.service.ExcelService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: xcl
 * @Date: 2019-4-18 15:18
 * @Version 1.0
 */
@RestController
public class ExcelController {
    @Autowired
    private ExcelService excelService;

    //文件上传

    /**
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/upload")
    public String uploadExcel(MultipartFile upload) throws Exception {


        if (upload.isEmpty()) {
            return "文件不能为空";
        }
        InputStream inputStream = upload.getInputStream();
        List<List<Object>> list = excelService.getBankListByExcel(inputStream, upload.getOriginalFilename());
        inputStream.close();

        for (int i = 0; i < list.size(); i++) {
            List<Object> lo = list.get(i);
            //TODO 随意发挥
            System.out.println(lo);

        }
        return "上传成功";
    }


    /**
     * excel中sheet的名称
     *
     * @param upload
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/uploadExcel")
    public String uploadExcelTOcreatTable(MultipartFile upload,
                                          @RequestParam("sheetName") String sheetName,
                                          @RequestParam("keyPrimaryNum") String keyPrimaryNum) throws Exception {
        if (upload.isEmpty()) {
            return "文件不能为空";
        }

        //获取文件写入流
        InputStream inputStream = upload.getInputStream();

        String sql = excelService.getCreateTableSql(inputStream, upload.getOriginalFilename(), sheetName, keyPrimaryNum);
        inputStream.close();
        return sql;
    }







}
