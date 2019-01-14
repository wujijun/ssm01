package com.neuedu.test2;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforTest implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Ðû´«");
    }
}
