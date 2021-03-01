package com.designpattern.study.chain.zhss.pattern;

public class Handler3 extends Handler {

    public Handler3(Handler handler) {
        super(handler);
    }

    @Override
    public void execute() {
        System.out.println("执行功能三");
        if (null != handler) {
            handler.execute();
        }
    }
}
