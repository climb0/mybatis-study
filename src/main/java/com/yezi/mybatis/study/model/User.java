package com.yezi.mybatis.study.model;

import lombok.Data;

/**
 * @author climb
 * @date 2022/12/13
 */

@Data
public class User {

    /**
     * 唯一id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

}
