package com.designpattern.study.prototype.zhss.without;

import com.designpattern.study.prototype.zhss.Component;
import com.designpattern.study.prototype.zhss.Product;

public class WithoutPrototypePatternDemo {

    public static void main(String[] args) {
        Product product = new Product("测试产品1", new Component("组件"));

        /**
         * product2的Component与product同一个
         */
        Product product2 = new Product(product.getName(), product.getComponent());

        System.out.println(product2);
    }

}
