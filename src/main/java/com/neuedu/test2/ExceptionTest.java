package com.neuedu.test2;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionTest implements ThrowsAdvice {
    public void afterThrowing(UserException ex){
        System.out.println("�쳣e");
    }
}
