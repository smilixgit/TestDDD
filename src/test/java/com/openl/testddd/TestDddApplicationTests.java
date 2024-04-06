package com.openl.testddd;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.openl.testddd.common.ErrorCode;
import com.openl.testddd.common.HttpRequestUtil;
import com.openl.testddd.common.JsonUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class TestDddApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void test() throws IOException {

        System.out.println(ErrorCode.SUCCESS.toJsonString());
    }

}
