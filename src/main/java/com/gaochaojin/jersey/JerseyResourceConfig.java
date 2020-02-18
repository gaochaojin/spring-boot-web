package com.gaochaojin.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.RequestContextFilter;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 15:53 2020/2/18
 */
public class JerseyResourceConfig extends ResourceConfig {

    public JerseyResourceConfig(){
        register(RequestContextFilter.class);
        // 加载资源文件，这里直接扫描com.gaochaojin.jersey下的所有api
        packages("com.gaochaojin.jersey");

    }

}
