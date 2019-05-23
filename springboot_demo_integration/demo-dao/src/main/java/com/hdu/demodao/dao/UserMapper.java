package com.hdu.demodao.dao;

import com.hdu.demodao.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findUserById(int id);

    int insertUser(User user);
}
