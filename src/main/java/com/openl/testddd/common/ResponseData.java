package com.openl.testddd.common;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;

public class ResponseData<T> {
    private int code;
    private String message;
    private T data;

    public ResponseData(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseData(int code, String message)
    {
        this.code=code;
        this.message=message;
    }

    // Getters and setters...

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    // 将对象转换为 JSON 字符串
    public String toJsonString() {
        return JSON.toJSONString(this);
    }
}
