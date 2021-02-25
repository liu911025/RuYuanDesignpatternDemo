package com.designpattern.study.factory.zhss.abstracte.without;

import com.designpattern.study.factory.zhss.abstracte.inter.ProductA;
import com.designpattern.study.factory.zhss.abstracte.inter.ProductB;
import com.designpattern.study.factory.zhss.abstracte.inter.impl.ProductA1;
import com.designpattern.study.factory.zhss.abstracte.inter.impl.ProductA2;
import com.designpattern.study.factory.zhss.abstracte.inter.impl.ProductB1;
import com.designpattern.study.factory.zhss.abstracte.inter.impl.ProductB2;

public class WithoutAbstracteFactoryPatternDemo {

    public static void main(String[] args) {
        // 我们现在要创建产品A1+产品B1的组合
//		ProductA productA1 = new ProductA1();
//		ProductB productB1 = new ProductB1();
//
//		productA1.execute();
//		productB1.execute();

        // 变成产品A1+产品B1的组合
        ProductA productA1 = new ProductA1();
        ProductB productB1 = new ProductB1();

        productA1.execute();
        productB1.execute();

        // 问题来了，调整产品组合的这个行为，如果你手动创建产品组合的代码，有100个地方，A1+B1
        // 一旦要调整，就是要对100个地方的代码，手动一点一点的去修改，组合的逻辑
        // 不可维护，不可扩展

        // 我们现在要创建产品A2+产品B2的组合
        ProductA productA2 = new ProductA2();
        ProductB productB2 = new ProductB2();

        productA2.execute();
        productB2.execute();
    }

}
