package com.neuedu.test1;

public class AdapterImpl implements AdapterS {
    @Override
    public void work(Object obj) {
        if (obj instanceof Cook){
            Cook c = (Cook)obj;
            c.cook();
        }
        if (obj instanceof Driver){
            Driver d = (Driver)obj;
            d.drive();
        }
    }
}
