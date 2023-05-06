package com.ztl.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ztl")
public class SpringBoot002Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot002Application.class);
    }
}
