package com.designpattern.study.factory.zhss.method.pattern;

import com.designpattern.study.factory.zhss.inter.Product;

public class Product1Factory extends AbstractProductFactory {

    private static final Product1Factory product1Factory = new Product1Factory();

    private Product1Factory() {}

    public static AbstractProductFactory get() {
        return product1Factory;
    }

    @Override
    Product specificCreate() {
        System.out.println("生产产品1的特殊功能");
        return new Product1();
    }
}
