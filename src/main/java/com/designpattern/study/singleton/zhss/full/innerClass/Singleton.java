package com.designpattern.study.singleton.zhss.full.innerClass;

/**
 * 内部类饿汉单例模式, 也可以做饱汉模式
 *
 * 内部类，只要没有被使用，就不会初始化，Singleton的实例就不会创建
 *
 * 在第一次有人调用getInstance方法的时候，内部类会初始化，创建一个Singleton的实例
 *
 * 然后java能确保的一点是，类静态初始化的过程一定只会执行一次
 *
 */
public class Singleton {

    public Singleton(){
        System.out.println("内部类单例模式构造器初始化...");
    }

    private static class InnerClass {

        static {
            System.out.println("InnerClass执行了...");
        }

        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return InnerClass.instance;
    }

    public void execute() {
        System.out.println("InnerClass线程安全的单例类的方法");
    }
}
