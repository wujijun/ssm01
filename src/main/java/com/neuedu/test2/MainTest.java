package com.neuedu.test2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MainTest {
    public static void main(String[] args) {
        final ITest sale = new TestSale();
        ITest iTest=(ITest)Proxy.newProxyInstance(sale.getClass().getClassLoader(), sale.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Ðû´«");
                method.invoke(sale,args);
                System.out.println("·ÖÎö");
                return null;
            }
        });
        iTest.sale();
    }


}
