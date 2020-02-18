package com.gaochaojin.test;

import com.gaochaojin.SpringbootWebApplication;
import com.gaochaojin.devtools.SpringBootDevtools;
import com.gaochaojin.entity.Student;
import com.gaochaojin.model.Users;
import com.gaochaojin.mongo.MongoService;
import com.gaochaojin.mongo.User;
import com.gaochaojin.service.CommonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
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

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    MongoService mongoService;

    @Test
    public void test() {
        Users users = commonService.selectByPrimaryKey(1);
        Student student = commonService.findById(1);
        logger.info(users.getUsername() + "  " + users.getPasswd());
        logger.info(student.getName() + "  " + student.getCardNum());
    }

    @Test
    public void testRedis() {
        redisTemplate.opsForValue().set("jack", "123456");
        String value = redisTemplate.opsForValue().get("jack").toString();
        System.out.println(value);
    }

    @Test
    public void testCache(){
        Student student = commonService.findById(3);

        Student student1 = new Student();
        student1.setId(3);
        student1.setCardNum("134324");
        student1.setName("jin");
//        commonService.save(student1);

//        commonService.delete(3);

    }

    @Test
    public void testMongo(){
        User user = new User();
        user.setId("123");
        user.setUsername("jack");
        user.setPassword("123456");
        mongoService.save(user);
    }
}
