package com.designpattern.study.factory.zhss.simple;

import com.designpattern.study.factory.zhss.inter.Product;

public class ProductFactory {

    private ProductFactory() {}

    public static Product createProduct() {
        return new Product1();
    }
}
