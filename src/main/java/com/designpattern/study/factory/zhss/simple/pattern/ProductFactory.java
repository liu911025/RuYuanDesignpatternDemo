package com.designpattern.study.factory.zhss.simple.pattern;

import com.designpattern.study.factory.zhss.inter.Product;
import com.designpattern.study.factory.zhss.simple.Product1;

public class ProductFactory {

    private ProductFactory() {}

    public static Product createProduct() {
        return new Product1();
    }
}
