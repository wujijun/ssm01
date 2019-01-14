package com.neuedu.test2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAfter {
    @Test
    public void ta() throws UserException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ITest service = (ITest)ac.getBean("ATest");
        service.login("name1","123");
    }
}
