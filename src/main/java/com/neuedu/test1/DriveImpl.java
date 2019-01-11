package com.neuedu.test1;

public class DriveImpl implements Driver {
    @Override
    public void drive() {
        System.out.println("driver is driving");
    }

    @Override
    public void update() {
        System.out.println("driver is updating car");
    }
}
