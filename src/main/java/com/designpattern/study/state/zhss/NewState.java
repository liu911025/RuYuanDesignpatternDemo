package com.designpattern.study.state.zhss;

public class NewState implements State {
    @Override
    public void execute() {
        System.out.println("执行销售出库单新建状态的逻辑");
    }
}
