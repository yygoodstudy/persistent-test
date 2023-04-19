package org.example;

import com.example.io.Resources;
import com.example.sqlsession.SqlSession;
import com.example.sqlsession.SqlSessionFactory;
import com.example.sqlsession.SqlSessionFactoryBuilder;
import org.example.pojo.User;
import org.junit.Test;

import java.io.InputStream;

public class AppTest {

    @Test
    public void test() throws Exception {
        InputStream inputStream = Resources.getResourcesAsStream("sqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = build.openSession();
        User user = new User(1L, "张洁");
        User o = sqlSession.selectOne("user.selectOne", user);
        System.out.println("o = " + o);
    }
}
