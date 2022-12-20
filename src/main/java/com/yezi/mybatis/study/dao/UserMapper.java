package com.yezi.mybatis.study.dao;

import com.yezi.mybatis.study.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author climb
 * @date 2022/12/13
 * @desc 提供对t_user表的基础操作
 */
public interface UserMapper {

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
    void addUser(User user);

    /**
     * 修改用户密码
     * @param id
     * @param password
     */
    Integer updateUserPassword(@Param("id") Integer id, @Param("password") String password);

    /**
     * 根据id删除用户信息
     * @param id
     */
    Integer deleteUser(Integer id);
}
