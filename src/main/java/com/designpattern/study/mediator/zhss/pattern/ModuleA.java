package com.designpattern.study.mediator.zhss.pattern;

import com.designpattern.study.mediator.zhss.inter.IModule;

public class ModuleA implements IModule {
    Mediator mediator;

    public ModuleA(Mediator mediator) {
        this.mediator = mediator;
        mediator.setA(this);
    }

    @Override
    public void execute() {
        mediator.executeModuleA();
    }

    @Override
    public void execute(String module) {
        System.out.println(module + "执行了ModuleA...");
    }
}
