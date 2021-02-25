package com.designpattern.study.facade.zhss.without;

import com.designpattern.study.facade.zhss.ModuleA;
import com.designpattern.study.facade.zhss.ModuleB;
import com.designpattern.study.facade.zhss.ModuleC;

/**
 * 未使用外观设计模式
 *
 *  问题一：对应子系统1来说，维护成本太高了，就是因为要care多个子系统2的模块。
 *  如果只是3个模块还凑合，若果是20个模块呢？那子系统1对子系统2的各个模块的了解就要很多，维护成本很高
 *
 * 	问题二：就这个多个模块组成的一个功能，如果在子系统1的多个地方都使用到了，那么那段代码就会在多个地方
 * 	都有重复，复制粘贴的过程，一旦这段业务逻辑修改了，比如还要加入一个模块D的功能，可能就要修改多个地方
 * 	的代码，会弄的非常的麻烦
 */
public class WithoutFacadePatternDemo {

    public static void main(String[] args) {
        // 假设我们这里是子系统2，要基于子系统1的3个模块的功能实现一个业务逻辑
        ModuleA moduleA = new ModuleA();
        ModuleB moduleB = new ModuleB();
        ModuleC moduleC = new ModuleC();

        moduleA.execute();
        moduleB.execute();
        moduleC.execute();
    }

}
