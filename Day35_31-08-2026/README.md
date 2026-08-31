# Day 35 — Functional Interfaces

## 1. Functional Interface

A functional interface is an interface that contains **exactly one abstract method**.

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
```

A functional interface can be implemented using a **lambda expression**.

---

## 2. `@FunctionalInterface`

`@FunctionalInterface` is an annotation that tells the compiler that the interface is intended to have exactly one abstract method.

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
```

If another abstract method is added, the compiler reports an error.

The annotation does not make an interface functional; it helps the compiler verify the rule.

---

## 3. Abstract Method

An abstract method is a method that has a declaration but **no implementation/body**.

```java
int calculate(int a, int b);
```

It defines **what must be done**, but not **how it is done**.

---

## 4. Default Method

A `default` method is a method in an interface that already has an implementation.

```java
default void message() {
    System.out.println("Hello");
}
```

A class implementing the interface can use the default implementation or override it.

Default methods do **not** count as abstract methods.

---

## 5. Static Method

A `static` method belongs to the interface itself rather than to objects implementing the interface.

```java
static void info() {
    System.out.println("Calculator interface");
}
```

It is called using the interface name:

```java
Calculator.info();
```

Static methods do **not** count as abstract methods and cannot be overridden as instance methods.

---

## 6. Abstract vs Default vs Static

| Method   | Implementation | Belongs to          | Abstract? |
| -------- | -------------- | ------------------- | --------- |
| Abstract | ❌ No           | Implementing class  | ✅         |
| Default  | ✅ Yes          | Implementing object | ❌         |
| Static   | ✅ Yes          | Interface           | ❌         |

---

## 7. Method Overriding

Method overriding occurs when a child class provides its own implementation of a method inherited from a parent class or interface.

```java
class Animal {

    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Woof");
    }
}
```

`Dog` overrides the `sound()` method inherited from `Animal`.

### Overriding vs Overloading

**Overriding:**

```java
Parent:
void sound()

Child:
void sound()
```

Same method signature, child provides its own implementation.

**Overloading:**

```java
calculate(int, int)
calculate(int, int, int)
```

Same method name, different parameters.

---

## 8. `@Override`

`@Override` tells the compiler that a method is intended to override a method from a parent class or interface.

```java
@Override
public void sound() {
    System.out.println("Woof");
}
```

It helps catch mistakes such as incorrect method names or signatures.

---

## 9. Built-in Functional Interfaces

Java provides commonly used functional interfaces:

### Consumer

Takes an input and returns nothing.

```java
Consumer<String> printer =
        name -> System.out.println(name);
```

### Supplier

Takes no input and produces a result.

```java
Supplier<String> supplier =
        () -> "Hello";
```

### Function

Takes an input and produces an output.

```java
Function<String, Integer> length =
        text -> text.length();
```

### Predicate

Takes an input and returns `true` or `false`.

```java
Predicate<Integer> isEven =
        number -> number % 2 == 0;
```

---

# Complete Example

```java
@FunctionalInterface
interface Calculator {

    // Abstract method
    int calculate(int a, int b);

    // Default method
    default void message() {
        System.out.println("Using calculator");
    }

    // Static method
    static void info() {
        System.out.println("Calculator interface");
    }
}

public class Main {

    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;

        Calculator multiply = (a, b) -> a * b;

        System.out.println(add.calculate(10, 5));
        System.out.println(multiply.calculate(10, 5));

        add.message();

        Calculator.info();
    }
}
```

Output:

```text
15
50
Using calculator
Calculator interface
```

## Core Mental Model

```text
Interface
    ↓
Exactly one abstract method
    ↓
Functional Interface
    ↓
Lambda can implement it
    ↓
Behavior can be passed around
```

### Key Rule

**Abstract → no implementation**

**Default → has implementation, available to implementing objects**

**Static → has implementation, belongs to the interface**

**Overriding → child provides its own version of a parent method**

**Lambda → can implement a functional interface**
