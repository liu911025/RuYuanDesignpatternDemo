package com.designpattern.study.chain.zhss.pattern;

public class Handler2 extends Handler {

    public Handler2(Handler handler) {
        super(handler);
    }

    @Override
    public void execute() {
        System.out.println("执行功能二");
        if (null != handler) {
            handler.execute();
        }
    }
}
