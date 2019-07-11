package com.pccw.framework.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xcl
 * @Date: 2019-4-14 12:09
 * @Version 1.0
 */
public class MonthDynamicArrayUtil {

    /**
     * 依据传入的截止时间,将1~12月字符串数字转换为索引11为,截止日期的月份
     *
     * @param strDeadline
     * @param srcStr
     * @return
     */
    public static String getDynMonthArray(String strDeadline, String srcStr) {
        //获取传入字符串的月份对应的数值,作为索引动态依据
        String substring = strDeadline.substring(5, 7);
        //将字符串转化解析为数字
        int indexInt = Integer.parseInt(substring);

        //将srcStr "[\"105\",\"141\",\"149\",\"181\",\"261\",\"197\",\"147\",\"242\",\"197\",\"209\",\"19\",\"14\"]";
        //转换为有序集合
        List<String> srcStrList = JSON.parseArray(srcStr, String.class);
        //按月份进行截取
        List<String> targetList1 = srcStrList.subList(0, indexInt);
        List<String> targetList2 = srcStrList.subList(indexInt, srcStrList.size());

        //合并集合
        ArrayList<String> targetList = new ArrayList<>();
        boolean b2 = targetList.addAll(targetList2);
        boolean b1 = targetList.addAll(targetList1);

        //将集合转化为json字符串
        String targetStr = JSON.toJSONString(targetList);
        return targetStr;
    }
}
