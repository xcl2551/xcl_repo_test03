package com.pccw.createjavafile.service;

import com.pccw.createjavafile.domain.TableDetail;
import com.pccw.createjavafile.mapper.TableDetailMapper;
import com.pccw.createjavafile.utils.ScdaDateTimeUtils;
import com.pccw.createjavafile.utils.ScdaStringUtil;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @Author: xcl
 * @Date: 2019-4-19 10:12
 * @Version 1.0
 */
@Service
public class TableDetailService {
    @Autowired
    private TableDetailMapper tableDetailMapper;

    public void getGet(String tableName) throws IOException, TemplateException {
        //1.获取模板数据
        Map<String, Object> map = this.getBaseMap(tableName);

        //2. 设置模板名称
        String requestTemplateName = "tablePojoGet.ftl";

        //3. 设置文件输出位置
        String outPath = "d:\\"+tableName+".txt";
        this.getGenerateClass(map, requestTemplateName, outPath);
    }


    /**
     * 生成 request response controllerAPI controller service 五类 java文件
     * @param tableName
     * @throws IOException
     * @throws TemplateException
     */
    public void getAutoClassFromOracleTableName(String tableName,String projectModelName) throws IOException, TemplateException {
        //获取javaBean类名称
        String javaBeanName = ScdaStringUtil.getJavaName(tableName, "table");
        //1. 设置数据模型
        Map<String, Object> map = this.getBaseMap(tableName);
        map.put("modelName","purchasetime");    //模块名称
        map.put("tableName",tableName);         //oracle 数据库表名称
        //设置筛选条件集合
        List<TableDetail>  tableDetailList = (List<TableDetail>) map.get("tableDetailList");
        //筛选注释中纯在  "筛选" 两字的字符
        List<TableDetail> tableDetailConditions = new ArrayList<>();
        for (TableDetail tableDetail : tableDetailList) {
            if (tableDetail.getComments() != null && tableDetail.getComments().contains("筛选") ){
                tableDetailConditions.add(tableDetail);
            }
        }
        map.put("tableDetailConditions",tableDetailConditions);
        //2. 设置模板名称
        String requestTemplateName = "TableRequest.ftl";
        String responseTemplateName = "TableResponse.ftl";
        String controllerApiTemplateName = "TableControllerApi.ftl";
        String controllerTemplateName = "TableController.ftl";
        String serviceTemplateName = "TableService.ftl";
        //3. 设置文件输出位置
        String projectPath = System.getProperty("user.dir");  //E:\BI-SCDA\scda-framework-parent\scda-freemaker-createjavafile
        //获取项目所在路径
        String basePath = projectPath.substring(0,projectPath.indexOf("\\scda-framework-parent")); //E:\BI-SCDA
        String projectRealPath = basePath + "\\scda-framework-parent";  //E:\BI-SCDA\scda-framework-parent
        //修改projectPath
        String requestPathOutName = projectRealPath + "\\scda-framework-model\\src\\main\\java\\com\\pccw\\framework\\domain\\purchasetime\\request\\" + javaBeanName + "Request.java";
        String responsePathOutName = projectRealPath+ "\\scda-framework-model\\src\\main\\java\\com\\pccw\\framework\\domain\\purchasetime\\response\\" + javaBeanName + "Result.java";
        String controllerApiPathOutName = projectRealPath + "\\scda-service-api\\src\\main\\java\\com\\pccw\\api\\purchasetime\\" + javaBeanName + "ControllerApi.java";
        String controllerPathOutName = projectRealPath + "\\"+projectModelName+"\\src\\main\\java\\com\\pccw\\purchasetime\\controller\\" + javaBeanName + "Controller.java";
        String servicePathOutName = projectRealPath+ "\\"+projectModelName+"\\src\\main\\java\\com\\pccw\\purchasetime\\service\\" + javaBeanName + "Service.java";
        //4. 生成静态化文件
        //4.1 生成 request 请求参数java文件
        this.getGenerateClass(map, requestTemplateName, requestPathOutName);
        //4.2 生成 response 返回参数java文件
        this.getGenerateClass(map, responseTemplateName, responsePathOutName);
        //4.3 生成 controllerApi 文件
        this.getGenerateClass(map, controllerApiTemplateName, controllerApiPathOutName);
        //4.4 生成 controller 文件
        this.getGenerateClass(map, controllerTemplateName, controllerPathOutName);
        //4.5 生成 service 文件
        this.getGenerateClass(map, serviceTemplateName, servicePathOutName);
    }

    /**
     * 生成xml 文件
     * @param tableName
     * @throws IOException
     * @throws TemplateException
     */
    public void getMapperXmlClass(String tableName) throws IOException, TemplateException {
        //获取javaBean类名称
        String javaBeanName = ScdaStringUtil.getJavaName(tableName, "table");
        //1.设置数据模型
        Map<String, Object> map = this.getMapperXmlClassMap(tableName);
        //2.设置模板名称
        String templateName = "tablMapperxml.ftl";
        //3.设置文件输出位置
        String pathOutName = System.getProperty("user.dir") + "\\src\\main\\resources\\com\\pccw\\createjavafile\\mapper\\" + javaBeanName + "Mapper.xml";
        //4 last 静态化生成页面
        this.getGenerateClass(map, templateName, pathOutName);
    }

    private Map<String, Object> getMapperXmlClassMap(String tableName) {
        Map<String, Object> map = this.getBaseMap(tableName);
        //1.javaBean路径
        map.put("javeBeanPath", "com.pccw.createjavafile.domain." + map.get("javaTableName"));
        //2.mapper路径
        map.put("javeMapperPath", "com.pccw.createjavafile.mapper." + map.get("javaTableName") + "Mapper");
        //3.设置 增加一条数据sql
        String addOneSql = getAddOneSql(tableName, map);
        map.put("addOneSql", addOneSql);
        //4.设置删除一条数据sql
        String deleteOneSql = getDeleteOneSql(tableName, map);
        map.put("deleteOneSql", deleteOneSql);
        //5.修改一条数据
        String updateOneSql = getUpdateOneSql(tableName, map);
        map.put("updateOneSql", updateOneSql);
        //6.查询一条数据
        map.put("findOneSql", addOneSql);
        //7.分页查询
        map.put("findPageSql", addOneSql);
        return map;
    }


    /**
     * 修改一条数据   依据主键   查询
     * update user set username=#{userName},address=#{userAddress},sex=#{userAex},birthday=#{userBirthday} where id=#{userId}
     *
     * @param tableName
     * @param map
     * @return
     */
    private String getUpdateOneSql(String tableName, Map<String, Object> map) {
        String updateOneSql = "update ";
        StringBuilder stringBuilder = new StringBuilder(updateOneSql);
        stringBuilder.append("scda").append(".").append("tableName");
        stringBuilder.append(" set ");
        List<TableDetail> tableDetailList = (List<TableDetail>) map.get("tableDetailList");
        String javaTableName = (String) map.get("javaTableName");
        javaTableName = ScdaStringUtil.toLowerCaseFirstOne(javaTableName);
        for (int i = 0; i < tableDetailList.size(); i++) {
            if (tableDetailList.get(i).getComments() == null || !tableDetailList.get(i).getComments().equals("主键")) {
                    stringBuilder.append("<if test=\" ")
                            .append(javaTableName).append(".")
                            .append(tableDetailList.get(i).getJavaColumnName())
                            .append(" !=null and ")
                            .append(javaTableName).append(".")
                            .append(tableDetailList.get(i).getJavaColumnName())
                            .append(".size()>0\">\n");
                    stringBuilder.append(tableDetailList.get(i).getColumnName())
                            .append(" = ")
                            .append("#{")
                            .append(tableDetailList.get(i).getJavaColumnName())
                            .append("}").append(",");
                    stringBuilder.append("</if> \n");
            }
        }
        stringBuilder.append(" where ");
        for (int i = 0; i < tableDetailList.size(); i++) {
            if (tableDetailList.get(i).getComments() !=null && tableDetailList.get(i).getComments().equals("主键")) {
                stringBuilder.append(tableDetailList.get(i).getColumnName())
                        .append(" = #{")
                        .append(tableDetailList.get(i).getJavaColumnName())
                        .append("}");
                break;
            }
        }
        updateOneSql = stringBuilder.toString();
        return updateOneSql;
    }

    /**
     * 获取删除语句
     * delete from scda.SCDA_PUR_TIME_TOTAL
     * <where>
     * <if test="scdaPurTimeTotal.spddaid !=null and scdaPurTimeTotal.SPDDA_ID.size()>0">
     * and SPDDA_ID = #{scdaPurTimeTotal.spddaid}
     * </if>
     * </where>
     *
     * @param tableName
     * @param map
     * @return
     */
    private String getDeleteOneSql(String tableName, Map<String, Object> map) {
        String deleteOneSql = "delete from ";
        StringBuilder stringBuilder = new StringBuilder(deleteOneSql);
        stringBuilder.append("scda").append(".").append(tableName).append("  \n");
        stringBuilder.append("<where> \n");
        List<TableDetail> tableDetailList = (List<TableDetail>) map.get("tableDetailList");
        //获取JavaTableName   并且首字母小写
        String javaTableName = (String) map.get("javaTableName");
        javaTableName = ScdaStringUtil.toLowerCaseFirstOne(javaTableName);
        for (int i = 0; i < tableDetailList.size(); i++) {
            stringBuilder.append("<if test=\" ")
                    .append(javaTableName).append(".")
                    .append(tableDetailList.get(i).getJavaColumnName())
                    .append(" !=null and ")
                    .append(javaTableName).append(".")
                    .append(tableDetailList.get(i).getJavaColumnName())
                    .append(".size()>0\">\n");
            stringBuilder.append("and ")
                    .append(tableDetailList.get(i).getColumnName())
                    .append(" = ")
                    .append("#{").append(javaTableName).append(".").append(tableDetailList.get(i).getJavaColumnName()).append("}");
            stringBuilder.append("</if> \n");
        }
        stringBuilder.append(" </where>");
        deleteOneSql = stringBuilder.toString();
        return deleteOneSql;
    }

    /**
     * 拼接增加一条的sql语句
     * insert into 表名(colum1,colum2,...) values(value1,value2,.....);
     *
     * @param tableName
     * @param map
     * @return
     */
    private String getAddOneSql(String tableName, Map<String, Object> map) {
        String addOneSql = "insert into scda.";
        StringBuilder stringBuilder = new StringBuilder(addOneSql);
        stringBuilder.append(tableName);
        List<TableDetail> tableDetailList = (List<TableDetail>) map.get("tableDetailList");
        //拼接字段名称
        stringBuilder.append("(");
        for (int i = 0; i < tableDetailList.size(); i++) {
            if (i == tableDetailList.size() - 1) {
                stringBuilder.append(tableDetailList.get(i).getColumnName());
            } else {
                stringBuilder.append(tableDetailList.get(i).getColumnName()).append(",");
            }
        }
        stringBuilder.append(")\n");
        //拼接值名称
        stringBuilder.append("  values");
        stringBuilder.append("(\n");
        String javaTableName = (String) map.get("javaTableName");
        javaTableName = ScdaStringUtil.toLowerCaseFirstOne(javaTableName);
        for (int i = 0; i < tableDetailList.size(); i++) {
            if (i == tableDetailList.size() - 1) {
                stringBuilder.append("#{")
                        .append(javaTableName)
                        .append(".")
                        .append(tableDetailList.get(i).getJavaColumnName())
                        .append("}");
            } else {
                stringBuilder.append("#{")
                        .append(javaTableName)
                        .append(".")
                        .append(tableDetailList.get(i).getJavaColumnName())
                        .append("}")
                        .append(",");
            }
        }
        stringBuilder.append(")");
        addOneSql = stringBuilder.toString();
        return addOneSql;
    }


    /**
     * 依据oracle 数据库表名称  生成mapper文件
     *
     * @param tableName
     * @throws IOException
     * @throws TemplateException
     */
    public void getMapperClass(String tableName) throws IOException, TemplateException {
        //获取javaBean类名称
        String javaBeanName = ScdaStringUtil.getJavaName(tableName, "table");
        //1.设置数据模型
        Map<String, Object> map = this.getMapperClassMap(tableName);
        //2.设置模板名称
        String templateName = "tablMapper.ftl";
        //3.设置文件输出位置
        String pathOutName = System.getProperty("user.dir") + "\\src\\main\\java\\com\\pccw\\createjavafile\\mapper\\" + javaBeanName + "Mapper.java";
        //4 last 静态化生成页面
        this.getGenerateClass(map, templateName, pathOutName);
    }

    private Map<String, Object> getMapperClassMap(String tableName) {
        Map<String, Object> map = this.getBaseMap(tableName);
        //1. 设置包路径
        map.put("packagePath", "com.pccw.createjavafile.mapper");
        //2.javaBean路径
        map.put("javeBeanPath", "com.pccw.createjavafile.domain." + map.get("javaTableName"));
        return map;
    }

    /**
     * 通过数据库表生成pojo实体类
     *
     * @param tableName
     * @throws IOException
     * @throws TemplateException
     */
    public void getPojoClass(String tableName) throws IOException, TemplateException {
        //1.设置数据模型
        Map<String, Object> map = this.getPojoClassMap(tableName);
        //2.设置模板名称
        String templateName = "tablePojo.ftl";
        //3.设置文件输出位置
        String javaName = ScdaStringUtil.getJavaName(tableName, "table");
        String pathOutName = System.getProperty("user.dir") + "\\src\\main\\java\\com\\pccw\\createjavafile\\domain\\" + javaName + ".java";
        //4 last 静态化生成页面
        this.getGenerateClass(map, templateName, pathOutName);

    }

    /**
     * 设置生成 Pojo 的 数据模型
     *
     * @param tableName 数据库表名称
     * @return
     */
    private Map<String, Object> getPojoClassMap(String tableName) {
        Map<String, Object> map = this.getBaseMap(tableName);
        //设置包路径
        map.put("packagePath", "com.pccw.createjavafile.domain");
        return map;
    }

    /**
     * 获取基础数据模型
     *
     * @param tableName 数据库表名称
     * @return
     */
    private Map<String, Object> getBaseMap(String tableName) {
        Map<String, Object> map = new HashMap<>();
        //1. 设置 类名 SCDA_PUR_TIME_TOTAL → ScdaPurTimeTotal
        map.put("javaTableName", ScdaStringUtil.getJavaName(tableName, "table"));
        //2. 设置数据库信息
        List<TableDetail> tableDetails = this.disposeDatabase(tableName);
        map.put("tableDetailList", tableDetails);
        //设置创建时间
        map.put("currentTimeStr", ScdaDateTimeUtils.getCurrentTimeStr(new Date(), "yyyy-MM-dd HH:mm:ss"));
        return map;
    }

    /**
     * 通过数据库表名,设置数据库的数据属性
     *
     * @param tableName
     * @return
     */
    private List<TableDetail> disposeDatabase(String tableName) {
        //1 通过jdbc获取数据库中表字段的名称
        List<TableDetail> detailFromTableName = tableDetailMapper.getDetailFromTableName(tableName);

        for (TableDetail tableDetail : detailFromTableName) {
            //2.1 设置处理,字段对应的属性名称
            String columnName = tableDetail.getColumnName();
            String javaColumnName = ScdaStringUtil.getJavaName(columnName, "attr");
            tableDetail.setJavaColumnName(javaColumnName);
            //2.2 设置处理,字段对应的数据类型名称
            String dataType = tableDetail.getDataType();
            if (dataType.equals("NUMBER") || dataType.equals("VARCHAR2")) {
                tableDetail.setJavaDataType("String");
            } else if (dataType.equals("DATE")) {
                tableDetail.setJavaDataType("Date");
            }
            //2.3 设置get 和 set方法的名称
            tableDetail.setAttrSetName("set" + ScdaStringUtil.toUpperCaseFirstOne(tableDetail.getJavaColumnName()));
            tableDetail.setAttrGetName("get" + ScdaStringUtil.toUpperCaseFirstOne(tableDetail.getJavaColumnName()));
        }
        return detailFromTableName;
    }

    /**
     * 静态化生成模板
     *
     * @param map          数据模型
     * @param templateName 模板名称
     * @param pathOutName  输出文件地址
     * @throws IOException
     * @throws TemplateException
     */
    public void getGenerateClass(Map<String, Object> map, String templateName, String pathOutName) throws IOException, TemplateException {
        //创建配置类
        Configuration configuration = new Configuration(Configuration.getVersion());
        String classpath = this.getClass().getResource("/").getPath();
        //target/classes/templates
        //设置模板路径
        configuration.setDirectoryForTemplateLoading(new File(classpath + "/templates/"));
        //设置字符集
        configuration.setDefaultEncoding("utf-8");
        //加载模板
        Template template = configuration.getTemplate(templateName);
        //静态化
        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, map);
        //静态化内容
        InputStream inputStream = IOUtils.toInputStream(content);
        //输出文件
        FileOutputStream fileOutputStream = new FileOutputStream(new File(pathOutName));
        int copy = IOUtils.copy(inputStream, fileOutputStream);
        fileOutputStream.close();
        inputStream.close();
    }
}
