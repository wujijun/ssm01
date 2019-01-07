package com.neuedu.test;

import com.neuedu.dao.UserDao;
import com.neuedu.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;

import java.util.List;

public class TestSsm01 {
    @Autowired
    private UserDao dao;
    @Test
    public  void  test(ModelMap map){
        List<User> list=dao.getLists();
        map.addAttribute("lists",list);
        for (User u:list
             ) {
            System.out.println(u);
        }

    }

}
