package com.gaochaojin.service;

import com.gaochaojin.dao.UsersMapper;
import com.gaochaojin.entity.Student;
import com.gaochaojin.model.Users;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 14:21 2020/2/17
 */
public interface CommonService {

    public Users selectByPrimaryKey(Integer id);

    public Student findById(Integer id);

    public Student save(Student student);

    public void delete(Integer id);

}
