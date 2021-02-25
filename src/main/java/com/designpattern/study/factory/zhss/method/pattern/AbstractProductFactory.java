package com.designpattern.study.factory.zhss.method.pattern;

import com.designpattern.study.factory.zhss.inter.Product;

public abstract class AbstractProductFactory {

    public  Product createProduct() {
        commonCreate();
        return specificCreate();
    }

    private void commonCreate() {
        System.out.println("生产产品的通用逻辑，修改");
    }

    abstract Product specificCreate();
}
