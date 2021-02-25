package com.designpattern.study.singleton.zhss.full.unsafe;

/**
 * 线程不安全的单例模式
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        return new Singleton();
    }

    public void execute() {
        System.out.println("线程不安全的单例类的方法");
    }

}
