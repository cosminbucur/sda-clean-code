# intent
a mechanism to get fully initialized instances

- presented by joshua bloch
- factory methods have meaningful names (unlike constructors)
- a static factory method can return same type, subtype, primitives (unlike constructors)
- static factory methods can extract logic from constructors

# solution
- [classic before](../../../src/main/java/com/sda/patterns/creational/factorystaticmethod/ex1/before/Client.java)
- [classic after](../../../src/main/java/com/sda/patterns/creational/factorystaticmethod/ex1/after/Client.java)
- [inside class](../../../src/main/java/com/sda/patterns/creational/factorystaticmethod/ex2/Client.java)

# jdk examples
- java.lang.String.valueOf()
- java.util.Optional.of()
- java.util.Collections.*
