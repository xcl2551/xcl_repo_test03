package com.pccw.purchasecontrol.controller;

import com.pccw.api.purchasecontrol.ScdaPdrAndPprControllerApi;
import com.pccw.framework.domain.purchasecontrol.ScdaPdrAndPpr;
import com.pccw.framework.domain.purchasecontrol.request.PurchaseControlRequest;
import com.pccw.framework.domain.purchasecontrol.response.ScdaPdrAndPprResult;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.utils.FileUtil;
import com.pccw.purchasecontrol.service.ScdaPdrAndPprService;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xcl
 * @Date: 2019-3-29 13:39
 * @Version 1.0
 */
@RequestMapping("/scdaPdrAndPpr")
@RestController
public class ScdaPdrAndPprController implements ScdaPdrAndPprControllerApi {


    @Autowired
    private ScdaPdrAndPprService scdaPdrAndPprService;

    /**
     * 按编号查询一条记录
     *
     * @param pdrPprNumber
     * @return
     */
    @GetMapping("/findOne/{pdrPprNumber}")
    public ScdaPdrAndPprResult findOne(@PathVariable String pdrPprNumber) {
        return scdaPdrAndPprService.findoneByPdrPprNumber(pdrPprNumber);
    }


    @PostMapping("/findPage")
    public QueryResponseResult<ScdaPdrAndPpr> findPage(@RequestBody PurchaseControlRequest purchaseControlRequest) {
        return scdaPdrAndPprService.findPage(purchaseControlRequest);
    }


    @PostMapping("/downloadExcel")
    public void downloadExcel(@RequestBody PurchaseControlRequest purchaseControlRequest, HttpServletResponse response, HttpServletRequest request) throws IOException {
        //获取excel封装好数据的对象
        HSSFWorkbook hssfWorkbook = scdaPdrAndPprService.downloadExcel(purchaseControlRequest);
        //设置头信息
        response.setContentType("application/vnd.ms-excel");
        String filename = "year_purchase_demand.xls";
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
