package com.designpattern.study.factory.zhss.abstracte.pattern;

import com.designpattern.study.factory.zhss.abstracte.inter.ProductA;
import com.designpattern.study.factory.zhss.abstracte.inter.ProductB;

/**
 * 哪怕你有100个地方定义了产品组合，要调整组合的逻辑，只要修改一个工厂就可以了
 */
public class AbstracteFactoryPatternDemo {

    public static void main(String[] args) {
        // 产品A1+产品B1 -> 产品A1+产品B3
        ProductA firstProductA = FactoryImpl1.get().createProductA();
        ProductB firstProductB = FactoryImpl1.get().createProductB();
        firstProductA.execute();
        firstProductB.execute();

        // 产品A2+产品B2
        ProductA secondProductA = FactoryImpl2.get().createProductA();
        ProductB secondProductB = FactoryImpl2.get().createProductB();
        secondProductA.execute();
        secondProductB.execute();
    }

}
