package com.designpattern.study.builder.zhss.optimizedPattern;

import com.designpattern.study.builder.zhss.Product;

public interface Builder {

    Builder field1(String value);

    Builder field2(String value);

    Builder field3(String value);

    Product create();

}
