package com.gaochaojin.service;

import com.gaochaojin.dao.UsersMapper;
import com.gaochaojin.dynamicDataSource.TargetDataSource;
import com.gaochaojin.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @TargetDataSource(name="ds1")
    @Override
    public Users selectByPrimaryKey(Integer id) {
        return usersMapper.selectByPrimaryKey(id);
    }
}
