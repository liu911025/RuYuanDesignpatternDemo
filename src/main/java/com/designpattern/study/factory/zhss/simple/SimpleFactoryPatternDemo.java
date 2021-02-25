package com.designpattern.study.factory.zhss.simple;

import com.designpattern.study.factory.zhss.inter.Product;

/**
 * 使用简单工厂设计模式
 *
 * 使用指定产品功能只需修改工厂创建一处地方,多处使用统一修改,适合管理
 */
public class SimpleFactoryPatternDemo {

    public static void main(String[] args) {
        Product product = ProductFactory.createProduct();
        product.execute();
    }

}
