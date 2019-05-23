package com.hdu.springboot_demo_mybatis_xml.dao;

import com.hdu.springboot_demo_mybatis_xml.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findUserById(int id);

    int insertUser(User user);
}
