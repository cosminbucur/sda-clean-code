package com.sda.patterns.behavioral.observer.ex2;

public class Car {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
