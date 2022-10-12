package com.sda.refactoring.features.ex2.before;

public class Developer {

    private int salary;

    public void writeCode() {
        String message = "salary " + getSalary();
    }

    public int getSalary() {
        return salary;
    }
}
