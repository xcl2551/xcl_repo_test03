package com.pccw.purchasetime.controller;

import com.pccw.api.purchasetime.ScdaPurTimeBaseControllerApi;
import com.pccw.framework.domain.purchasetime.ScdaPurTimeBase;
import com.pccw.framework.domain.purchasetime.request.ScdaPurTimeBaseRequest;
import com.pccw.framework.domain.purchasetime.response.ScdaPurTimeBaseResult;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.utils.FileUtil;
import com.pccw.purchasetime.service.ScdaPurTimeBaseService;
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
 * @Date: 2019-05-06 14:14:16
 * @Version 1.0
 */
@RestController
@RequestMapping("/scdaPurTimeBase")
public class ScdaPurTimeBaseController implements ScdaPurTimeBaseControllerApi {

    @Autowired
    private ScdaPurTimeBaseService scdaPurTimeBaseService;

    /**
     * 发现一种类型
     *
     * @param scdaPurTimeBaseRequest
     * @return
     */
    @Override
    @PostMapping("/findOneType")
    public ScdaPurTimeBaseResult findOneType(@RequestBody ScdaPurTimeBaseRequest scdaPurTimeBaseRequest) {

        return null;
    }

    /**
     * 发现一条页面显示数据
     *
     * @param scdaPurTimeBaseRequest
     * @return
     */
    @Override
    @PostMapping("/findOne")
    public QueryResponseResult<ScdaPurTimeBase> findOne(@RequestBody ScdaPurTimeBaseRequest scdaPurTimeBaseRequest) {
        return null;
    }

    /**
     * 分页查询
     *
     * @param scdaPurTimeBaseRequest
     * @return
     */
    @Override
    @PostMapping("/findPage")
    public QueryResponseResult<ScdaPurTimeBase> findPage(@RequestBody ScdaPurTimeBaseRequest scdaPurTimeBaseRequest) {
        return scdaPurTimeBaseService.findPage(scdaPurTimeBaseRequest);
    }

    @Override
    @PostMapping("/downloadExcel")
    public void downloadExcel(@RequestBody ScdaPurTimeBaseRequest scdaPurTimeBaseRequest, HttpServletResponse response, HttpServletRequest request) throws IOException {
        //获取excel封装好数据的对象
        HSSFWorkbook hssfWorkbook = scdaPurTimeBaseService.downloadExcel(scdaPurTimeBaseRequest);
        //设置头信息
        response.setContentType("application/vnd.ms-excel");
        String filename = "purchasetime_base.xls";
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
