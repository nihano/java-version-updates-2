package com.cydeo.generic_tasks.count_values;

public class OddPredicate implements UnaryPredicate<Integer>{
    @Override
    public boolean test(Integer obj) {
        return obj %2!=0;
    }

    /*
    Why do we need generic? We can need another implementation such as PrimePredicate and type can be different
    so another class can implement UnaryPredicate, and we can define the data type in <>
     */
}
