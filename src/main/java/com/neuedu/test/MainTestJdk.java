package com.neuedu.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/*动态代理*/

public class MainTestJdk {
    public static void main(String[] args) {
        final ITestJdk t = new TestJdk();
/*ProxyzTest pt = new ProxyzTest(t);*/

        ITestJdk prot = (ITestJdk) Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
/*选择对谁增强！*/

               String str = "";
               if (method.getName().equals("doSome")){
                   str = (String)method.invoke(t,args);
                   return str.toUpperCase();
               }
               return str;
            }
        });
        System.out.println(t.str());
        System.out.println(prot.str());
        System.out.println(t.doSome());
        System.out.println(prot.doSome());
    }
}
