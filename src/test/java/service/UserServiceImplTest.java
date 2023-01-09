package service;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.util.JDKUtils;
import com.yezi.mybatis.study.model.User;
import com.yezi.mybatis.study.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author climb
 * @date 2023/1/5
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void test_getUserById() {
        User user = userService.getUserById(3);
        System.out.println(JSON.toJSON(user));
    }

    @Test
    public void test_addUser() {
        User user = new User();
        user.setName("王五");
        user.setPassword("66666666");
        System.out.println("result of addUser: " + userService.addUser(user));
    }

    @Test
    public void test_updateUserPassword() {
        System.out.println("result of updateUserPassword: " + userService.updateUserPassword(5, "88888888"));

    }

    @Test
    public void test_deleteUser() {
        System.out.println("result of deleteUser: " + userService.deleteUserById(5));

    }
}
