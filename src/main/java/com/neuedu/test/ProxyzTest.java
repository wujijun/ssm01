package com.neuedu.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyzTest implements InvocationHandler {
  /*  private Object obj;
    public ProxyzTest(Object obj){
            this.obj = obj;
    }*/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String str = (String)method.invoke(proxy,args);
        return str.toUpperCase();
    }
}
