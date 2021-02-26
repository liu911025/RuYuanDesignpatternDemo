package com.designpattern.study.proxy.zhss;

public class ConcreteSubject implements Subject {

    @Override
    public void request() {
        System.out.println("ConcreteSubject --> request");
    }
}
