package com.sda.patterns.behavioral.observer.observer2;

public class Client {

    public static void main(String[] args) {
        AverageScoreDisplay observer1 = new AverageScoreDisplay();
        CurrentScoreDisplay observer2 = new CurrentScoreDisplay();

        NBATopic topic = new NBATopic();
        topic.subscribe(observer1);
        topic.subscribe(observer2);

        topic.dataChanged();

        topic.unsubscribe(observer1);

        topic.dataChanged();
    }
}
