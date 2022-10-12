package com.sda.patterns.behavioral.observer.observer2;

public class AverageScoreDisplay implements Observer {

    private int predictedScore;

    @Override
    public void update(int twoPointers, int threePointers) {
        this.predictedScore = threePointers * 10;
        display();
    }

    private void display() {
        System.out.println("predictedScore = " + predictedScore);
    }

}
