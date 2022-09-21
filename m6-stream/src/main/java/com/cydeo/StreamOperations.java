package com.cydeo;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        //list.forEach(System.out::println);//x-> System.out.println(x)
        //we can use the forEach() as a terminal operator now to close the stream

        System.out.println("************FILTER************");
        list.stream()
                .filter(i -> i % 2 == 0) //intermediate operator
                .forEach(System.out::println); //terminal operator to close the stream

        System.out.println("**********DISTINCT**********");
        Stream<Integer> str = list.stream()
                .filter(i -> i % 2 == 0)
                .distinct(); //it returns unique elements as Stream
                str.forEach(System.out::println);

        System.out.println("***********LIMIT************");
        list.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("***********SKIP************");
        list.stream()
                .filter((i -> i%2==0))
                .skip(1)
                .forEach(System.out::println);
        System.out.println("***********MAP************");
        list.stream()
                .map(number -> number*2)
                .filter(i->i%3==0)
                .forEach(System.out::println);





    }
}
