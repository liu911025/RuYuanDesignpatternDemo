package com.designpattern.study.adapter.zhss;

import com.designpattern.study.adapter.zhss.inter.NewInterfaceAdapter;
import com.designpattern.study.adapter.zhss.inter.OldInterfaceImpl;

/**
 * 使用适配器设计模式
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        NewInterfaceAdapter adapter = new NewInterfaceAdapter(new OldInterfaceImpl());
        adapter.newExecute();
    }

}
