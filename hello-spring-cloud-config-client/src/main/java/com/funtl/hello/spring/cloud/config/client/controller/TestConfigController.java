package com.funtl.hello.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchangjing
 * @Description:
 * @ClassName: TestConfigController
 * @date 2018/6/9
 */
@RestController
public class TestConfigController {

    @Value("${foo}")
    private String foo;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
        return foo;
    }
}