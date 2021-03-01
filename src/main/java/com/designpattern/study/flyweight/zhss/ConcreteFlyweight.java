package com.designpattern.study.flyweight.zhss;

public class ConcreteFlyweight implements Flyweight {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConcreteFlyweight(String name) {
        super();
        this.name = name;
    }

    public void execute() {
        System.out.println(name + "执行功能逻辑");
    }

}
