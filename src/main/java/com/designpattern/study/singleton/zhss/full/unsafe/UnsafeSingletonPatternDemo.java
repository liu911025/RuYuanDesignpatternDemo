package com.designpattern.study.singleton.zhss.full.unsafe;

public class UnsafeSingletonPatternDemo {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.execute();
    }

}
