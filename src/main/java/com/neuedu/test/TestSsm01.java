package com.neuedu.test;

import com.neuedu.dao.UserDao;
import com.neuedu.pojo.User;
import com.neuedu.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.ui.ModelMap;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestSsm01 {
    @Resource
    private UserDao dao;
    @Test
    public  void  test(){
        List<User> list=dao.getLists();
        for (User u:list
             ) {
            System.out.println(u);
        }

    }

}
