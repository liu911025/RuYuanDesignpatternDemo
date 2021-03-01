package com.designpattern.study.decorator.zhss;

public class ConcreteComponent implements Component {

    @Override
    public void execute() {
        System.out.println("执行基础功能");
    }
}
