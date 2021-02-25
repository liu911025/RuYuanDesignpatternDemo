package com.designpattern.study.factory.zhss.abstracte.pattern;

import com.designpattern.study.factory.zhss.abstracte.inter.ProductA;
import com.designpattern.study.factory.zhss.abstracte.inter.ProductB;
import com.designpattern.study.factory.zhss.abstracte.inter.impl.ProductA1;
import com.designpattern.study.factory.zhss.abstracte.inter.impl.ProductA2;
import com.designpattern.study.factory.zhss.abstracte.inter.impl.ProductB1;
import com.designpattern.study.factory.zhss.abstracte.inter.impl.ProductB2;

public class FactoryImpl2 implements AbstractFactory {

    private static final AbstractFactory factory = new FactoryImpl2();

    private FactoryImpl2() {}

    public static AbstractFactory get() {
        return factory;
    }

    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}
