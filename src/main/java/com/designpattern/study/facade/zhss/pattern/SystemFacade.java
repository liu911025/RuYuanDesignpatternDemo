package com.designpattern.study.facade.zhss.pattern;

import com.designpattern.study.facade.zhss.ModuleA;
import com.designpattern.study.facade.zhss.ModuleB;
import com.designpattern.study.facade.zhss.ModuleC;

/**
 * 系统门面, 外观设计模式
 * 把实现功能包装起来,给出外面同意接口
 */
public class SystemFacade {

    public void execute() {
        // 假设我们这里是子系统2，要基于子系统1的3个模块的功能实现一个业务逻辑
        ModuleA moduleA = new ModuleA();
        ModuleB moduleB = new ModuleB();
        ModuleC moduleC = new ModuleC();

        moduleA.execute();
        moduleB.execute();
        moduleC.execute();
    }

}
