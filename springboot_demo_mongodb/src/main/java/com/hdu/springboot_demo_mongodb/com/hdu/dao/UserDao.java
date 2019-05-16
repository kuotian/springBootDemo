package com.hdu.springboot_demo_mongodb.com.hdu.dao;

import com.hdu.springboot_demo_mongodb.com.hdu.entity.User;
import java.util.List;

public interface UserDao {
    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    User findUserByUsername(String username);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User findUserById(Long id);

    /**
     * 根据创建时间查询所有用户
     * @param localDate
     * @return
     */
    List<User> findAllUsersByCreateTime(String localDate);

    /**
     * 更新用户通过id,更改user信息
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @param user
     */
    void deleteUser(User user);

    /**
     * 根据id删除用户
     * @param id
     */
    void deleteUserById(Long id);
}
