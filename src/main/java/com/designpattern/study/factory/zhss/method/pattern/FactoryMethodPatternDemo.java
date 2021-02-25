package com.designpattern.study.factory.zhss.method.pattern;

import com.designpattern.study.factory.zhss.inter.Product;

public class FactoryMethodPatternDemo {

    public static void main(String[] args) {
        Product product1 = Product1Factory.get().createProduct();
        Product product2 = Product2Factory.get().createProduct();

        product1.execute();
        product2.execute();

    }

}
