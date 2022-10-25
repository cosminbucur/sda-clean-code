# intent
Creates objects which encapsulate actions and parameters

# participants
- receiver – performs the actual work
- command – encapsulates all the information required to call the receiver
- invoker – controls the sequencing and execution of one or more commands
- client – creates concrete command instances

# solution
- [classic](../../../src/main/java/com/sda/patterns/behavioral/command/ex1/Client.java)
- [lambda](../../../src/main/java/com/sda/patterns/behavioral/command/challenge/Client.java)

# jdk examples
- java.lang.Runnable
- javax.swing.Action
