package com.neuedu.test1;

public class DriverAdapter implements AdapterS {
    @Override
    public void work(Object obj) {
        if (obj instanceof Driver){
            Driver d = (Driver)obj;
            d.drive();
            d.update();
        }
    }
}
