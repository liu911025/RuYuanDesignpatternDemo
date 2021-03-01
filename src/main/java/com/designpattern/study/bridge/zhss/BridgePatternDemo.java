package com.designpattern.study.bridge.zhss;

public class BridgePatternDemo {

    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementor());
        abstraction.execute();
    }

}
