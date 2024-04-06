package com.openl.testddd.exception;

public class CustomException extends RuntimeException{
    //自定义一个异常类
    //重写实例方法
    public CustomException(String message)
    {
        super(message);
    }
}
