package com.designpattern.study.template.zhss.pattern;

public class DiscountCalculator1 extends AbstractCalculator {
    @Override
    void specificCalculatePre() {
        System.out.println("优惠计算器1的特殊计算逻辑---pre");
    }

    @Override
    void specificCalculatePost() {
        System.out.println("优惠计算器1的特殊计算逻辑---post");
    }
}
