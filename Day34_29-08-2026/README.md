\# 🚀 Day 34 — Java Generics



\## 🎯 Today's Goal



Understand Java Generics progressively, from basic generic classes and methods to bounded types and wildcards, and see how these concepts apply to backend development.



\---



\## 1. Why Do Generics Exist?



Generics provide:



\* \*\*Type safety\*\*

\* \*\*Reusable code\*\*

\* \*\*Compile-time error checking\*\*



Example:



```java

List<String> skills = new ArrayList<>();



skills.add("Java");

skills.add("Spring Boot");

// skills.add(100); // ❌ Compile-time error

```



Without generics, a collection could contain unrelated types:



```java

List skills = new ArrayList();



skills.add("Java");

skills.add(100);

skills.add(true);

```



\### Key idea



> \*\*Generics = type safety + reusable code\*\*



\---



\# 2. Generic Classes — `<T>`



`T` is a \*\*type parameter\*\*.



```java

public class Box<T> {



&#x20;   private T value;



&#x20;   public void setValue(T value) {

&#x20;       this.value = value;

&#x20;   }



&#x20;   public T getValue() {

&#x20;       return value;

&#x20;   }

}

```



The same class can work with different types:



```java

Box<String> name = new Box<>();

name.setValue("Naveen");



Box<Integer> age = new Box<>();

age.setValue(31);

```



Conceptually:



```text

Box<String>  → T = String

Box<Integer> → T = Integer

```



\### Core idea



> Write the structure once and specify the type when using it.



\---



\# 3. Generic Methods



Generics can also be used with methods.



```java

public static <T> void printValue(T value) {

&#x20;   System.out.println(value);

}

```



Usage:



```java

printValue("Java");

printValue(100);

printValue(true);

```



Java determines the appropriate type:



```text

"Java" → T = String

100    → T = Integer

true   → T = Boolean

```



A generic method can also connect its input and return types:



```java

public static <T> T getValue(T value) {

&#x20;   return value;

}

```



\---



\# 4. Bounded Type Parameters



An unbounded generic accepts any type:



```java

public static <T> void printValue(T value) {

&#x20;   System.out.println(value);

}

```



Sometimes we want to restrict what `T` can represent.



For example:



```java

public static <T extends Number> void printNumber(T value) {

&#x20;   System.out.println(value);

}

```



Valid:



```java

printNumber(100);     // ✅ Integer

printNumber(10.5);    // ✅ Double

printNumber(100L);    // ✅ Long

```



Invalid:



```java

printNumber("Java");  // ❌ String is not a Number

```



The hierarchy is:



```text

Number

├── Integer

├── Double

├── Long

├── Float

└── ...

```



\### Important



`<T extends Number>` does \*\*not\*\* necessarily mean we are creating inheritance.



It means:



> `T` is restricted to `Number` or a subtype of `Number`.



\---



\# 5. `T` vs `?`



These look similar but serve different purposes.



\## `T`



`T` is a \*\*named type parameter\*\*.



```java

public static <T> T getValue(T value) {

&#x20;   return value;

}

```



Here `T` represents one specific type for a method invocation.



For example:



```java

getValue("Naveen");

```



means conceptually:



```text

T = String

```



`T` is useful when we need to refer to the type again.



\---



\## `?`



`?` represents an \*\*unknown type\*\*.



```java

public static void printList(List<?> list) {

&#x20;   System.out.println(list);

}

```



This can accept:



```java

List<String>

List<Integer>

List<User>

```



The method is saying:



> "There is some type here, but I don't need to know what it is."



\### Simple mental model



```text

T → "Tell me the type. I'll give it a name."



? → "There is a type here, but I don't care what it is."

```



\---



\# 6. Unbounded Wildcard — `<?>`



```java

List<?>

```



means:



> A `List` containing some unknown type.



Example:



```java

public static void printList(List<?> list) {

&#x20;   System.out.println(list);

}

```



It can accept lists of different element types.



\---



\# 7. Upper-Bounded Wildcards — `? extends`



```java

List<? extends Number>

```



means:



> A list of some unknown type that is `Number` or a subtype of `Number`.



Valid:



```java

List<Integer> integers = List.of(10, 20);

List<Double> doubles = List.of(10.5, 20.5);

List<Long> longs = List.of(10L, 20L);

```



All can be passed to:



```java

public static void printNumbers(List<? extends Number> numbers) {



&#x20;   for (Number number : numbers) {

&#x20;       System.out.println(number);

&#x20;   }

}

```



But:



```java

List<String> names = List.of("Naveen", "Rahul");



printNumbers(names); // ❌

```



because `String` is not a subtype of `Number`.



\### Why is it useful?



It is mainly useful for \*\*reading\*\*.



```java

Number number = list.get(0); // ✅

```



But adding is unsafe:



```java

list.add(10); // ❌

```



Java does not know the exact subtype.



The actual list could be:



```java

List<Double>

```



and adding an `Integer` would be unsafe.



\### Mental model



```text

? extends Number



&#x20;       Number

&#x20;      /      \\

&#x20; Integer    Double



READ  ✅

ADD   ❌

```



\---



\# 8. Lower-Bounded Wildcards — `? super`



```java

List<? super Integer>

```



means:



> A list whose type is `Integer` or one of `Integer`'s supertypes.



Hierarchy:



```text

Object

&#x20;  ↑

Number

&#x20;  ↑

Integer

```



Therefore these are valid:



```java

List<Integer>

List<Number>

List<Object>

```



But:



```java

List<Double>  // ❌

List<String>  // ❌

```



because `Double` and `String` are not supertypes of `Integer`.



\---



\## Example



```java

public static void addIntegers(List<? super Integer> list) {



&#x20;   list.add(10);

&#x20;   list.add(20);

&#x20;   list.add(30);



&#x20;   System.out.println(list);

}

```



All of these work:



```java

List<Integer> integers = new ArrayList<>();

List<Number> numbers = new ArrayList<>();

List<Object> objects = new ArrayList<>();



addIntegers(integers);

addIntegers(numbers);

addIntegers(objects);

```



Why?



Because an `Integer` can safely be stored in:



```text

List<Integer>

List<Number>

List<Object>

```



\---



\# 9. Why `? super` Cannot Be Read as `Integer`



Consider:



```java

List<? super Integer> list = new ArrayList<Number>();

```



The actual list is:



```java

List<Number>

```



We don't know whether an element retrieved from it is specifically an `Integer`.



Therefore:



```java

Integer x = list.get(0); // ❌

```



But:



```java

Object x = list.get(0); // ✅

```



because every Java object is an `Object`.



\---



\# 10. `? extends` vs `? super`



\## Upper Bound



```java

? extends Number

```



Means:



> `Number` or one of its subtypes.



```text

Number

&#x20;↓

Integer / Double / Long

```



Mainly:



```text

READ ✅

ADD  ❌

```



\---



\## Lower Bound



```java

? super Integer

```



Means:



> `Integer` or one of its supertypes.



```text

Object

&#x20;↑

Number

&#x20;↑

Integer

```



Mainly:



```text

ADD/WRITE ✅

READ as Integer ❌

```



\---



\# 11. PECS



The famous Java rule:



> \*\*PECS = Producer Extends, Consumer Super\*\*



```text

Producer → ? extends

Consumer → ? super

```



In practice:



```text

? extends → mainly READ

? super   → mainly ADD/WRITE

```



The behavior is more important than simply memorizing the acronym.



\---



\# 12. Understanding Supertypes and Subtypes



A \*\*supertype\*\* is a more general/parent type.



A \*\*subtype\*\* is a more specific/child type.



Example:



```text

Object

&#x20; ↑

Number

&#x20; ↑

Integer

```



Therefore:



```text

Object  = supertype

Number  = supertype of Integer

Integer = subtype of Number

```



This works:



```java

Number n = Integer.valueOf(10);

```



because:



> An `Integer` is a `Number`.



But the reverse is not automatically safe:



```java

Integer i = Number.valueOf(10); // ❌

```



because a general `Number` isn't necessarily an `Integer`.



\---



\# 13. Important `? super` Detail



Consider:



```java

List<? super Integer>

```



We travel \*\*up from Integer\*\*:



```text

Integer

&#x20;  ↑

Number

&#x20;  ↑

Object

```



So:



```text

Integer ✅

Number  ✅

Object  ✅

```



But we do \*\*not\*\* travel sideways:



```text

Integer → Double ❌

Integer → Float  ❌

```



Even though both `Integer` and `Double` are subtypes of `Number`.



The same rule applies to:



```java

List<? super Double>

```



which allows:



```text

Double

Number

Object

```



but not:



```text

Integer

```



\### Key distinction



> `? super X` means \*\*X + its supertypes\*\*, not X + every type sharing a common parent.



\---



\# 14. Backend-Style Generic Usage



Generics become extremely important in backend development.



Common examples include:



```java

List<User>

```



```java

Optional<User>

```



```java

ResponseEntity<User>

```



```java

Map<String, User>

```



Spring Data:



```java

public interface UserRepository

&#x20;       extends JpaRepository<User, Long> {

}

```



Here:



```text

JpaRepository<User, Long>

&#x20;             │       │

&#x20;             │       └── ID type

&#x20;             └────────── Entity type

```



Generics are therefore fundamental to understanding the APIs used in Spring Boot.



\---



\# 15. Backend-Style Example



A method can accept a list of `User` or a subtype of `User`:



```java

public static void printUsers(List<? extends User> users) {



&#x20;   for (User user : users) {

&#x20;       System.out.println(user.getName());

&#x20;   }

}

```



Usage:



```java

List<User> users = new ArrayList<>();



User user1 = new User();

user1.setName("Naveen");



User user2 = new User();

user2.setName("Rahul");



users.add(user1);

users.add(user2);



printUsers(users);

```



Output:



```text

Naveen

Rahul

```



This is the same `? extends` concept used with `Number`, now applied to a backend-style model.



\---



\# 🧠 Final Mental Model



```text

GENERIC CLASS

<T>

&#x20;   ↓

Named type parameter



GENERIC METHOD

<T>

&#x20;   ↓

Method can work with different types



BOUNDED TYPE

<T extends Number>

&#x20;   ↓

Restricts T to Number or its subtypes



UNBOUNDED WILDCARD

<?>

&#x20;   ↓

Unknown type



UPPER-BOUNDED WILDCARD

<? extends Number>

&#x20;   ↓

Number or its subtypes

&#x20;   ↓

MAINLY READ



LOWER-BOUNDED WILDCARD

<? super Integer>

&#x20;   ↓

Integer or its supertypes

&#x20;   ↓

MAINLY ADD/WRITE

```



\---



\# 🔥 One Sentence to Remember



> \*\*Generics let us write a class or method once while allowing it to work safely with different data types.\*\*



\---



\# ✅ Day 34 — COMPLETE



Completed:



\* ✅ Generic Classes

\* ✅ Generic Methods

\* ✅ Bounded Type Parameters

\* ✅ Unbounded Wildcards

\* ✅ Upper-Bounded Wildcards

\* ✅ Lower-Bounded Wildcards

\* ✅ Backend-style Generic Usage



The class was completed by coding and testing the concepts rather than only reading the theory.



\---



\# 🔜 Next



\## Day 35 — Functional Interfaces



No jumping ahead. One concept at a time. 🚀





