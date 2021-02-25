package com.designpattern.study.singleton.zhss.full.innerClass;

public class InnerClassSingletonPatternDemo {

    public static void main(String[] args) {
        // Singleton instance = new Singleton();
        // instance.execute();
        Singleton instance = Singleton.getInstance();
        instance.execute();
    }

}
