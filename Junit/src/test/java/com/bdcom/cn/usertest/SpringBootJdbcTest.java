package com.bdcom.cn.usertest;

import java.util.List;

import com.bdcom.cn.JunitApp;
import com.bdcom.cn.dao.UserRepository;
import com.bdcom.cn.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=JunitApp.class)// 指定spring-boot的启动类
//@SpringApplicationConfiguration(classes = Application.class)// 1.4.0 前版本
public class SpringBootJdbcTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void findAllUsers()  {
        List<User> users = userRepository.findAll();
        System.out.println(users);


    }

    @Test
    public void findUserById()  {
        User user = userRepository.findUserById(1);
        System.out.println(user);
    }
    @Test
    public void findUserByName()  {
        List<User> users = userRepository.findUserByName("jjl");
        System.out.println(users);
    }
    @Test
    public void updateById()  {
        User newUser = new User(1, "JackChen", "JackChen@qq.com");
        userRepository.updateUser(newUser.getEmail(),newUser.getName(),newUser.getId());
       // userRepository.updateUserEmail(newUser.getEmail(),newUser.getId());
        User newUser2 = userRepository.findUserById(newUser.getId());
        System.out.println(newUser2);
    }



    @Test
    public void createUser() {
        User user = new User(0, "jjl", "jjl@gmail.com");
        User savedUser = userRepository.save(user);
        System.out.println(savedUser);
    }
}