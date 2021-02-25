package com.designpattern.study.facade.zhss.pattern;


public class FacadePatternDemo {

    public static void main(String[] args) {
        SystemFacade facade = new SystemFacade();
        facade.execute();
    }
}
