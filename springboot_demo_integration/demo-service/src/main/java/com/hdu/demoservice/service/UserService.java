package com.hdu.demoservice.service;

import com.hdu.demodao.entity.User;

public interface UserService {
    User findUserById(int id);

    int insertUser(User user);
}
