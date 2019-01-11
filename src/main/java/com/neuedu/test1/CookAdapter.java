package com.neuedu.test1;

public class CookAdapter implements AdapterS {
    @Override
    public void work(Object obj) {
        if (obj instanceof Cook) {
            Cook c = (Cook) obj;
            c.cook();
            c.eat();
        }
    }
}
