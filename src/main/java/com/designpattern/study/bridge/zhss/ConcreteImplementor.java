package com.designpattern.study.bridge.zhss;

public class ConcreteImplementor implements Implementor {
    @Override
    public void execute() {
        System.out.println("执行了功能逻辑");
    }
}
