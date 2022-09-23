package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        /*
        Optional is protecting us from getting NullPointerException
         */

        List<Integer> number = Arrays.asList(2,4,2,10,23);

        //creating an empty optional
        //empty() - isPresent()

        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent()); //false

        System.out.println(Optional.of(number).isPresent()); //true

        //ifPresent
        Optional<Integer> bigNumber = number.stream().filter(x->x>100).findAny();
        bigNumber.ifPresent(System.out::println); //false - condition is false

        //get()
       // System.out.println(bigNumber.get()); throws exception because condition is false above

        //orElse()
        System.out.println(bigNumber.orElse(5));



    }
}
