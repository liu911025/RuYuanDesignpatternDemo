package com.designpattern.study.factory.zhss.method.pattern;

import com.designpattern.study.factory.zhss.inter.Product;

public class Product2Factory extends AbstractProductFactory {

    private static final AbstractProductFactory factory = new Product2Factory();

    private Product2Factory() {}

    public static AbstractProductFactory get () {
        return factory;
    }

    @Override
    Product specificCreate() {
        System.out.println("生产产品2的特殊功能");
        return new Product2();
    }
}
