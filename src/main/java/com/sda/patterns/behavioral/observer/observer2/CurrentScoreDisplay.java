package com.sda.patterns.behavioral.observer.observer2;

public class CurrentScoreDisplay implements Observer {

    private int currentScore;

    @Override
    public void update(int twoPointers, int threePointers) {
        this.currentScore = twoPointers * 2 + threePointers * 3;
        display();
    }

    private void display() {
        System.out.println("current score = " + currentScore);
    }

}
