# intent
Ensures only one instance of an object is created

# participants
- singleton - provides a single instance of the object
- client - creates a singleton

# solution
- [eager initialized](../../../src/main/java/com/sda/patterns/creational/singleton/ex1/Client.java)
- [static block](../../../src/main/java/com/sda/patterns/creational/singleton/ex2/Client.java)
- [lazy initialized](../../../src/main/java/com/sda/patterns/creational/singleton/ex3/Client.java)
- [thread safe](../../../src/main/java/com/sda/patterns/creational/singleton/ex4/Client.java)
- [bill pugh](../../../src/main/java/com/sda/patterns/creational/singleton/ex5/Client.java)

# jdk examples
- java.lang.Runtime#getRuntime()
- java.awt.Desktop#getDesktop()

# spring
- singleton beans
