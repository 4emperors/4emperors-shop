package com.fouremperors.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

/**
 * 启动类
 */
@SpringBootApplication
@ServletComponentScan //用于扫描servlet的注解 如 filter,listener,servlet
@EnableRedisRepositories
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        //args 我这时用于演示用
        SpringApplication.run(Application.class, new String[]{"Keith", "Pumpkin"});
    }
}