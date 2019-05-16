package com.hdu.springboot_demo_mongodb.com.hdu.dao;

import com.hdu.springboot_demo_mongodb.com.hdu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.List;

@Component
public class UserDaoImpl implements  UserDao {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void saveUser(User user) {
        mongoTemplate.save(user,"user");
    }

    @Override
    public User findUserByUsername(String username) {
        Query query = new Query(Criteria.where("username").is(username));
        return mongoTemplate.findOne(query, User.class, "user");
    }

    @Override
    public User findUserById(Long id) {
        Query query = new Query(Criteria.where("_id").is(id));
        return mongoTemplate.findOne(query, User.class, "user");
    }

    @Override
    public List<User> findAllUsersByCreateTime(String localDate) {
        Query query = new Query(Criteria.where("createTime").is(localDate));
        return mongoTemplate.find(query, User.class, "user");
    }

    @Override
    public void updateUser(User user) {
        Query query = new Query(Criteria.where("_id").is(user.getId()));
        Update update = new Update().set("username", user.getUsername())
                .set("password", user.getPassword());
        mongoTemplate.updateFirst(query, update, User.class);
//        mongoTemplate.updateMulti(query,update, User.class);
//        mongoTemplate.upsert(query,update,User.class);
    }

    @Override
    public void deleteUser(User user) {
        mongoTemplate.remove(user,"user");
    }

    @Override
    public void deleteUserById(Long id) {
        Query query = new Query(Criteria.where("_id").is(id));
        mongoTemplate.remove(query, User.class,"user");

    }
}
