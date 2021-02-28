package com.designpattern.study.state.zhss;

public class ApprovedState implements State {

    public void execute() {
        System.out.println("执行销售出库单已审批状态的逻辑");
    }

}
