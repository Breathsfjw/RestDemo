package com.example.jxau.wechatdemo.service.impl;

import com.example.jxau.wechatdemo.entity.User;
import com.example.jxau.wechatdemo.mapper.UserMapper;
import com.example.jxau.wechatdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean add(User user) {
        return userMapper.add(user);
    }

    @Override
    public boolean del(int id) {
        return userMapper.del(id);
    }

    @Override
    public boolean edit(User user) {
        return userMapper.edit(user);
    }

    @Override
    public User find(int id) {
        return userMapper.find(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
