package com.pccw.createjavafile.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xcl
 * @Date: 2019-4-19 10:12
 * @Version 1.0
 */
@RestController
public class TableDetailController {

    public static void main(String[] args) {
        String s = "E:\\BI-SCDA\\scda-framework-parent\\scda-freemaker-createjavafile"; // E:\BI-SCDA\scda-framework-parent\scda-freemaker-createjavafile

        //截取最后一个/

        int i = s.indexOf("\\scda-framework-parent");
        System.out.println("i = " + i);

        String substring = s.substring(0, i);
        System.out.println("substring = " + substring);
        substring = substring+"\\scda-framework-parent";
        System.out.println("substring = " + substring);
    }

}
