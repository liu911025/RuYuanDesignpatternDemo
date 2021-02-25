package com.designpattern.study.template.zhss.pattern;


/**
 * 使用模板设计模式
 * 修改通用计算逻辑只需修改抽象类中通用计算逻辑一处
 */
public class TemplateMethodPatternDemo {

    public static void main(String[] args) {
        DiscountCalculator1 discountCalculator1 = new DiscountCalculator1();
        DiscountCalculator2 discountCalculator2 = new DiscountCalculator2();
        System.out.println("---discountCalculator1---");
        discountCalculator1.calculator();
        System.out.println("---discountCalculator2---");
        discountCalculator2.calculator();
    }

}
