package com.pccw.framework.utils;

import java.io.UnsupportedEncodingException;

/**
 * @Author: xcl
 * @Date: 2019-5-5 16:01
 * @Version 1.0
 */
public class FileUtil {

    public static String encodeDownloadFilename(String filename,String agent) throws UnsupportedEncodingException {

        if (agent.contains("MSIE") || agent.contains("Trident")) {
            //IE浏览器处理
            filename = java.net.URLEncoder.encode(filename, "UTF-8");
        } else {
            // 非IE浏览器的处理：
            filename = new String(filename.getBytes("UTF-8"), "ISO-8859-1");
        }

        return filename;
    }


}
