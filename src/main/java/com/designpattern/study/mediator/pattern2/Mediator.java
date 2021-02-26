package com.designpattern.study.mediator.pattern2;

import com.designpattern.study.mediator.inter.IModule;

public class Mediator {

    IModule a;
    IModule b;
    IModule c;

    public Mediator(IModule a, IModule b, IModule c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void executeModuleA() {
        b.execute("ModuleA");
        c.execute("ModuleA");
    }

    public void executeModuleB() {
        a.execute("ModuleB");
        c.execute("ModuleB");
    }

    public void executeModuleC() {
        a.execute("ModuleC");
        b.execute("ModuleC");
    }
}
