package com.cydeo.generic_tasks.count_values;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }

    private static <T> int countIf(List<T> c, UnaryPredicate<T> p){ //UnaryPredicate<T> p because it can be other than OddPredicate obj such as EvenPredicate so we used polymorphism
        int count = 0;
        for (T elem : c){
            if (p.test(elem)){
                ++count;
            }
        }
        return count;
    }

}

/*
Write a generic method to count the number of elements in a collection
that have a specific property(for example, odd integers, prime numbers).
Use following interface in your solution as well:

public interface UnaryPredicate<T> {
    public boolean test(T obj);
}

Sample output:
List<Integer> ci = Arrays.asList(1,2,3,4);
int count = countIf(ci, new OddPredicate());
System.out.println("Number of odd integers = " +count);

 */