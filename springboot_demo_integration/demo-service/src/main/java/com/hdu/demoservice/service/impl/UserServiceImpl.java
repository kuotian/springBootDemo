package com.hdu.demoservice.service.impl;

import com.hdu.demodao.dao.UserMapper;
import com.hdu.demodao.entity.User;
import com.hdu.demoservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
