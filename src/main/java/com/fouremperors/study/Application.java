package com.fouremperors.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启动类
 */
@SpringBootApplication
@ServletComponentScan //用于扫描servlet的注解 如 filter,listener,servlet
public class Application extends SpringBootServletInitializer {


    public static void main(String[] args) throws Exception {
        //args 我这时用于演示用
        SpringApplication.run(Application.class, new String[]{"Keith","Pumpkin"});
    }
}