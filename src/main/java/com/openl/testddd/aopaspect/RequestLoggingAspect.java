package com.openl.testddd.aopaspect;


import com.alibaba.fastjson.JSONObject;
import com.openl.testddd.common.JsonUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.condition.RequestConditionHolder;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

@Aspect
@Component
public class RequestLoggingAspect {
    private static final Logger adminLogger = LoggerFactory.getLogger("adminFile");
    private static final Logger appletLogger = LoggerFactory.getLogger("appletFile");


    @AfterReturning(pointcut = "execution(* com.openl.testddd.controller.*.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("处理完成切点");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 创建一个示例 Map
        Map<String, String[]> parameterMap = request.getParameterMap();

        // 创建 JSONObject 对象，表示 parameterMap 是否为空，并处理值为 null 的情况
        JSONObject jsonObject = new JSONObject();
        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
            String[] values = entry.getValue();
            // 判断值是否为 null
            String valueString = (values != null) ? String.join(",", values) : ""; // 如果值为 null，则将其替换为 ""
            jsonObject.put(entry.getKey(), valueString);
        }

        // 输出 JSON 字符串
        String jsonString = jsonObject.toJSONString();
        if (request.getRequestURI().contains("/admin")) {
            adminLogger.info("admin: 请求的资源: {} 携带参数: {} 返回数据: {} ",
                    request.getRequestURI(),
                    jsonString,
                    result
            );


        } else if (request.getRequestURI().contains("/applet")) {
            adminLogger.info("applet: 请求的资源: {} 携带参数: {} 返回数据: {} ",
                    request.getRequestURI(),
                    jsonString,
                    result
            );

        }
    }

}