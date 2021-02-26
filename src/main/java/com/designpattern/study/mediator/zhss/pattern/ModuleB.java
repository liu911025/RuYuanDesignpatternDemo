package com.designpattern.study.mediator.zhss.pattern;

import com.designpattern.study.mediator.zhss.inter.IModule;

public class ModuleB implements IModule {
    Mediator mediator;

    public ModuleB(Mediator mediator) {
        this.mediator = mediator;
        mediator.setB(this);
    }

    @Override
    public void execute() {
        mediator.executeModuleB();
    }

    @Override
    public void execute(String module) {
        System.out.println(module + "执行了ModuleB...");
    }
}
