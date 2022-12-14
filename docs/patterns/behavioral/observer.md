# intent
Is a publish / subscribe pattern which allows a number of observer objects to see an event

- [class diagram](../../../src/main/java/com/sda/patterns/behavioral/observer/observer.puml)
- [sequence diagram](../../../src/main/java/com/sda/patterns/behavioral/observer/observer-seq.puml)

- [class diagram 2](../../../src/main/java/com/sda/patterns/behavioral/observer/observer2.puml)
- [sequence diagram 2](../../../src/main/java/com/sda/patterns/behavioral/observer/observer-seq2.puml)

# participants
- subject - notifies the observers
- observer - subscribes to the subject
- client - uses the subject

# solution
- [classic](../../../src/main/java/com/sda/patterns/behavioral/observer/ex1/Client.java)
- [lambda](../../../src/main/java/com/sda/patterns/behavioral/observer/ex2/Client.java)
- [lambda](../../../src/main/java/com/sda/patterns/behavioral/observer/ex3/Client.java)

# jdk examples
- java.util.EventListener in Swing
- javax.servlet.http.HttpSessionBindingListener
- javax.servlet.http.HttpSessionAttributeListener
