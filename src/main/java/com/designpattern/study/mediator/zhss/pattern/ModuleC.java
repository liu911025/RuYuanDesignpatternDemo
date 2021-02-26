package com.designpattern.study.mediator.zhss.pattern;

import com.designpattern.study.mediator.zhss.inter.IModule;

public class ModuleC implements IModule {

    Mediator mediator;

    public ModuleC(Mediator mediator) {
        this.mediator = mediator;
        mediator.setC(this);
    }

    @Override
    public void execute() {
        mediator.executeModuleC();
    }

    @Override
    public void execute(String module) {
        System.out.println(module + "执行了ModuleC...");
    }
}
