package com.gaochaojin.jersey;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:  访问路径为：http://localhost:8080/rest/jersey/1
 * @Date Created in 15:56 2020/2/18
 */
@Path("/jersey/")
public class JerseyController {

    @Path("{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello(@PathParam("id") Long id) {
        return "hello";
    }
}
