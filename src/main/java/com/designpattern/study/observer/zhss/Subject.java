package com.designpattern.study.observer.zhss;

import java.util.Observable;

/**
 * 参与者
 */
public class Subject extends Observable {

    private int status;

    public Subject(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
        setChanged();
        //推模式
        notifyObservers(this.status);
    }
}
