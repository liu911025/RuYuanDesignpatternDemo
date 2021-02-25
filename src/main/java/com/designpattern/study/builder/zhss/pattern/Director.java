package com.designpattern.study.builder.zhss.pattern;

import com.designpattern.study.builder.zhss.Product;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product build(String field1, String field2, String field3) {
        builder.field1(field1);
        builder.field1(field2);
        builder.field1(field3);
        return builder.create();
    }
}
