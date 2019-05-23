package com.hdu.springboot_demo_mybatis.controller;

import com.hdu.springboot_demo_mybatis.dao.UserMapper;
import com.hdu.springboot_demo_mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable("id") int id){
        return userMapper.findUserById(id);
    }

    @GetMapping("/insert")
    public String insertUser(User user){
        userMapper.insertUser(user);
        return "success";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id){
        userMapper.deleteUserById(id);
        return "success";
    }

    @GetMapping("/update")
    public String updateUser(User user){
        userMapper.updateUser(user);
        return "success";
    }
}
