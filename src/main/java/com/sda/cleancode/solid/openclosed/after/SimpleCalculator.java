package com.sda.cleancode.solid.openclosed.after;

public class SimpleCalculator implements ICalculator {

    @Override
    public void calculate(IOperation operation) {
        if (operation == null) {
            throw new IllegalArgumentException("some message");
        }

        operation.performOperation();
    }
}
