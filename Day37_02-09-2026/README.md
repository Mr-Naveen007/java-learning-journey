\# Java Method References



Method references (`::`) provide a shorter way to refer to an existing method or constructor instead of writing a lambda expression.



\## Functional Interface



A functional interface has exactly \*\*one abstract method\*\*.



```java

@FunctionalInterface

interface Calculator {

&#x20;   int calculate(int a, int b);

}

```



\## 1. Static Method Reference



\*\*Syntax:\*\*

```java

ClassName::staticMethod

```



```java

Calculator multiply = CalculatorUtil::multiply;



System.out.println(multiply.calculate(10, 20)); // 200

```



Equivalent lambda:



```java

Calculator multiply =

&#x20;       (a, b) -> CalculatorUtil.multiply(a, b);

```



\## 2. Instance Method Reference — Arbitrary Object



\*\*Syntax:\*\*

```java

ClassName::instanceMethod

```



```java

@FunctionalInterface

interface ObjectCalculator {

&#x20;   int calculate(CalculatorUtil calculator, int a, int b);

}



ObjectCalculator subtract = CalculatorUtil::subtract;



CalculatorUtil calculator = new CalculatorUtil();



System.out.println(

&#x20;       subtract.calculate(calculator, 20, 10)

); // 10

```



Equivalent lambda:



```java

ObjectCalculator subtract =

&#x20;       (calculator, a, b) -> calculator.subtract(a, b);

```



The object is supplied later.



\## 3. Instance Method Reference — Particular Object



\*\*Syntax:\*\*

```java

object::instanceMethod

```



```java

CalculatorUtil calculator = new CalculatorUtil();



Calculator divide = calculator::divide;



System.out.println(

&#x20;       divide.calculate(20, 5)

); // 4

```



Equivalent lambda:



```java

Calculator divide =

&#x20;       (a, b) -> calculator.divide(a, b);

```



The object is already selected.



\## 4. Constructor Reference



\*\*Syntax:\*\*

```java

ClassName::new

```



```java

@FunctionalInterface

interface CalculatorFactory {

&#x20;   CalculatorUtil create();

}



CalculatorFactory factory = CalculatorUtil::new;



CalculatorUtil calculator = factory.create();

```



Equivalent lambda:



```java

CalculatorFactory factory =

&#x20;       () -> new CalculatorUtil();

```



\## Quick Summary



| Type | Syntax | Meaning |

|---|---|---|

| Static method | `ClassName::method` | Static method |

| Instance method | `ClassName::method` | Object supplied later |

| Particular object | `object::method` | Object already selected |

| Constructor | `ClassName::new` | Creates an object |



\### Key Rule



The referenced method/constructor must match the \*\*functional interface's method signature\*\*.

