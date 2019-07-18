package com.ccnu.qing.demo;

import com.ccnu.qing.demo.model.User;
import com.ccnu.qing.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Resource
    private UserService userService;

    @Test
    public void contextLoads() {
        User userById = userService.getById(1);
        System.out.println(userById.getPassword());
    }

}
