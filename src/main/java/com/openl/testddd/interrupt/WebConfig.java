package com.openl.testddd.interrupt;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.openl.testddd.interrupt.adminInterceptor;
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        adminInterceptor adminInterceptor = new adminInterceptor();
        registry.addInterceptor(adminInterceptor).addPathPatterns("/admin");
    }
}
