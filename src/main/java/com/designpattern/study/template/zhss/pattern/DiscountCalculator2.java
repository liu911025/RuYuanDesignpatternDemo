package com.designpattern.study.template.zhss.pattern;

public class DiscountCalculator2 extends AbstractCalculator {
    @Override
    void specificCalculatePre() {
        System.out.println("优惠计算器2的特殊计算逻辑---pre");
    }

    @Override
    void specificCalculatePost() {
        System.out.println("优惠计算器2的特殊计算逻辑---post");
    }
}
