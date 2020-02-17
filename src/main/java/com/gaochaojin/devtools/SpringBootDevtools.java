package com.gaochaojin.devtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 12:30 2020/2/14
 */
@SpringBootApplication(scanBasePackages = {"com.gaochaojin"})
//@Mapper("com.gaochaojin.dao")
@ServletComponentScan(basePackages = {"com.gaochaojin"})
//@EnableConfigurationProperties(DruidConfig.class)
public class SpringBootDevtools extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootDevtools.class);
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootDevtools.class, args);
    }
}
