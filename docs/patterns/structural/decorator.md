# intent
Allows for an object’s behavior to be extended dynamically at run time

- more efficient than subclassing

# participants
- component - performs some operation
- decorator - adds functionality to the component
- client - wraps the component in the decorator

# solution
- [classic](../../../src/main/java/com/sda/patterns/structural/decorator/ex1/Client.java)
- [lambda](../../../src/main/java/com/sda/patterns/structural/decorator/ex2/Client.java)
- [challenge](../../../src/main/java/com/sda/patterns/structural/decorator/challenge/Client.java)

# jdk examples
- java.io.BufferedReader
- java.io.FileReader
