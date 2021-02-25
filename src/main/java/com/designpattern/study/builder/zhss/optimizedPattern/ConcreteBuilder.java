package com.designpattern.study.builder.zhss.optimizedPattern;

import com.designpattern.study.builder.zhss.Product;

public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public Builder field1(String value) {
        System.out.println("在设置field1之前进行复杂的校验逻辑");
        product.setField1(value);
        return this;
    }

    @Override
    public Builder field2(String value) {
        System.out.println("在设置field2之前进行复杂的校验逻辑");
        product.setField2(value);
        return this;
    }

    @Override
    public Builder field3(String value) {
        System.out.println("在设置field3之前进行复杂的校验逻辑");
        product.setField3(value);
        return this;
    }

    @Override
    public Product create() {
        return product;
    }
}
