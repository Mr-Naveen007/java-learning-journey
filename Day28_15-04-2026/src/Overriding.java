class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}
class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("Lion roars");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal[] Animals = {new Dog(), new Cat(), new Cow(), new Lion()};   // Upcasting

        for(Animal a : Animals) {
            a.sound();
        }
    }
}