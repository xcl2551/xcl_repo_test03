package com.pccw.createtablesql.controller;

import org.springframework.web.bind.annotation.RestController;

import java.io.*;

/**
 * @Author: xcl
 * @Date: 2019-4-23 17:50
 * @Version 1.0
 */
@RestController
public class CopyFileController {

    public void copyMybatisFile() throws IOException {
        //1.复制mapper.xml文件
        //源 E:\generatorSqlmapCustom\resource\com\pccw\purchasetime\mapper
        //目标 E:\BI-SCDA\scda-framework-parent\scda-service-purchasetime\src\main\resources\com\pccw\purchasetime\mapper
        String srcMapperXml = "E:\\generatorSqlmapCustom\\resource\\com\\pccw\\purchasetime\\mapper";
        String targetMapperXml = "E:\\BI-SCDA\\scda-framework-parent\\scda-service-purchasetime\\src\\main\\resources\\com\\pccw\\purchasetime\\mapper";
        this.copyfile(srcMapperXml,targetMapperXml);
        //2.复制 mapper 接口文件
        //源 E:\generatorSqlmapCustom\src\com\pccw\purchasetime\mapper
        //目标 E:\BI-SCDA\scda-framework-parent\scda-service-purchasetime\src\main\java\com\pccw\purchasetime\mapper
        String srcMapper = "E:\\generatorSqlmapCustom\\src\\com\\pccw\\purchasetime\\mapper";
        String targetMapper = "E:\\BI-SCDA\\scda-framework-parent\\scda-service-purchasetime\\src\\main\\java\\com\\pccw\\purchasetime\\mapper";
        this.copyfile(srcMapper,targetMapper);
        //3.复制 daomian 文件
        //源 E:\generatorSqlmapCustom\src\com\pccw\framework\domain\purchasetime
        //目标 E:\BI-SCDA\scda-framework-parent\scda-framework-model\src\main\java\com\pccw\framework\domain\purchasetime
        String srcDomain = "E:\\generatorSqlmapCustom\\src\\com\\pccw\\framework\\domain\\purchasetime";
        String targetDomain = "E:\\BI-SCDA\\scda-framework-parent\\scda-framework-model\\src\\main\\java\\com\\pccw\\framework\\domain\\purchasetime";
        this.copyfile(srcDomain,targetDomain);
    }


    /**
     * 复制文件下的文件
     * @param srcPathStr
     * @param targetPathStr
     * @throws IOException
     */
    private void copyfile(String srcPathStr, String targetPathStr) throws IOException {
        File srcFile = new File(srcPathStr);    //源文件夹
        //目标文件夹
        File[] files = srcFile.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                //创建流对象
                BufferedInputStream inBuff = new BufferedInputStream(new FileInputStream(file));
                BufferedOutputStream outBuff = new BufferedOutputStream(new FileOutputStream(new File(targetPathStr + "\\" + file.getName())));
                //读写数据
                // 缓冲数组
                byte[] b = new byte[1024 * 5];
                int len;
                while ((len = inBuff.read(b)) != -1) {
                    outBuff.write(b, 0, len);
                }
                // 刷新此缓冲的输出流
                outBuff.flush();
                //释放资源
                outBuff.close();
                inBuff.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        CopyFileController copyFileController = new CopyFileController();
        copyFileController.copyMybatisFile();
    }

}
