package com.designpattern.study.chain.zhss.pattern;

public class Handler1 extends Handler {

    public Handler1(Handler handler) {
        super(handler);
    }

    @Override
    public void execute() {
        System.out.println("执行功能一");
        if (null != handler) {
            handler.execute();
        }
    }
}
