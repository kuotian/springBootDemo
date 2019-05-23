package com.hdu.controller;

import com.hdu.demodao.entity.User;
import com.hdu.demoservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/get/{id}")
    public User index(@PathVariable("id") int id){
        return userService.findUserById(id);
    }

    @GetMapping("/insert")
    public String insertUser(User user){
        userService.insertUser(user);
        return "success";
    }
}
