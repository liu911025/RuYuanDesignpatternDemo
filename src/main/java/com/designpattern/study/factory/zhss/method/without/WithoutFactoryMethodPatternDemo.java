package com.designpattern.study.factory.zhss.method.without;

import com.designpattern.study.factory.zhss.inter.Product;

/**
 * 跟模板方法模式的问题一模一样
 * 就是多个工厂类中，有生产产品的相同的通用逻辑，没有抽取出来，直接复制粘贴放多个工厂里了
 * 如果那段通用逻辑要修改
 * 就需要很麻烦到所有工厂中去修改代码；可能会忘记修改某个工厂的代码
 */
public class WithoutFactoryMethodPatternDemo {

    public static void main(String[] args) {
        Product product1 = Product1Factory.createProduct();
        Product product2 = Product2Factory.createProduct();

        product1.execute();
        product2.execute();

    }

}
