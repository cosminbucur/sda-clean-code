package com.sda.patterns.behavioral.observer.observer2;

import java.util.ArrayList;
import java.util.List;

public class NBATopic implements Subject {

    private int twoPointers;
    private int threePointers;

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        observers.forEach(observer -> observer.update(twoPointers, threePointers));
    }

    public int getLatestTwoPointers() {
        return 5;
    }

    public int getLatestThreePointers() {
        return 3;
    }

    // update displays when data changes
    public void dataChanged() {
        twoPointers = getLatestTwoPointers();
        threePointers = getLatestThreePointers();

        notifySubscribers();
    }
}
