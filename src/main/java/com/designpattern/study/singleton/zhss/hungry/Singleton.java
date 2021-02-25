package com.designpattern.study.singleton.zhss.hungry;

/**
 * 饿汉单例模式
 */
public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }

    public void execute() {
        System.out.println("饿汉单例类的方法");
    }
}
