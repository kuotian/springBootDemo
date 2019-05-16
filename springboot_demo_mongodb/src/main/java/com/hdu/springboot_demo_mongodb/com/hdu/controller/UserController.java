package com.hdu.springboot_demo_mongodb.com.hdu.controller;

import com.hdu.springboot_demo_mongodb.com.hdu.dao.UserDao;
import com.hdu.springboot_demo_mongodb.com.hdu.entity.User;
import com.hdu.springboot_demo_mongodb.com.hdu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @Autowired
    UserService userService;

    @GetMapping("/add")
    public String addUser(@RequestParam Long id,
                          @RequestParam String username,
                          @RequestParam String password){
        userService.saveUser(new User(id, username, password));
        return "success";
    }


    @GetMapping("/findUsername")
    public String findUser(@RequestParam String username){
        User user = userService.findUserByUsername(username);
//        return "id:"+ user.getId()+" username:"+user.getUsername() +" password:"+user.getPassword() + " creatTime:"+user.getCreateTime();
        return user.toString();
    }

    @GetMapping("/findID")
    public String findUser(@RequestParam Long id){
        User user = userService.findUserById(id);
        return user.toString();
    }

    @GetMapping("/findTime")
    public String findUserByCreatTime(@RequestParam String createTime){
        List<User> userlist = userService.findAllUsersByCreateTime(createTime);
        StringBuilder list = new StringBuilder();
        for (User user:userlist) {
            list.append(user.toString());
        }
        return list.toString();
    }

    @GetMapping("/update")
    public void updateUser(@RequestParam Long id,
                           @RequestParam String username,
                           @RequestParam String password){
        userService.updateUser(new User(id, username, password));
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam Long id,
                           @RequestParam String username,
                           @RequestParam String password){
        userService.deleteUser(new User(id, username, password));
        return "delete success";
    }

    @GetMapping("/deleteID")
    public String deleteUser(@RequestParam Long id) {
        userService.deleteUserById(id);
        return "delete success";
    }

}
