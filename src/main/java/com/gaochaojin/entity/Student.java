package com.gaochaojin.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 15:44 2020/2/17
 */
@Data
@Entity
@Table(name = "t_student")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "card_num")
    private String cardNum;

    @Column(name = "age")
    private String age;

    @Column(name = "sex")
    private String sex;
}
