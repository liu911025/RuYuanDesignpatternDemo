package com.designpattern.study.command.zhss;

public class CommandA implements Command {
    @Override
    public void execute() {
        System.out.println("Command --> A执行...");
    }
}
