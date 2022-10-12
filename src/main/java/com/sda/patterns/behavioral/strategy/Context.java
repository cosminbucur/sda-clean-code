package com.sda.patterns.behavioral.strategy;

public class Context {

    public double executeStrategy(Strategy strategy, int a, int b) {
        if (strategy instanceof Addition) {
            return strategy.performOperation(a, b);
        } else {
            throw new RuntimeException("unsupported operation");
        }
    }
}
