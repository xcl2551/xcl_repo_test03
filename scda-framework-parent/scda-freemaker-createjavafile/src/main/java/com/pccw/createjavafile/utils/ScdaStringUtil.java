package com.pccw.createjavafile.utils;

/**
 * @Author: xcl
 * @Date: 2019-4-19 15:24
 * @Version 1.0
 */
public class ScdaStringUtil {
    //首字母转小写
    public static String toLowerCaseFirstOne(String s){
        if(Character.isLowerCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
    }
    //首字母转大写
    public static String toUpperCaseFirstOne(String s){
        if(Character.isUpperCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
    }


    /**
     * 将数据库表名称 SCDA_PUR_TIME_TOTAL 进行处理
     * 1.转换为小写
     * 2._后的字母变大写
     * 3.去掉_
     * @param nameStr 字符串
     * @param typeStr 转换类型   值  "table","attr"
     * @return
     */
    public static String getJavaName(String nameStr, String typeStr) {
        //1.转换为小写
        nameStr = nameStr.toLowerCase();
        //2.将字符串转化为字符数组
        char[] chars = nameStr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 && typeStr.equals("table")) {
                chars[i] = (char) (chars[i] - 32);
            }
            if (chars[i] == '_' && chars[i + 1]>57) {
                chars[i + 1] = (char) (chars[i + 1] - 32);
            }
        }
        //3.将字符数组转化为字符串
        nameStr = new String(chars);
        //4.去掉"_"
        nameStr = nameStr.replace("_", "");
        return nameStr;
    }

}
