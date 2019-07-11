<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="${javeMapperPath}">
    <resultMap id="BaseResultMap" type="${javeBeanPath}">
        <#list tableDetailList as tableDetail>
             <#if  (tableDetail.comments!"null") == "主键" >
     <id column="${tableDetail.columnName}" property="${tableDetail.javaColumnName}" jdbcType="${tableDetail.dataType}"/>
             </#if>
             <#if  (tableDetail.comments!"null") != "主键" >
     <result column="${tableDetail.columnName}" property="${tableDetail.javaColumnName}" jdbcType="${tableDetail.dataType}"/>
             </#if>
        </#list>
    </resultMap>


    <!--增-->
    <insert id="addOne" parameterType="${javeBeanPath}" >
    ${addOneSql}
    </insert>
    <!--删-->
    <delete id="deleteOne" parameterType="${javeBeanPath}">
    ${deleteOneSql}
    </delete>
    <!--改-->
    <update id="updateOne" parameterType="${javeBeanPath}">
    ${updateOneSql}
    </update>
    <!--查一个-->
    <select id="findOne"  parameterType="${javeBeanPath}" resultMap="BaseResultMap">
    ${findOneSql}
    </select>
    <!--查按条件查询-->
    <select id="findPage" parameterType="${javeBeanPath}" resultMap="BaseResultMap">
    ${findPageSql}
    </select>

</mapper>