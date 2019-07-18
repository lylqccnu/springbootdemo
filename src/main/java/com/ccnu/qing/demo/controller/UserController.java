package com.ccnu.qing.demo.controller;

import com.ccnu.qing.demo.model.User;
import com.ccnu.qing.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/UserController")
public class UserController {
    @Resource
    private UserService UserService;

    @RequestMapping("/showUserToJspById/{userId}")
    @ResponseBody
    public User showUser(@PathVariable("userId")Integer userId) {
        User user = this.UserService.getById(userId);
        return user;
    }
}
