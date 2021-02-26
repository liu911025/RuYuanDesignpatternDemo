package com.designpattern.study.mediator.zhss.pattern2;

import com.designpattern.study.mediator.zhss.inter.IModule;

public class ModuleC implements IModule {

    public ModuleC() {

    }

    @Override
    public void execute() {}

    @Override
    public void execute(String module) {
        System.out.println(module + "执行了ModuleC...");
    }
}
