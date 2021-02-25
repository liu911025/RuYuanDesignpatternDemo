package com.designpattern.study.builder.zhss.pattern;

import com.designpattern.study.builder.zhss.Product;

public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void field1(String value) {
        System.out.println("在设置field1之前进行复杂的校验逻辑");
        product.setField1(value);
    }

    @Override
    public void field2(String value) {
        System.out.println("在设置field2之前进行复杂的校验逻辑");
        product.setField2(value);
    }

    @Override
    public void field3(String value) {
        System.out.println("在设置field3之前进行复杂的校验逻辑");
        product.setField3(value);
    }

    @Override
    public Product create() {
        return product;
    }
}
