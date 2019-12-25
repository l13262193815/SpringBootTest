package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * SpringBoot启动类
 */
@SpringBootApplication
@MapperScan("com.java.mapper")
public class SpringStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringStart.class,args);
    }
}
