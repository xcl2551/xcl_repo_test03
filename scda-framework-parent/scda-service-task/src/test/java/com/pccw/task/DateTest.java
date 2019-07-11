package com.pccw.task;

import com.pccw.framework.utils.ScdaDateFormartUtil;

import java.text.ParseException;
import java.util.Date;

/**
 * @Author: xcl
 * @Date: 2019-4-16 13:25
 * @Version 1.0
 */
public class DateTest {

    public static void main(String[] args) throws ParseException {

        String s = "100000000000000000000000000000000000";

        double v = Double.parseDouble(s);
        String s1 = String.valueOf(v);
        System.out.println("s1 = " + s1);
        System.out.println("v = " + v);

    }
}
