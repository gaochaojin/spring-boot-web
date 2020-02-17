package com.gaochaojin.dao;

import com.gaochaojin.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 15:47 2020/2/17
 */
public interface StudentDao extends JpaRepository<Student,Integer> {
}
