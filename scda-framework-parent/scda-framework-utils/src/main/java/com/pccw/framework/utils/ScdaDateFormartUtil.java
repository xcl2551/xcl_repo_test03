package com.pccw.framework.utils;



import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xcl
 * @Date: 2019-3-29 17:52
 * @Version 1.0
 */
public class ScdaDateFormartUtil {


    /**
     * 将字符串按,类型转换为日期
     * @param strDate
     * @param pattern
     * @return
     * @throws ParseException
     */
   public static Date stringToDate(String strDate,String pattern) throws ParseException {
      SimpleDateFormat date_format = new SimpleDateFormat(pattern);
       Date parse = date_format.parse(strDate);
       return parse;
   }


    /**
     * 将日期转为字符串
     * @param date
     * @param pattern
     * @return
     */
    public static String dateToString(Date date,String pattern){
        SimpleDateFormat date_format = new SimpleDateFormat(pattern);
        String format = date_format.format(date);
        return format;
    }



    /**
     * 将字符串按截取前4位按年,转换为日期
     * @param strDate
     * @param pattern
     * @return
     * @throws ParseException
     */
   public static Date stringToDateForYear(String strDate,String pattern) throws ParseException {
       String substring = strDate.substring(0, 4);
       SimpleDateFormat date_format = new SimpleDateFormat(pattern);
       Date parse = date_format.parse(substring + "-01-01");
       return parse;
   }



    /**
     * 依据传入时间字符串,与类型,判断字符串格式是否正确
     * @param strDate
     * @param pattern
     * @return
     */
   public static boolean checkSteDatePattern(String strDate,String pattern){

      if (strDate.length() != 10){
          return false;
      }

       SimpleDateFormat date_format = new SimpleDateFormat(pattern);

       try {
           date_format.parse(strDate);
       } catch (ParseException e) {
           //解析异常返回false
          return false;
       }
       //符合规格则返回true
       return true;
   }


    /**
     * 依据传入字符串获取范围的开始时间,结束时间
     * @param startCreateDate
     * @param endCreateDate
     * @return
     * @throws ParseException
     */
    public static Map<String,Date> getDateStartAndEnd(String startCreateDate, String endCreateDate) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //1.开始时间是一天的零点
        Date startDate = simpleDateFormat.parse(startCreateDate);
        //2.结束时间是一天的最后一秒
        Date endDate = simpleDateFormat.parse(endCreateDate);
        System.out.println("endDate = " + endDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(endDate);
        calendar.add(Calendar.DATE,1);
        endDate = calendar.getTime();
        Map<String, Date> stringDateHashMap = new HashMap<>();
        stringDateHashMap.put("startDate",startDate);
        stringDateHashMap.put("endDate",endDate);
        return stringDateHashMap;
    }

    /**
     * 将日期转换为24小时制的字符串
     * @param date
     * @return
     */
    public static String dateTo24HourStr(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        return format;
    }

}
