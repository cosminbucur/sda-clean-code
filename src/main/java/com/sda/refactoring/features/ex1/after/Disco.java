package com.sda.refactoring.features.ex1.after;

public class Disco {

    private Dancer dancer;
    private Developer developer;

    public void party() {
        dancer.rock();
        dancer.roll(developer);
    }
}


