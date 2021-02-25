package com.designpattern.study.builder.zhss.pattern;

import com.designpattern.study.builder.zhss.Product;

public interface Builder {

    void field1(String value);

    void field2(String value);

    void field3(String value);

    Product create();

}
