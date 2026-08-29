package com.naveen.backend.model;

import java.util.List;
import java.util.ArrayList;

public class Main {

    // Generic method
    public static <T> void printValue(T value) {
        System.out.println(value);
    }

    // Bounded type parameter
    public static <T extends Number> void printNumber(T value) {
        System.out.println(value);
    }

    // Basic wildcard
    public static void printList(List<?> list) {
        System.out.println(list);
    }

    // Upper-Bounded Wildcard
    public static void printNumbers(List<? extends Number> numbers) {

        for (Number number : numbers) {
            System.out.println(number);
        }
    }

    //Lower-Bounded Wildcard
    public static void addIntegers(List<? super Integer> list) {

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
    }

    public static void main(String[] args) {


        //Generic class
        Response<String> response1 = new Response<>("Success");
        System.out.println(response1.getData());

        Response<Integer> response2 = new Response<>(200);
        System.out.println(response2.getData());

        User user = new User();
        user.setName("Naveen");
        user.setAge(31);

        Response<User> response3 = new Response<>(user);

        System.out.println(response3.getData().getName());
        System.out.println(response3.getData().getAge());

        // Generic method
        printValue("Java");
        printValue(100);
        printValue(true);

        // Bounded type parameter
        printNumber(100);
        printNumber(10.5);
        printNumber(100L);

        // Basic wildcard
        List<String> names = List.of("Naveen", "Rahul");
        List<Integer> numbers = List.of(10, 20);

        printList(names);
        printList(numbers);

        // Upper-Bounded Wildcard
        List<Integer> integerNumbers = List.of(10, 20, 30);
        List<Double> decimalNumbers = List.of(10.5, 20.5, 30.5);

        printNumbers(integerNumbers);
        printNumbers(decimalNumbers);

        //List<String> text = List.of("Java", "Spring");
        //printNumbers(text); // ❌ Not allowed

        //Lower-Bounded Wildcard
        List<Integer> integers = new ArrayList<>();
        List<Number> numbersList = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        addIntegers(integers);
        addIntegers(numbersList);
        addIntegers(objects);
    }
}