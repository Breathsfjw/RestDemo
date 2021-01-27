package com.example.jxau.wechatdemo.cotroller;

import com.example.jxau.wechatdemo.entity.User;
import com.example.jxau.wechatdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/jxau")
public class UserController {


    @Autowired
    private UserService userService;

    @PutMapping("/user")
    public boolean addUser(@RequestBody User user) {
        return userService.add(user);
    }

    @DeleteMapping("/user")
    public boolean delUserById(@RequestParam(value = "id") int id) {
        return userService.del(id);
    }

    @PostMapping("/user")
    public boolean editUser(@RequestBody User user) {
        return userService.edit(user);
    }

//    @ResponseBody
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.find(id);
    }

//    @ResponseBody
    @GetMapping("/findAll")
    public List<User> getUserAll() {
        return userService.findAll();
    }

}
