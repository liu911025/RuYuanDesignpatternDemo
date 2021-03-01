package com.designpattern.study.decorator.zhss;


public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Decorator decorator = new Decorator(new ConcreteComponent());
        decorator.execute();
    }

}
