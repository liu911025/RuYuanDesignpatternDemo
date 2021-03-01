package com.designpattern.study.chain.zhss.pattern;

public abstract class Handler {

    protected Handler handler;

    public Handler(Handler handler) {
        this.handler = handler;
    }

    public abstract void execute();
}
