package com.neuedu.test2;

import net.sf.cglib.proxy.MethodProxy;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;



public class AroundTest implements MethodInterceptor{
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕前");
        String str = (String)methodInvocation.proceed();
        System.out.println("环绕后");
        return str.toUpperCase();
    }
}
