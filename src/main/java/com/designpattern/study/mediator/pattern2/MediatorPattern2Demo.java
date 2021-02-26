package com.designpattern.study.mediator.pattern2;

import com.designpattern.study.mediator.inter.IModule;
import com.designpattern.study.mediator.without.ModuleA;
import com.designpattern.study.mediator.without.ModuleB;
import com.designpattern.study.mediator.without.ModuleC;

public class MediatorPattern2Demo {

    public static void main(String[] args) {
        IModule a = new ModuleA();
        IModule b = new ModuleB();
        IModule c = new ModuleC();

        Mediator mediator = new Mediator(a, b,c);

        mediator.executeModuleA();
        mediator.executeModuleB();
        mediator.executeModuleB();
    }

}
