package com.designpattern.study.mediator.zhss.without;

import com.designpattern.study.mediator.zhss.inter.IModule;

public class ModuleC implements IModule {

    IModule a;
    IModule b;

    public ModuleC() {

    }

    @Override
    public void execute() {
        a = new ModuleA();
        b = new ModuleB();
        a.execute("ModuleC");
        b.execute("ModuleC");
    }

    @Override
    public void execute(String module) {
        System.out.println(module + "执行了ModuleC...");
    }
}
