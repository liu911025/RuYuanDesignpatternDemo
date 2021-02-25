package com.designpattern.study.adapter.zhss;

import com.designpattern.study.adapter.zhss.inter.NewInterface;
import com.designpattern.study.adapter.zhss.inter.NewInterfaceImpl;
import com.designpattern.study.adapter.zhss.inter.OldInterface;
import com.designpattern.study.adapter.zhss.inter.OldInterfaceImpl;

/**
 * 不用设计模式的实现
 * 如果不用任何设计模式，我们的问题在哪儿？
 *  问题其实很明显，就是说，我们的新的代码中，融合了新老两套接口，很麻烦的一个事情
 *  首先如果你这么干的话，就会导致代码很恶心，面向的是规范和风格完全不同的两套接口，你理解和维护的成本提高了
 *  其次，假如说，现在都不给你选择使用老版本接口的机会
 *  直接强制性公司规范要求按照新版本接口来走，你的老版本接口的实现类，就没法用了啊？
 *  难不成还要基于新版本的接口重新写一套？
 *
 */
public class WithoutAdapterPatternDemo {

    public static void main(String[] args) {
        OldInterface oldObject = new OldInterfaceImpl();
        NewInterface newObject = new NewInterfaceImpl();
        oldObject.oldExecute();
        newObject.newExecute();
    }

}
