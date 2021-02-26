package com.designpattern.study.mediator.pattern2;

import com.designpattern.study.mediator.inter.IModule;

public class ModuleB implements IModule {

    public ModuleB() {

    }

    @Override
    public void execute() {}

    @Override
    public void execute(String module) {
        System.out.println(module + "执行了ModuleB...");
    }
}
