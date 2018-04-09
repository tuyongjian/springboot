package com.tu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by len on 2018/4/4.
 *
 * 这个类作为启动类，应该包的路径在最上层
 */
@SpringBootApplication
public class SpringbootApplication {

    public static void main(String [] args){
        //启用这个时候spring.devtools.restart.enabled =false的时候就会完全禁止使用热启动
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(SpringbootApplication.class,args);
    }
}
