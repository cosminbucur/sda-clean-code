package com.sda.patterns.behavioral.strategy.ex1;

public class DemoStrategy {

    public static void main(String[] args) {
        Context context = new Context();
        double result = context.executeStrategy(new Addition(), 1, 2);
        System.out.println(result);
    }
}
