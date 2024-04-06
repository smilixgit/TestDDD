package com.openl.testddd.common;

import com.alibaba.fastjson.JSON;

public enum ErrorCode {
    SUCCESS(0, "成功"),
    VALID_HOST(200,"连接服务器正常"),
    VALID_DB(200,"连接数据库正常"),

    INVALID_REQUEST(400, "无效的请求"),
    UNAUTHORIZED(401, "未经授权"),
    FORBIDDEN(403, "禁止访问"),
    NOT_FOUND(404, "未找到资源"),
    METHOD_NOT_ALLOWED(405, "不支持的请求方法"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误"),
    USER_NOT_FOUND(1001, "用户未找到"),
    INVALID_PASSWORD(1002, "密码错误"),
    DUPLICATE_USERNAME(1003, "用户名已存在"),
    EMAIL_ALREADY_REGISTERED(1004, "邮箱已注册"),
    INVALID_EMAIL_FORMAT(1005, "邮箱格式错误");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    // 使用Java原生方式将枚举转换为JSON字符串
    public String toJsonString() {
        return "{\"code\":" + code + ",\"message\":\"" + message + "\"}";
    }
}
