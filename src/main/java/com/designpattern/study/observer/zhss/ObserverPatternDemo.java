package com.designpattern.study.observer.zhss;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        ConcreteObserver observer = new ConcreteObserver();
        Subject subject = new Subject(0);
        subject.addObserver(observer);

        subject.setStatus(1);
        subject.setStatus(2);

    }

}
