package com.designpattern.study.factory.zhss.method.pattern;

import com.designpattern.study.factory.zhss.inter.Product;

public class Product1 implements Product {
    @Override
    public void execute() {
        System.out.println("产品1的功能逻辑");
    }
}
