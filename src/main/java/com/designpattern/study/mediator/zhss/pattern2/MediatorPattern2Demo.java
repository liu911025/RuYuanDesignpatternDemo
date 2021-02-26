package com.designpattern.study.mediator.zhss.pattern2;

import com.designpattern.study.mediator.zhss.inter.IModule;
import com.designpattern.study.mediator.zhss.without.ModuleA;
import com.designpattern.study.mediator.zhss.without.ModuleB;
import com.designpattern.study.mediator.zhss.without.ModuleC;

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
