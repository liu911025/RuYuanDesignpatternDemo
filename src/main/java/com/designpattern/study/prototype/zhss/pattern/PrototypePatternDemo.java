package com.designpattern.study.prototype.zhss.pattern;

import com.designpattern.study.prototype.zhss.Component;
import com.designpattern.study.prototype.zhss.Product;

/**
 *  原型模式，就是在要拷贝的类里实现一个clone()方法，自己拷贝自己
 *  拷贝的时候，就两个概念，浅拷贝，深拷贝
 *
 *  很多地方要克隆这个对象，不要自己维护克隆的逻辑，即使克隆逻辑修改了，只要在clone()方法里面修改
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        try {
            Product product = new Product("测试产品", new Component("测试组件"));
            Product copyProduct = (Product) product.clone();
            System.out.println(copyProduct);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
