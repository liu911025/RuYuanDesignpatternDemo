package com.designpattern.study.state.zhss;

public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new NewState());
        context.execute(1);
        context.execute(2);
        context.execute(3);


    }

}
