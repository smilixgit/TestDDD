package com.openl.testddd.exception;

import com.openl.testddd.common.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger errorLog = LoggerFactory.getLogger("errorFile");
    //注册自定义的异常类,可以自定义异常信息
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public String handleCustomException(CustomException customException)
    {
        //记录
        errorLog.error("exception occurred: {}",customException.getMessage());
        //返回错误信息
        return ErrorCode.INTERNAL_SERVER_ERROR.toJsonString();
    }


    @ExceptionHandler(Exception.class)
    @ResponseBody

    public String handleException(Exception ex)
    {
        //记录异常发生地址
        errorLog.error("exception occurred: {} ",ex.getMessage());
        //向用户返回错误信息
        return ErrorCode.INTERNAL_SERVER_ERROR.toJsonString();
    }
}
