package com.designpattern.study.mediator.zhss.pattern2;

import com.designpattern.study.mediator.zhss.inter.IModule;

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
