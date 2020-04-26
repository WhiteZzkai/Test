package com.utils;

import com.dao.UserMapper;
import com.pojo.Area;
import com.pojo.Channel;
import com.pojo.Fee;
import com.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        /*
        mybatis例子

        SqlSession sqlSession = DBManager.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int i =userMapper.updatePwd("111111",202001);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(i);
        */


        //默认将singleton类型的 提前实例化。。。配置后getBean之后才实例化
        ApplicationContext context = new ClassPathXmlApplicationContext("spring0.xml");

        /*
        //set注入
        User user = context.getBean("user",User.class);
        System.out.println(user);
        */
        /*
        //构造器注入
        Area area = context.getBean("area",Area.class);
        System.out.println(area);
        */
        Fee channel = context.getBean("fee", Fee.class);
        System.out.println(channel);



        ((AbstractApplicationContext)context).close();

    }
}
