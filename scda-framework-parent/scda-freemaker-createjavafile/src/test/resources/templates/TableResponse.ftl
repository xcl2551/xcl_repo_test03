package com.pccw.framework.domain.${modelName}.response;

import com.pccw.framework.domain.${modelName}.${javaTableName};
import com.pccw.framework.model.response.ResponseResult;
import com.pccw.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * @Author: xcl
 * @Date: ${currentTimeStr}
 * @Version 1.0
 */
@Data
@ToString
@NoArgsConstructor
public class ${javaTableName}Result extends ResponseResult {
    //查询的一条返回结果记录
    private ${javaTableName} ${javaTableName?uncap_first};

    public ${javaTableName}Result(ResultCode resultCode, ${javaTableName} ${javaTableName?uncap_first}) {
        super(resultCode);
        this.${javaTableName?uncap_first} = ${javaTableName?uncap_first};
    }
}
