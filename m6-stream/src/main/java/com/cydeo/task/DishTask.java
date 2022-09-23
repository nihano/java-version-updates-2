package com.cydeo.task;

import java.util.Comparator;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {

        //Print all the dishes name that has  less than 400 calories
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                //             .map(dish -> dish.getName()) Lambda version
                .map(Dish::getName)
                .forEach(System.out::println);


        //Print the length of the name of each dish
        DishData.getAll().stream()
                .map(Dish::getName)
                //.map(dish -> dish.length())
                .map(String::length)
                .forEach(System.out::println);

        //print three high calorie dish name (>300)
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        //print all dishes name that are below 400 calories in sorted
        System.out.println("**Task-4**");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(dish -> dish.getCalories())) // or .sorted(comparing(Dish::getCalories)) (import static methods as well)
                .map(Dish::getName)
                .forEach(System.out::println);

        // NOTE: .sorted(Comparator.comparing(dish -> dish.getCalories().reversed())) reversed order


    }
}
