package com.designpattern.study.proxy.zhss;


public class ProxyPatternDemo {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new ConcreteSubject());
        proxy.request();
    }

}
