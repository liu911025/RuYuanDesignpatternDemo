package com.designpattern.study.mediator.pattern2;

import com.designpattern.study.mediator.inter.IModule;

public class ModuleA implements IModule {

    public ModuleA() {

    }

    @Override
    public void execute() {}

    @Override
    public void execute(String module) {
        System.out.println(module + "执行了ModuleA...");
    }
}
