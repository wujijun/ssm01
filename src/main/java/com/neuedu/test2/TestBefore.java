package com.neuedu.test2;

import com.neuedu.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBefore {
    @Test
    public void t(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ITest service = (ITest)ac.getBean("bTest");
        service.sale();
    }
}
