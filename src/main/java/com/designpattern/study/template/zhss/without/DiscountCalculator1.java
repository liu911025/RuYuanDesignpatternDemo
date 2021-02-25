package com.designpattern.study.template.zhss.without;

import com.designpattern.study.template.zhss.inter.Calculator;

public class DiscountCalculator1 implements Calculator {
    @Override
    public void calculator() {
        System.out.println("通用的计算逻辑");
        System.out.println("优惠计算器1的特殊计算逻辑");
    }
}
