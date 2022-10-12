package com.sda.refactoring.features.ex1.before;

public class Disco {

    private Dancer dancer;

    public void party() {
        dancer.rock();

        Developer developer = new Developer();
        developer.roll();
    }
}


