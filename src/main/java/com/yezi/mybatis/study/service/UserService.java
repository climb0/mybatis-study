package com.yezi.mybatis.study.service;

import com.yezi.mybatis.study.model.User;

/**
 * @author climb
 * @date 2023/1/5
 */
public interface UserService {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 新增用户
     * @param user
     */
    Boolean addUser(User user);

    /**
     * 修改用户密码
     * @param id
     * @param password
     */
    Boolean updateUserPassword(Integer id, String password);

    /**
     * 根据id删除用户信息
     * @param id
     */
    Boolean deleteUserById(Integer id);
}
