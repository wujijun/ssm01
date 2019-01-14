package com.neuedu.test2;

import net.sf.cglib.proxy.MethodProxy;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;



public class AroundTest implements MethodInterceptor{
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("����ǰ");
        String str = (String)methodInvocation.proceed();
        System.out.println("���ƺ�");
        return str.toUpperCase();
    }
}
