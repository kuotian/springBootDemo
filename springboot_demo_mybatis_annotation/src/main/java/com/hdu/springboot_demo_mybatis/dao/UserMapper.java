package com.hdu.springboot_demo_mybatis.dao;

import com.hdu.springboot_demo_mybatis.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Select("select id,username,age from user where id = #{id}")
    User findUserById(int id);

    @Delete("delete from user where id=#{id}")
    public int deleteUserById(int id);

//    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into user(username,age) values(#{username},#{age})")
    public int insertUser(User user);

    @Update("update user set username=#{username},age=#{age} where id=#{id}")
    public int updateUser(User user);

}
