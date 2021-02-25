package com.designpattern.study.singleton.zhss.full.safe;

public class SafeSingletonPatternDemo {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.execute();
    }

}
