package com.cydeo.task;

import com.cydeo.Apple;
import com.cydeo.ApplePredicate;

import java.util.function.*;

public class FunctionalInterface {

    public static void main(String[] args) {


        //ANONYMOUS CLASS EXAMPLE - IN THIS CASE THIS IS APPLEHEAVYPREDICATE CLASS
        //WE DO NOT USE THIS ANYMORE BECAUSE WE HAVE LAMBDA
        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };

        System.out.println("*********************PREDICATE*****************");
        Predicate<Integer> lesserThan = i -> i<18;
        System.out.println(lesserThan.test(20));

        System.out.println("*********************CONSUMER*****************");
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        System.out.println("*********************BI CONSUMER*****************");
        BiConsumer<Integer, Integer> addTwo = (x,y) ->System.out.println(x+y);
        addTwo.accept(1,2);

        System.out.println("*********************FUNCTION*****************");
        Function<String, String > fun = s -> "Hello " + s;
        System.out.println(fun.apply("World"));

        System.out.println("*********************BI FUNCTION*****************");
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        System.out.println(func.apply(2,3));

        System.out.println("*********************SUPPLIER*****************");
        Supplier<Double> randomValue = ()->Math.random(); //does not take any parameter, returns a value
        System.out.println(randomValue.get());

    }
}
