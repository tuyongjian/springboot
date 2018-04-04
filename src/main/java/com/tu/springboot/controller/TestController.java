package com.tu.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by len on 2018/4/4.
 * 这个包应该在SpringbootApplication 下面作为他的子类不然启动会报错
 */
@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);
    @GetMapping(value = "helloWorld")
    public String helloWorld(){
        logger.info("--------------------");
        return "hello World";
    }
}
