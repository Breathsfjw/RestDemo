package com.example.jxau.wechatdemo.mapper;

import com.example.jxau.wechatdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    boolean add(User user);

    boolean del(int id);

    boolean edit(User user);

    User find(int id);

    List<User> findAll();

}
