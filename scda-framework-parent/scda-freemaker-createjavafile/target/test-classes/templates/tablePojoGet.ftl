

<#list  tableDetailList as tableDetail>
   headRow.createCell(${tableDetail_index}).setCellValue("${tableDetail.comments!""}");
</#list>

<#list  tableDetailList as tableDetail>
if(scdaPdrAndPpr.${tableDetail.attrGetName}()!=null){
   <#if tableDetail.dataType == "VARCHAR2">
       dataRow.createCell(${tableDetail_index}).setCellValue(scdaPdrAndPpr.${tableDetail.attrGetName}());
   </#if>
   <#if tableDetail.dataType == "NUMBER">
       dataRow.createCell(${tableDetail_index}).setCellValue(String.valueOf(scdaPdrAndPpr.${tableDetail.attrGetName}()));
   </#if>
   <#if tableDetail.dataType == "DATE">
       dataRow.createCell(${tableDetail_index}).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPdrAndPpr.${tableDetail.attrGetName}()));
   </#if>
}

</#list>