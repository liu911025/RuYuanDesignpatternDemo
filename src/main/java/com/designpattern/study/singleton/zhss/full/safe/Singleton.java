package com.designpattern.study.singleton.zhss.full.safe;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public void execute() {
        System.out.println("线程安全的单例类的方法");
    }
}
