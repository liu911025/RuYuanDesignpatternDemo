package com.designpattern.study.command.zhss;

public class CommandPatternDemo {

    public static void main(String[] args) {
        Command a = new CommandA();
        Command b = new CommandB();
        Invoker invoker = new Invoker();
        invoker.setCommand(a);
        invoker.execute();

        invoker.setCommand(b);
        invoker.execute();
    }

}
