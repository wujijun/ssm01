package com.neuedu.test1;

import java.util.ArrayList;
import java.util.List;

public class test02 {
    public static void main(String[] args) {
        Cook c = new CookImpl();
        Driver d = new DriveImpl();
        Object [] ob = {c,d};
        for (Object o:ob
        ) {
            List<AdapterS> as = getAllAdapter();
            for (AdapterS a :as
                 ) {
               a.work(o);
            }
        }
    }
    public static List<AdapterS> getAllAdapter(){
        List<AdapterS> list = new ArrayList<>();
        list.add(new DriverAdapter());
        list.add(new CookAdapter());
        return list;
    }
}
