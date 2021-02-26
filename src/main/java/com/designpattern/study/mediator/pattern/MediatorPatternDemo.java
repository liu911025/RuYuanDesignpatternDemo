package com.designpattern.study.mediator.pattern;

import com.designpattern.study.mediator.inter.IModule;


public class MediatorPatternDemo {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        IModule a = new ModuleA(mediator);
        IModule b = new ModuleB(mediator);
        IModule c = new ModuleC(mediator);
        mediator.executeModuleA();
        mediator.executeModuleB();
        mediator.executeModuleC();
    }

}
