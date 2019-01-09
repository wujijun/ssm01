package com.neuedu.dao;

import com.neuedu.pojo.User;

import java.util.List;

public interface UserDao {
    public List<User> getLists(User user);
    public Integer insertOne(User user);
    public  Integer deleteOne(int id);
    public  Integer update(User user);
    public User getOne(int id);
}
