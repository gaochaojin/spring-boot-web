package com.gaochaojin.test;

import com.gaochaojin.SpringbootWebApplication;
import com.gaochaojin.devtools.SpringBootDevtools;
import com.gaochaojin.entity.Student;
import com.gaochaojin.model.Users;
import com.gaochaojin.service.CommonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 14:27 2020/2/17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootDevtools.class)
@WebAppConfiguration
public class MyTest {

    private static final Logger logger = LoggerFactory.getLogger(MyTest.class);

    @Autowired
    CommonService commonService;

    @Test
    public void test() {
        Users users = commonService.selectByPrimaryKey(1);
        Student student = commonService.findById(1);
        logger.info(users.getUsername() + "  " + users.getPasswd());
        logger.info(student.getName() + "  " + student.getCardNum());
    }
}
