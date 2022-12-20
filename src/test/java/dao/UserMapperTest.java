package dao;

import com.alibaba.fastjson2.JSON;
import com.yezi.mybatis.study.dao.UserMapper;
import com.yezi.mybatis.study.model.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author climb
 * @date 2022/12/13
 */
public class UserMapperTest {

    private UserMapper userMapper;

    private SqlSession sqlSession;

    @Before
    public void setUp() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);

    }

    @Test
    public void test_getUserById() {
        User user = userMapper.getUserById(1);
        System.out.println(JSON.toJSON(user));
    }

    @Test
    public void test_addUser() {
        User user = new User();
        user.setName("李四");
        user.setPassword("123123");
        userMapper.addUser(user);
        sqlSession.commit();
    }

    @Test
    public void test_updateUserPassword() {
        System.out.println("affected rows: " + userMapper.updateUserPassword(1, "11111111"));
        sqlSession.commit();
    }

    @Test
    public void test_deleteUser() {
        System.out.println("affected rows: " + userMapper.deleteUser(1));
        sqlSession.commit();
    }
}
