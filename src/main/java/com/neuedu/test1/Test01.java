package com.neuedu.test1;

public class Test01 {
    public static void main(String[] args) {
        Cook c = new CookImpl();
        Driver d = new DriveImpl();
        Object [] ob = {c,d};
        for (Object o:ob
             ) {
            AdapterS as = new AdapterImpl();
            as.work(o);
        }
    }
}
