package com.designpattern.study.factory.zhss.simple;

import com.designpattern.study.factory.zhss.inter.Product;

public class Product2 implements Product {

    @Override
    public void execute() {
        System.out.println("产品2的功能实现");
    }
}
