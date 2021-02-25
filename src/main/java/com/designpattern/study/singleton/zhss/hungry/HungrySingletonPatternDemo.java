package com.designpattern.study.singleton.zhss.hungry;

/**
 * 饿汉模式
 */
public class HungrySingletonPatternDemo {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.execute();
    }

}
