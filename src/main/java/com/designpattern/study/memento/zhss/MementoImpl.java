package com.designpattern.study.memento.zhss;

public class MementoImpl implements Memento {

    private String state;

    public MementoImpl(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
