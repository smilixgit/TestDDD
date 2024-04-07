package com.openl.testddd.interrupt;

import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;

import java.io.InputStream;

//后台管理请求拦截器
public class adminInterceptor implements HandlerInterceptor {
    private static final Logger adminlogger=LoggerFactory.getLogger("adminFile");
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("ceshji");
        // 在请求处理之前进行拦截处理，返回 true 表示放行，返回 false 表示拦截
        request.getParameterMap().forEach((name,values)->
                        adminlogger.info("admin:Request Parameter - {}: {}", name, String.join(",", values))
                );
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // 在请求处理之后，视图渲染之前进行拦截处理
        adminlogger.info("admin:Response Status Code: {}",response.getStatus());

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                Exception ex) throws Exception {

    }
}
