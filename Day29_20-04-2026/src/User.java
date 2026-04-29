import java.io.Serializable;

public class User implements Serializable {
    private final String name;
    private final int age;
    private final transient int  salary;

    public User(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void display() {
        System.out.println(name + " " + age + " $" + salary);
    }
}