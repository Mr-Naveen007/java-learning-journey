# Day 36 — Lambda Expressions

## 🎯 Objective

Understand Lambda Expressions in Java and how they provide a concise way to implement **functional interfaces**.

---

# 1. What is a Lambda Expression?

A lambda expression is a concise way to provide an implementation for the **single abstract method of a functional interface**.

Example:

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
```

Lambda implementation:

```java
Calculator add = (a, b) -> a + b;
```

The lambda:

```java
(a, b) -> a + b
```

provides the implementation of:

```java
int calculate(int a, int b);
```

---

# 2. Lambda Syntax

Basic syntax:

```java
(parameters) -> expression
```

Or:

```java
(parameters) -> {
    statements;
}
```

Example:

```java
(a, b) -> a + b
```

Breakdown:

```text
(a, b)     ->     a + b
   ↓        ↓        ↓
parameters  lambda   body
           operator
```

---

# 3. Lambda With No Parameters

If the functional interface method has no parameters:

```java
@FunctionalInterface
interface Greeting {
    void greet();
}
```

Lambda:

```java
Greeting greeting =
        () -> System.out.println("Hello");
```

Syntax:

```java
() -> System.out.println("Hello");
```

---

# 4. Lambda With One Parameter

```java
@FunctionalInterface
interface Printer {
    void print(String message);
}
```

Lambda:

```java
Printer printer =
        message -> System.out.println(message);
```

Parentheses are optional for a single parameter.

Both are valid:

```java
message -> System.out.println(message);
```

```java
(message) -> System.out.println(message);
```

---

# 5. Lambda With Multiple Parameters

For two or more parameters, parentheses are required.

```java
Calculator add =
        (a, b) -> a + b;
```

---

# 6. Parameter Types

Java can infer parameter types from the functional interface.

Instead of:

```java
Calculator add =
        (int a, int b) -> a + b;
```

we normally write:

```java
Calculator add =
        (a, b) -> a + b;
```

The compiler knows that `a` and `b` are `int` because:

```java
int calculate(int a, int b);
```

defines the method signature.

### Type inference

```text
Functional Interface
        ↓
Abstract method signature
        ↓
Java knows parameter types
        ↓
Lambda can omit them
```

You can explicitly specify all parameter types:

```java
(int a, int b) -> a + b
```

But you cannot mix styles:

```java
(int a, b) -> a + b; // ❌
```

---

# 7. Expression Lambda

If the lambda contains a single expression:

```java
Calculator add =
        (a, b) -> a + b;
```

No braces or `return` are required.

The expression result is automatically returned.

---

# 8. Block Lambda

When multiple statements are required, use `{}`.

```java
Calculator add = (a, b) -> {
    System.out.println("Adding numbers");

    int result = a + b;

    return result;
};
```

When using a block body with a return value, an explicit `return` is required.

---

# 9. Expression vs Block Lambda

### Expression

```java
(a, b) -> a + b
```

### Block

```java
(a, b) -> {
    int result = a + b;
    return result;
}
```

Both perform the same operation.

---

# 10. Effectively Final Variables

A lambda can access a local variable if that variable is **final or effectively final**.

Example:

```java
int number = 10;

Calculator calculator =
        (a, b) -> a + b + number;
```

This is valid because `number` is never changed.

You can also explicitly declare it as:

```java
final int number = 10;
```

But `final` is not required.

### Invalid example

```java
int number = 10;

Calculator calculator =
        (a, b) -> a + b + number;

number = 20; // ❌
```

The variable is no longer effectively final.

### Rule

```text
Local variable used inside lambda
            ↓
      final OR
   effectively final
```

---

# 11. Passing Lambda as a Method Argument

Lambdas can be passed directly into methods.

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
```

Method:

```java
static int execute(
        int a,
        int b,
        Calculator calculator) {

    return calculator.calculate(a, b);
}
```

Now we can pass different behavior:

```java
int result1 =
        execute(10, 5, (a, b) -> a + b);

int result2 =
        execute(10, 5, (a, b) -> a * b);

int result3 =
        execute(10, 5, (a, b) -> a - b);
```

Output:

```text
15
50
5
```

The same `execute()` method can perform different operations.

---

# 12. Behavior Can Be Passed as a Value

This is one of the most important ideas behind lambdas.

Normally we pass data:

```java
execute(10, 5);
```

With a functional interface, we can also pass behavior:

```java
execute(10, 5, (a, b) -> a + b);
```

Conceptually:

```text
Data
 ↓
10, 5

Behavior
 ↓
(a, b) -> a + b
```

Both can be passed into a method.

---

# 13. Target Type

A lambda needs a target functional interface type.

This is valid:

```java
Calculator calculator =
        (a, b) -> a + b;
```

Java knows:

```text
calculator
    ↓
Calculator
    ↓
calculate(int, int)
    ↓
(a, b) -> a + b
```

The functional interface provides the **target type** that tells Java what the lambda is supposed to represent.

---

# 14. Lambda Is Not a Standalone Type

This is invalid:

```java
var calculator =
        (a, b) -> a + b; // ❌
```

Java needs a functional interface target.

Valid:

```java
Calculator calculator =
        (a, b) -> a + b;
```

---

# 15. Anonymous Class vs Lambda

### Anonymous class

```java
Calculator add = new Calculator() {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
};
```

### Lambda

```java
Calculator add =
        (a, b) -> a + b;
```

Lambda removes the unnecessary boilerplate.

---

# 16. Complete Example

```java
package com.naveen.backend;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class Main {

    static int execute(
            int a,
            int b,
            Calculator calculator) {

        return calculator.calculate(a, b);
    }

    public static void main(String[] args) {

        Calculator add =
                (a, b) -> a + b;

        Calculator multiply =
                (a, b) -> a * b;

        int result1 =
                execute(10, 5, add);

        int result2 =
                execute(10, 5, multiply);

        int result3 =
                execute(10, 5,
                        (a, b) -> a - b);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
```

### Output

```text
15
50
5
```

---

# 🧠 Core Mental Model

```text
Functional Interface
        ↓
Exactly one abstract method
        ↓
Lambda provides its implementation
        ↓
Behavior can be stored
        ↓
Behavior can be passed to methods
        ↓
Less boilerplate
```

---

# 🎯 Lambda Syntax Cheat Sheet

```java
() -> expression

x -> expression

(x) -> expression

(x, y) -> expression

(x, y) -> {
    statements;
    return value;
}
```

---

# 🔑 Key Rules to Remember

1. A lambda implements a functional interface's single abstract method.
2. `->` separates parameters from the lambda body.
3. Zero parameters require `()`.
4. One parameter can omit parentheses.
5. Multiple parameters require parentheses.
6. Parameter types can usually be inferred.
7. Expression lambdas don't need `return`.
8. Block lambdas need `return` when returning a value.
9. Captured local variables must be final or effectively final.
10. A lambda needs a target functional interface type.
11. Lambdas allow behavior to be passed around.
12. Lambdas dramatically reduce anonymous-class boilerplate.

---

# 🏁 Day 36 Completion Criteria

Before marking Day 36 complete, be able to write from memory:

```java
Calculator add =
        (a, b) -> a + b;
```

And explain exactly what happens when:

```java
execute(10, 5, add);
```

is called.

You should also be comfortable writing:

* Zero-parameter lambdas
* One-parameter lambdas
* Multi-parameter lambdas
* Expression lambdas
* Block lambdas
* Lambdas with return values
* Lambdas passed as method arguments
* Lambdas using effectively final variables