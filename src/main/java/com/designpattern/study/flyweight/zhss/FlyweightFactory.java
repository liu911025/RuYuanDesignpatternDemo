package com.designpattern.study.flyweight.zhss;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static Map<String, Flyweight> cachePool = new HashMap<String, Flyweight>();

    public static Flyweight get(String name) {
        Flyweight flyweight = cachePool.get(name);
        if(flyweight == null) {
            flyweight = new ConcreteFlyweight(name);
            cachePool.put(name, flyweight);
        }
        return flyweight;
    }

}
