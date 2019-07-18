package com.ccnu.qing.demo.service.impl;

import com.ccnu.qing.demo.mapper.UserMapper;
import com.ccnu.qing.demo.model.User;
import com.ccnu.qing.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
