package com.neuedu.test;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.springframework.cglib.proxy.Callback;

import java.lang.reflect.Method;

public class AgentTest implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        String st = (String) methodProxy.invokeSuper(o,args);
        System.out.println(st);
        return st.toUpperCase();
    }
}
