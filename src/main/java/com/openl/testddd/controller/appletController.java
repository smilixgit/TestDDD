package com.openl.testddd.controller;

import com.openl.testddd.common.ResponseData;
import com.openl.testddd.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//管理后台控制
@RestController
@RequestMapping("/applet")
public class appletController {

    @RequestMapping("/test")
    @ResponseBody
    public String test()
    {

        return new ResponseData<>(200,"加载成功").toJsonString();
    }
}
