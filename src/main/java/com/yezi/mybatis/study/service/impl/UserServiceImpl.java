package com.yezi.mybatis.study.service.impl;

import com.yezi.mybatis.study.dao.UserMapper;
import com.yezi.mybatis.study.model.User;
import com.yezi.mybatis.study.service.UserService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author climb
 * @date 2023/1/5
 */
@Repository
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public Boolean addUser(User user) {
        return userMapper.addUser(user) > 0;
    }

    @Override
    public Boolean updateUserPassword(Integer id, String password) {
        return userMapper.updateUserPassword(id, password) > 0;
    }

    @Override
    public Boolean deleteUserById(Integer id) {
        return userMapper.deleteUser(id) > 0;
    }
}
