package com.designpattern.study.factory.zhss.method.without;

import com.designpattern.study.factory.zhss.inter.Product;

public class Product2Factory {

    public static Product createProduct() {
        System.out.println("生产产品的通用逻辑，修改");
        System.out.println("生产产品2的特殊逻辑");
        return new Product1();
    }

}
