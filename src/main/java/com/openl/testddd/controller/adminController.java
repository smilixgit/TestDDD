package com.openl.testddd.controller;

import com.openl.testddd.exception.CustomException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//管理后台控制
@RestController
@RequestMapping("/admin")
public class adminController {

    @RequestMapping("/test")
    @ResponseBody
    public String test()
    {
        return "cas";
    }
}
