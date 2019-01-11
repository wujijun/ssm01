package com.neuedu.test1;

public class CookImpl implements Cook {
    @Override
    public void cook() {
        System.out.println("Cook is cooking");
    }

    @Override
    public void eat() {
        System.out.println("cook is eating");
    }
}
