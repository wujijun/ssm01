package com.neuedu.service;

import com.neuedu.pojo.User;

import java.util.List;

public interface IUserService {
    public List<User> getLists();
    public Integer insertOne(User user);
    public  Integer delete(Integer id);
    public  Integer update(User user);
    public  User getOne(int id);
}
