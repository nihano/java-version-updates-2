package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.Type;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 7);

        System.out.println("-----toCollection(Supplier)-----");
        //is used to create a Collection using Collector
        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new)); //we call collect method first stream.collect() then we can call the method that we want to use through the Collectors class name
        System.out.println(numberList);
       /*
       supplier interface in toCollection parameter does not take any parameter and
       return something. So, lambda is  ()-> new ArrayList<>() but we can write it
       with method reference because we are directly calling a method in lambda
       (which is constructor in this case) so we can directly write ArrayList::new
        */
        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        System.out.println("-----toList()-----");
        //toList(): returns a Collector interface that gathers the input data into a new list
        List<Integer> numberList2 = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        System.out.println("-----toSet()-----");
        //toList(): returns a Collector interface that gathers the input data into a new set
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toSet());

        System.out.println("-----toMap()-----");
        //toMap(Function, Function): returns a Collector interface that gathers the input data into a new map
        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        //      .collect(Collectors.toMap(dish -> dish.getName(), dish -> dish.getCalories()));
        System.out.println(dishMap);

        System.out.println("-----summingInt()-----");
        //summingInt(ToIntFunction): returns a Collector that produces the sum of Integer-valued function
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        System.out.println("-----counting()-----");
        //counting(): returns a Collector that counts the number of elements
        Long evenCount = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

        System.out.println("-----averagingInt()-----");
        //averagingInt(ToIntFunction): returns the average of integers passed values
        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAverage);

        System.out.println("-----joining()-----");
        //joining() : is used to join various elements of a character or string array into a single object
        List<String> courses  = Arrays.asList("Java", "JS", "TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        System.out.println("-----partitioningBy()-----");
        //partitioningBy(): is used to partition  a stream of objects (or a stream of elements) based on a given predicate.
        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        System.out.println("-----groupingBy()-----");
        //groupingBy(): is used for grouping objects by some properties and storing results in a map instance
       Map<Type, List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);


    }
}
