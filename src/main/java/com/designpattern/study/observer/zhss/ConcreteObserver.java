package com.designpattern.study.observer.zhss;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("状态改变为:" + (Integer) arg);
    }
}
