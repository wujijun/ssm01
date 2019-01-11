package com.neuedu.test;

import com.neuedu.dao.UserDao;
import com.neuedu.pojo.User;
import com.neuedu.service.IUserService;
import com.neuedu.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.annotation.Resource;
import javax.security.auth.login.AppConfigurationEntry;


/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")*/
public class TestSsm01 {
    /*@Resource
    private IUserService dao;*/

/*    @Test
    public  void  test(){
        List<User> list=dao.getLists();
        for (User u:list
             ) {
            System.out.println(u);
        }

    }*/


/*工厂模式，没听懂的！！！！*/
    @Test
public void test1(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    IUserService service = (IUserService)ac.getBean("service");
     service.doSome();
}
    @Test
    public void test2(){
        BeanFactory ac = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        IUserService service = (IUserService)ac.getBean("service");
        service.doSome();
    }
}
