package com.ztl.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ztl")
@MapperScan("com.ztl.mapper")
public class SpringBoot004Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot004Application.class,args);
    }
}
