package com.designpattern.study.command.zhss;

public class CommandB implements Command {
    @Override
    public void execute() {
        System.out.println("Command --> B执行...");
    }
}
