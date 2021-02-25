package com.designpattern.study.template.zhss.pattern;

import com.designpattern.study.template.zhss.inter.Calculator;

/**
 * 定义通用的处理逻辑,其他实现由子类实现
 */
public abstract class AbstractCalculator implements Calculator {

    @Override
    public void calculator() {
        specificCalculatePre();
        System.out.println("通用的计算逻辑---修改");
        specificCalculatePost();
    }

    abstract void specificCalculatePre();
    abstract void specificCalculatePost();
}
