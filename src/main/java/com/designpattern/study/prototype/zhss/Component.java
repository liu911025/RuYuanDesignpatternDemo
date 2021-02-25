package com.designpattern.study.prototype.zhss;

/**
 * 组件
 */
public class Component {

    private String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Component(getName());
    }
}
