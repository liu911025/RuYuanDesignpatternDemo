package com.designpattern.study.factory.zhss.abstracte.pattern;

import com.designpattern.study.factory.zhss.abstracte.inter.ProductA;
import com.designpattern.study.factory.zhss.abstracte.inter.ProductB;

public interface AbstractFactory {

    ProductA createProductA();
    ProductB createProductB();

}
