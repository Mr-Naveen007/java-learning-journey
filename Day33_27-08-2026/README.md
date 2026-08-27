Absolutely. Here's a clean GitHub-ready README for **Day 33**:

# 🔓 DAY 33 — NESTED JSON MAPPING & COLLECTIONS

## 📚 Topic

**Nested JSON Mapping & Collections using Jackson**

## 🎯 Objectives

By the end of this class, I learned how to:

* Map nested JSON objects to Java classes
* Map JSON arrays to `List<T>`
* Use multiple POJOs together
* Deserialize hierarchical JSON responses
* Use Jackson's `ObjectMapper`
* Design cleaner Java models for API responses

---

## 🧠 Concepts Learned

### 1. Nested JSON → Nested POJO

JSON can contain objects inside other objects.

Example:

```json
{
  "name": "Naveen",
  "age": 31,
  "address": {
    "city": "Ballari",
    "state": "Karnataka"
  }
}
```

The nested `address` object is represented using a separate Java class:

```java
private Address address;
```

---

### 2. JSON Array → `List<T>`

A JSON array containing strings can be mapped to:

```java
private List<String> skills;
```

Example:

```json
"skills": [
  "Java",
  "Spring Boot",
  "MySQL"
]
```

A JSON array containing objects can be mapped to:

```java
private List<Employee> employees;
```

---

## 🏗️ Project Structure

```text
src
└── main
    └── java
        └── com
            └── naveen
                └── backend
                    └── model
                        ├── Address.java
                        ├── User.java
                        ├── Employee.java
                        ├── Company.java
                        ├── Main.java
                        └── Main1.java
```

---

## 🔹 Address.java

```java
package com.naveen.backend.model;

public class Address {

    private String city;
    private String state;

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
```

---

## 🔹 User.java

```java
package com.naveen.backend.model;

import java.util.List;

public class User {

    private String name;
    private int age;
    private Address address;
    private List<String> skills;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
```

---

## 🔹 Jackson Deserialization

Jackson's `ObjectMapper` converts JSON into Java objects.

```java
ObjectMapper mapper = new ObjectMapper();

User user = mapper.readValue(json, User.class);
```

The flow is:

```text
JSON
 ↓
ObjectMapper
 ↓
User object
 ↓
Address object + List<String>
```

---

# 🎯 Challenge — Company & Employees

### JSON

```json
{
  "companyName": "OpenAI",
  "employees": [
    {
      "name": "Alice",
      "age": 28
    },
    {
      "name": "Bob",
      "age": 35
    }
  ]
}
```

### Model relationship

```text
Company
 ├── companyName
 └── employees
       ├── Employee
       │    ├── name
       │    └── age
       │
       └── Employee
            ├── name
            └── age
```

### Company.java

```java
package com.naveen.backend.model;

import java.util.List;

public class Company {

    private String companyName;
    private List<Employee> employees;

    public Company() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
```

### Employee.java

```java
package com.naveen.backend.model;

public class Employee {

    private String name;
    private int age;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

### Deserialization

```java
ObjectMapper mapper = new ObjectMapper();

Company company = mapper.readValue(json, Company.class);

for (Employee employee : company.getEmployees()) {
    System.out.println(employee.getName());
}
```

### Output

```text
Alice
Bob

Process finished with exit code 0
```

---

## 💡 Key Takeaways

### JSON object

```json
"address": {
    "city": "Ballari"
}
```

↓

```java
private Address address;
```

### JSON array of strings

```json
"skills": ["Java", "Spring Boot"]
```

↓

```java
private List<String> skills;
```

### JSON array of objects

```json
"employees": [
    {"name": "Alice"},
    {"name": "Bob"}
]
```

↓

```java
private List<Employee> employees;
```

### Most important concept

Jackson recursively maps the JSON structure to the corresponding Java object structure.

```text
JSON structure
      ↓
Java class structure
      ↓
ObjectMapper
      ↓
Java objects
```

---

## 🛠️ Technologies

* Java 17
* Maven
* Jackson Databind 2.17.1
* IntelliJ IDEA

---

## ✅ Definition of DONE

* [x] Mapped a nested JSON object
* [x] Mapped a JSON array to `List<String>`
* [x] Built `Address.java`
* [x] Built `User.java`
* [x] Built `Employee.java`
* [x] Built `Company.java`
* [x] Deserialized both JSON examples
* [x] Iterated through `List<Employee>`
* [x] Successfully printed employee names

# 🔒 DAY 33 — CLOSED ✅

**Next:** Day 34 🚀
