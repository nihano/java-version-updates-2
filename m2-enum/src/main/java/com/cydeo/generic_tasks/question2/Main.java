package com.cydeo.generic_tasks.question2;

public class Main {
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