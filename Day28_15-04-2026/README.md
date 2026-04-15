\# 🧩 Java OOP – Shapes Area Calculator



\## 📌 Overview



This project demonstrates core \*\*Object-Oriented Programming (OOP)\*\* concepts in Java by building a system that calculates the area of different shapes.



The goal is to write \*\*clean, scalable, and maintainable code\*\* using proper design principles.



\---



\## 🚀 Features



\* Calculate area of multiple shapes:



&#x20; \* Circle

&#x20; \* Rectangle

&#x20; \* Triangle

&#x20; \* Square

\* Uses \*\*polymorphism\*\* to eliminate conditional logic

\* Clean and modular \*\*multi-file structure\*\*

\* Input validation for safe object creation

\* Formatted output using `toString()`



\---



\## 🧠 Concepts Covered



\### ✅ Abstraction



Defines a common contract for all shapes.



```java

public abstract class Shape {

&#x20;   public abstract double area();

}

```



\---



\### ✅ Inheritance



Each shape extends the base `Shape` class.



```java

class Circle extends Shape

```



\---



\### ✅ Polymorphism



Same reference, different behavior at runtime.



```java

Shape\[] shapes = { new Circle(5), new Rectangle(5, 6) };

```



\---



\### ✅ Method Overriding



Each shape provides its own implementation of `area()`.



```java

@Override

public double area() {

&#x20;   return Math.PI \* radius \* radius;

}

```



\---



\### ✅ Encapsulation \& Immutability



```java

private final double radius;

```



\* Data is protected

\* Object state cannot change after creation



\---



\### ✅ Input Validation



```java

if (radius <= 0) {

&#x20;   throw new IllegalArgumentException("Radius must be positive");

}

```



\---



\### ✅ Clean Output Design



```java

@Override

public String toString() {

&#x20;   return String.format("\[%s] area = %.2f", name(), area());

}

```



\---



\## 📁 Project Structure



```

.

├── Shape.java

├── Circle.java

├── Rectangle.java

├── Triangle.java

├── Square.java

└── Main.java

```



\---



\## ▶️ How to Run



\### 1. Compile



```bash

javac \*.java

```



\### 2. Run



```bash

java Main

```



\---



\## 🖥️ Sample Output



```

\[Circle] area = 78.54

\[Rectangle] area = 30.00

\[Triangle] area = 15.00

\[Square] area = 100.00

```



\---



\## 🎯 Key Takeaways



\* Prefer \*\*polymorphism over if-else\*\*

\* Keep classes \*\*single-purpose\*\*

\* Write \*\*immutable and safe objects\*\*

\* Follow \*\*clean project structure\*\*



\---



\## 🚀 Next Steps



\* Learn \*\*Collections (List, Map)\*\*

\* Move to \*\*Spring Boot\*\*

\* Build real backend APIs



\---



\## 👨‍💻 Author



Naveen

Java Backend Developer (in progress 🚀)



