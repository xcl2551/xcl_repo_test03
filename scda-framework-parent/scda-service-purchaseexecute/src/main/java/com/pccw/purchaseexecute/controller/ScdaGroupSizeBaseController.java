package com.pccw.purchaseexecute.controller;

import com.pccw.api.purchaseexecute.ScdaGroupSizeBaseControllerApi;
import com.pccw.framework.domain.purchaseexecute.ScdaGroupSizeBase;
import com.pccw.framework.domain.purchaseexecute.request.PurchaseExecuteRequest;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.utils.FileUtil;
import com.pccw.purchaseexecute.service.ScdaGroupSizeBaseService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: xcl
 * @Date: 2019-4-16 16:33
 * @Version 1.0
 */
@RestController
@RequestMapping("/scdaGroupSizeBase")
public class ScdaGroupSizeBaseController implements ScdaGroupSizeBaseControllerApi {

    @Autowired
    private ScdaGroupSizeBaseService scdaGroupSizeBaseService;

    @Override
    @PostMapping("/findPage")
    public QueryResponseResult<ScdaGroupSizeBase> findPage(@RequestBody PurchaseExecuteRequest purchaseExecuteRequest) {
        return scdaGroupSizeBaseService.findPage(purchaseExecuteRequest);
    }

    @Override
    @PostMapping("/downloadExcel")
    public void downloadExcel(@RequestBody PurchaseExecuteRequest purchaseExecuteRequest, HttpServletResponse response, HttpServletRequest request) throws IOException {
        //获取excel封装好数据的对象
        HSSFWorkbook hssfWorkbook = scdaGroupSizeBaseService.downloadExcel(purchaseExecuteRequest);
        //设置头信息
        response.setContentType("application/vnd.ms-excel");
        String filename = "GroupSizeBase.xls";
        String agent = request.getHeader("user-agent");
        filename = FileUtil.encodeDownloadFilename(filename, agent);
        response.setHeader("Content-Disposition", "attachment;filename=" + filename);
        response.setHeader("Access-Control-Expose-Headers","Content-Disposition");
        //输出流
        ServletOutputStream outputStream = response.getOutputStream();
        hssfWorkbook.write(outputStream);
        //释放资源
        hssfWorkbook.close();
    }
}
