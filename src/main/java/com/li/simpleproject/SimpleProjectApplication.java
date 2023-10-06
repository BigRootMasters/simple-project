package com.li.simpleproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kuan
 */
@SpringBootApplication
@MapperScan(basePackages = "com.li.simpleproject.dao")
public class SimpleProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleProjectApplication.class, args);
    }

}
