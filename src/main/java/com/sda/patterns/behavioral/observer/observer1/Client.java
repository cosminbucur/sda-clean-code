package com.sda.patterns.behavioral.observer.observer1;

public class Client {

    public static void main(String[] args) {
        Subject subject = new Topic();

        Observer observer1 = new TopicSubscriber("ana");
        Observer observer2 = new TopicSubscriber("alex");
        Observer observer3 = new TopicSubscriber("paul");

        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);

        Topic topic = new Topic();
        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

        observer1.update();

        topic.postMessage("hi");
    }
}
