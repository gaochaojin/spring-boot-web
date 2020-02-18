package com.gaochaojin.jersey;

import org.glassfish.jersey.server.internal.JerseyResourceContext;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 15:50 2020/2/18
 */
@Configuration
public class JerseyConfig {

    @Bean
    public ServletRegistrationBean jerseyServlet() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(
                new ServletContainer(), "/rest/*");
        registrationBean.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyResourceConfig.class.getName());
        return registrationBean;
    }

}
