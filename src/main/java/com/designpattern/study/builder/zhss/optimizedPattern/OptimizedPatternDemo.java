package com.designpattern.study.builder.zhss.optimizedPattern;

import com.designpattern.study.builder.zhss.Product;

public class OptimizedPatternDemo {

    public static void main(String[] args) {
        Product product = new ConcreteBuilder()
                .field1("1")
                .field2("2")
                .field3("3")
                .create();
        System.out.println(product);
    }

}
