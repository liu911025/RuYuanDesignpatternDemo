package com.designpattern.study.factory.zhss.abstracte.inter.impl;

import com.designpattern.study.factory.zhss.abstracte.inter.ProductA;

public class ProductA2 implements ProductA {
    @Override
    public void execute() {
        System.out.println("产品A2的功能逻辑");
    }
}
