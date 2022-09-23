package com.cydeo.java9;

import java.util.*;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        //creating unmodifiable list before Java-9

        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java", "Spring", "Agile"));
        //courses.add("TS"); -->we made it immutable cannot add any elements.
        System.out.println(courses);

        //creating unmodifiable List after Java-9
        List<String> myCourses = List.of("Java", "Spring", "Agile");

        //creating unmodifiable Set after Java-9
        Set<String> myProduct = Set.of("Milk", "Bread", "Butter");

        //creating unmodifiable Map after Java-9
        Map<String, Integer> myCart =Map.ofEntries(
                Map.entry("Samsung", 1),
                Map.entry("PSP", 1),
                Map.entry("Chair", 5)
        );





    }
}
