package com.neuedu.service;

import com.neuedu.dao.UserDao;
import com.neuedu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.xml.ws.soap.Addressing;
import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDao dao;
    @Override
    public List<User> getLists() {
        return dao.getLists();
    }

    @Override
    public Integer insertOne(User user) {
        return dao.insertOne(user);
    }

    @Override
    public Integer delete(Integer id) {
        return dao.deleteOne(id);
    }

    @Override
    public Integer update(User user) {
        return dao.update(user);
    }

    @Override
    public User getOne(int id) {
        return dao.getOne(id);
    }
}
