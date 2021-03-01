package com.designpattern.study.strategy.zhss;

public class Context {

    private static Strategy strategy;

    public Context() {}

    public static void execute(int strategyType) {
        if (1 == strategyType) {
            strategy = new StrategyA();
        }else if (2 == strategyType) {
            strategy = new StrategyB();
        }else {
            strategy = new StrategyC();
        }
        strategy.execute();
    }
}
