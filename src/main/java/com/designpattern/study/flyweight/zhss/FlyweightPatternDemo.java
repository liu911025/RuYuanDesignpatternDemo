package com.designpattern.study.flyweight.zhss;

/**
 *
 *  享元
 * 	享受，元数据
 * 	同一个数据，我就认为是一个元数据，整个系统里这个数据就一份，缓存起来
 * 	整个系统对这个数据，全部享受他一个对象实例即可
 *
 * 	直接既有内存来缓存一块数据，用享元模式
 *
 */
public class FlyweightPatternDemo {

    public static void main(String[] args) {

        Flyweight flyweight1 = FlyweightFactory.get("对象1");
        flyweight1.execute();

        Flyweight flyweight2 = FlyweightFactory.get("对象1");
        flyweight2.execute();

        System.out.println(flyweight1 == flyweight2);

    }

}
