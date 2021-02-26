package com.designpattern.study.mediator.zhss.without;

import com.designpattern.study.mediator.zhss.inter.IModule;

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
