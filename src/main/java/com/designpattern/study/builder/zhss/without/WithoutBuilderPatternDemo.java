package com.designpattern.study.builder.zhss.without;

import com.designpattern.study.builder.zhss.Product;

/**
 *
 */
public class WithoutBuilderPatternDemo {

    public static void main(String[] args) {
        // 构造这个复杂的product对象
        Product product = new Product();
        // 设置field1属性
        System.out.println("在设置field1之前进行复杂的校验逻辑");
        product.setField1("值1");
        // 设置field2属性
        System.out.println("在设置field2之前进行复杂的数据格式转化逻辑");
        product.setField2("值2");
        // 设置field3属性
        System.out.println("在设置field3之前进行复杂的数据处理逻辑，跟其他对象的数据进行关联");
        product.setField3("值3");
    }

}
