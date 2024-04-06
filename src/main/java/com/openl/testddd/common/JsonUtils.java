package com.openl.testddd.common;
import com.alibaba.fastjson.JSON;

import java.util.Map;

public class JsonUtils {

    /**
     * 将实体类转换为 JSON 字符串
     *
     * @param object 实体类对象
     * @return 转换后的 JSON 字符串
     */
    public static String toJsonString(Object object) {
        return JSON.toJSONString(object);
    }

    /**
     * 将 JSON 字符串转换为指定类型的实体类对象
     *
     * @param jsonString JSON 字符串
     * @param clazz      实体类类型
     * @param <T>        实体类泛型
     * @return 转换后的实体类对象
     */
    public static <T> T fromJsonString(String jsonString, Class<T> clazz) {
        return JSON.parseObject(jsonString, clazz);
    }

    /**
     * 将 JSON 字符串转换为通用的 JSON 对象
     *
     * @param jsonString JSON 字符串
     * @return JSON 对象
     */
    public static Object parseJson(String jsonString) {
        return JSON.parse(jsonString);
    }

    /**
     * 将实体类对象转换为 JSON 对象
     *
     * @param object 实体类对象
     * @return JSON 对象
     */
    public static Object parseObject(Object object) {
        return JSON.toJSON(object);
    }
    // 将 JSON 字符串转换为 Map
    public static Map<String, Object> jsonToMap(String jsonString) {
        return JSON.parseObject(jsonString, Map.class);
    }
    // 将 Map 转换为 JSON 字符串
    public static String mapToJson(Map<String, Object> map) {
        return JSON.toJSONString(map);
    }

    // 将 JSON 字符串转换为指定实体类对象
    public static <T> T jsonToEntity(String jsonString, Class<T> clazz) {
        return JSON.parseObject(jsonString, clazz);
    }

    // 将实体类对象转换为 JSON 字符串
    public static String entityToJson(Object object) {
        return JSON.toJSONString(object);
    }
}

