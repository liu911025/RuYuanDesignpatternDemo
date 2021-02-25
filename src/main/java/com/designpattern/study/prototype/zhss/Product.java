package com.designpattern.study.prototype.zhss;

public class Product {

    private String name;

    private Component component;

    public Product(String name, Component component) {
        this.name = name;
        this.component = component;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", component=" + component +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // 浅拷贝 Component与product同一个
        //return new Product(getName(), getComponent());
        return new Product(getName(), (Component) getComponent().clone());
    }
}
