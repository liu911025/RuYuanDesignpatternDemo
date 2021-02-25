package com.designpattern.study.factory.zhss.simple.without;

import com.designpattern.study.factory.zhss.simple.Product1;

/**
 * 未使用设计模式
 *
 * 使用指定产品功能需要创建一个,多处使用多处创建,不适合管理
 */
public class WithoutSimpleFactoryPatternDemo {

    public static void main(String[] args) {
        Product1 product1 = new Product1();
        product1.execute();

        /*Product2 product2 = new Product2();
        product2.execute();*/
    }
}
