package com.hdu.springboot_demo_mongodb.com.hdu.service;

import com.hdu.springboot_demo_mongodb.com.hdu.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    User findUserByUsername(String username);

    User findUserById(Long id);

    List<User> findAllUsersByCreateTime(String localDate);

    void updateUser(User user);

    void deleteUser(User user);

    void deleteUserById(Long id);
}
