package com.fouremperors.study;

import freemarker.template.TemplateModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

/**
 * 启动类
 */
@SpringBootApplication
@ServletComponentScan //用于扫描servlet的注解 如 filter,listener,servlet
@EnableRedisRepositories
public class Application extends SpringBootServletInitializer {

    @Autowired
    FreeMarkerConfigurer configurer;

    public static void main(String[] args) throws Exception {
        //args 我这时用于演示用
        SpringApplication.run(Application.class, new String[]{"Keith", "Pumpkin"});
    }

    @Override
    protected WebApplicationContext run(SpringApplication application) {
        try {
            configurer.getConfiguration().setSharedVariable("FM","Keith");
        } catch (TemplateModelException e) {
            e.printStackTrace();
        }
        return super.run(application);
    }
}