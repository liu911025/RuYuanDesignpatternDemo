package com.designpattern.study.factory.zhss.method.without;

import com.designpattern.study.factory.zhss.inter.Product;

public class Product2 implements Product {
    @Override
    public void execute() {
        System.out.println("产品2的功能逻辑");
    }
}
