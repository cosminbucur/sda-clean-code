package com.sda.patterns.behavioral.strategy;

public class Addition implements Strategy {
    @Override
    public double performOperation(int a, int b) {
        return a + b;
    }
}
