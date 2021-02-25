package com.designpattern.study.factory.zhss.abstracte.inter.impl;

import com.designpattern.study.factory.zhss.abstracte.inter.ProductB;

public class ProductB1 implements ProductB {
    @Override
    public void execute() {
        System.out.println("产品B1的功能逻辑");
    }
}
