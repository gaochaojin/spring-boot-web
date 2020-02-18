package com.gaochaojin.mongo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 15:18 2020/2/18
 */
@Data
@Document(collection = "user")
public class User {

    @Id
    private String id;

    @Field
    private String username;

    @Field
    private String password;

}
