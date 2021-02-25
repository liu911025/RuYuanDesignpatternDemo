package com.designpattern.study.factory.zhss.abstracte.pattern;

import com.designpattern.study.factory.zhss.abstracte.inter.ProductA;
import com.designpattern.study.factory.zhss.abstracte.inter.ProductB;
import com.designpattern.study.factory.zhss.abstracte.inter.impl.ProductA1;
import com.designpattern.study.factory.zhss.abstracte.inter.impl.ProductB1;

public class FactoryImpl1 implements AbstractFactory {

    private static final AbstractFactory factory = new FactoryImpl1();

    private FactoryImpl1() {}

    public static AbstractFactory get() {
        return factory;
    }

    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}
