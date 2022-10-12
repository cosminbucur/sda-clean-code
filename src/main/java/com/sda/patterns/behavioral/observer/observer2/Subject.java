package com.sda.patterns.behavioral.observer.observer2;

public interface Subject {

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifySubscribers();
}
