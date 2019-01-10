package com.neuedu.test;


import net.sf.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.Callback;

public class MainTestCg {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CgTest.class);
        enhancer.setCallback(new AgentTest());
        /*CgTest s = (CgTest)enhancer.create();
        System.out.println(s);*/
    }
}
