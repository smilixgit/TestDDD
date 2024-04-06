package com.openl.testddd.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.openl.testddd.common.DateTimeUtils;
import com.openl.testddd.common.ErrorCode;
import com.openl.testddd.common.ResponseData;
import com.openl.testddd.entity.HAdmin;
import com.openl.testddd.mapper.HAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/checkProgram")
public class TestController {
     @Autowired
     private HAdminMapper hAdminMapper;

    @RequestMapping("/pingHost")
    public String testHost() {
        return ErrorCode.VALID_HOST.toJsonString();
    }

    @RequestMapping("/connectDb")
    public String testDb()
    {
        return ErrorCode.VALID_DB.toJsonString();

    }
    @RequestMapping("/testSection")
    public String testSection ()
    {
        QueryWrapper<HAdmin> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",1).orderByDesc("id");

        List<HAdmin> hAdminList= hAdminMapper.selectList(queryWrapper);
        HAdmin hAdmin = hAdminList.get(0);
        ResponseData responseData=new ResponseData(100,"请求成功",hAdmin);
        return responseData.toJsonString();
    }

}
