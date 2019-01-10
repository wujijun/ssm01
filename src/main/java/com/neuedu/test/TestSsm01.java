package com.neuedu.test;

import com.neuedu.service.IUserService;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestSsm01 {
    @Resource
    private IUserService dao;

/*    @Test
    public  void  test(){
        List<User> list=dao.getLists();
        for (User u:list
             ) {
            System.out.println(u);
        }

    }*/

}
