package com.designpattern.study.mediator.without;

import com.designpattern.study.mediator.inter.IModule;

public class ModuleA implements IModule {

    IModule b;
    IModule c;

    public ModuleA() {

    }

    @Override
    public void execute() {
        b = new ModuleB();
        c = new ModuleC();
        b.execute("ModuleA");
        c.execute("ModuleA");
    }

    @Override
    public void execute(String module) {
        System.out.println(module + "执行了ModuleA...");
    }
}
