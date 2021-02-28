package com.designpattern.study.memento.zhss;

public class Originator {
    private String state;

    public void prepare() {
        this.state = "中间数据";
    }

    public void executeA() {
        System.out.println("基于中间数据【" + state +"】执行了A方法的逻辑");
        // 将state所代表的中间数据做出了修改
        state += "，A方法的结果数据";
    }

    public void executeB() {
        System.out.println("基于中间数据【" + state +"】执行了B方法的逻辑");
        state += "，B方法的结果数据";
    }

    public Memento createMemento() {
        return new MementoImpl(state);
    }

    public void setMemento(Memento memento) {
        MementoImpl mementoImpl = (MementoImpl)memento;
        this.state = mementoImpl.getState();
    }
}
