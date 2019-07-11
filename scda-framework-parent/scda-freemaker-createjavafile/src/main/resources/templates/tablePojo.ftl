package ${packagePath};

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @Author: xcl
 * @Date: ${currentTimeStr}
 * @Version 1.0
 */
@Data
@ToString
public class ${javaTableName} {
    <#list  tableDetailList as tableDetail>
         private ${tableDetail.javaDataType}  ${tableDetail.javaColumnName} ;   //${(tableDetail.comments)!"null"}
    </#list>
}
