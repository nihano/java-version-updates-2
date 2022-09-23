package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reducing {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);

        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println("sum= " + sum);

        int result = numbers.stream().reduce(0, (a, b) -> (a + b));
        System.out.println("result =" + result);
        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> (a + b)); //if we do not give initial value it is going to return Optional
        System.out.println("result2 =" + result2.get());

        System.out.println("Total of Dish Calories");

        /*
        //I tried this way
        Stream<Dish> dishes =  DishData.getAll().stream();
        int totalCalories = dishes.map(dish -> dish.getCalories()).reduce(0,(a,b)->(a+b));
        System.out.println(totalCalories);
         */

        int calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a, b) -> a + b)
                .get(); //because reduce returns optional we used get method
        System.out.println(calTotal);

        //OR this way
        Optional<Integer> calTotal2 = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a, b) -> a + b);
        System.out.println(calTotal2.get());

        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min); //we can use Integer class methods directly in reduce method
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum2 = numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min.get());
        System.out.println("max = " + max.get());
        System.out.println("sum2 = " + sum2.get());

        Optional<Integer> calTotal3 = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce(Integer::sum);
        System.out.println("calTotal3 = " + calTotal3.get());

        System.out.println("****Count****");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);

    }
}
