package com.designpattern.study.mediator.zhss.without;

import com.designpattern.study.mediator.zhss.inter.IModule;

public class ModuleB implements IModule {

    IModule a;
    IModule c;

    public ModuleB() {

    }

    @Override
    public void execute() {
        this.a = new ModuleA();
        this.c = new ModuleC();
        a.execute("ModuleB");
        c.execute("ModuleB");
    }

    @Override
    public void execute(String module) {
        System.out.println(module + "执行了ModuleB...");
    }
}
