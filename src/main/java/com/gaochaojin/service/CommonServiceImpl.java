package com.gaochaojin.service;

import com.gaochaojin.dao.StudentDao;
import com.gaochaojin.dao.UsersMapper;
import com.gaochaojin.dynamicDataSource.TargetDataSource;
import com.gaochaojin.entity.Student;
import com.gaochaojin.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 14:23 2020/2/17
 */
@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private StudentDao studentDao;

    @TargetDataSource(name="ds1")
    @Override
    public Users selectByPrimaryKey(Integer id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Cacheable(value = "student",key = "#id")
    @Override
    public Student findById(Integer id){
        Optional<Student> optional = studentDao.findById(id);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @CachePut(value = "student",key = "#student.id")
    @Override
    public Student save(Student student) {
        Student student1 = studentDao.save(student);
        return student1;
    }

    @CacheEvict(value = "student",key = "#id")
    @Override
    public void delete(Integer id) {
        studentDao.deleteById(id);
    }
}
