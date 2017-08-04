package com.fouremperors.study;

import freemarker.template.TemplateModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.util.Arrays;
import java.util.List;

/**
 * 当程序启动动,此方法会被调用
 */
@Component
public class MyBean implements CommandLineRunner {

    public void run(String... args) throws TemplateModelException {
        System.out.println("------custome init start------");
        Arrays.stream(args).forEach(System.out::println);

    }

}