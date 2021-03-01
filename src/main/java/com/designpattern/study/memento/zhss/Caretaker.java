package com.designpattern.study.memento.zhss;

public class Caretaker {

    private Memento memento;

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento retrieveMemento() {
        return this.memento;
    }

}
