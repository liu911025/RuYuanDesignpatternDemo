package com.designpattern.study.builder.zhss.pattern;

import com.designpattern.study.builder.zhss.Product;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());
        Product product = director.build("1", "2", "3");
        System.out.println(product);
    }
}
