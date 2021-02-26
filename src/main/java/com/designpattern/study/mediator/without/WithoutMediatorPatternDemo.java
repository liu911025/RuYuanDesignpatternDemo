package com.designpattern.study.mediator.without;

import com.designpattern.study.mediator.inter.IModule;

public class WithoutMediatorPatternDemo {

    public static void main(String[] args) {
        IModule a = new ModuleA();
        IModule b = new ModuleB();
        IModule c = new ModuleC();
        a.execute();
        b.execute();
        c.execute();
    }

}
