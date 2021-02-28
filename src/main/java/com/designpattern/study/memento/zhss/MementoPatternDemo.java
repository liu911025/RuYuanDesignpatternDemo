package com.designpattern.study.memento.zhss;

public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();

        // 准备好了中间数据
        originator.prepare();
        // 将中间数据保存到备忘录中去
        Memento memento = originator.createMemento();
        // 将备忘录保存到备忘录管理器中去
        Caretaker caretaker = new Caretaker();
        caretaker.saveMemento(memento);
        // 基于中间数据执行了A方法，但是此时中间数据已经改变了
        originator.executeA();
        // 从备忘录管理器中获取备忘录
        memento = caretaker.retrieveMemento();
        // 将备忘录中保存好的中间数据重新设置到原发器中去，就将中间数据恢复成了之前备忘的状态
        originator.setMemento(memento);
        // 接着再次执行方法B
        originator.executeB();
    }

}
