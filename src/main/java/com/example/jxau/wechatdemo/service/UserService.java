package com.example.jxau.wechatdemo.service;

import com.example.jxau.wechatdemo.entity.User;



import java.util.List;


public interface UserService {

    boolean add(User user);

    boolean del(int id);

    boolean edit(User user);

    User find(int id);

    List<User> findAll();

}
