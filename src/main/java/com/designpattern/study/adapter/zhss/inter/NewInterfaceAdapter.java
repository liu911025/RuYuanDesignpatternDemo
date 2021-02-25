package com.designpattern.study.adapter.zhss.inter;

import com.sun.corba.se.impl.orbutil.ObjectUtility;

/**
 * 适配类
 * 新接口适配旧接口
 */
public class NewInterfaceAdapter implements NewInterface{

    private OldInterface oldInterface;

    public NewInterfaceAdapter(OldInterface oldInterface) {
        this.oldInterface = oldInterface;
    }

    @Override
    public void newExecute() {
        System.out.println("新接口处理逻辑...");
        oldInterface.oldExecute();
    }
}
