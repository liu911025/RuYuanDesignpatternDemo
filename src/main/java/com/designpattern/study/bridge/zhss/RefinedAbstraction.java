package com.designpattern.study.bridge.zhss;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void execute() {
        implementor.execute();
    }
}
