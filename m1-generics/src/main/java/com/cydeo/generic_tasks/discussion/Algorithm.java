package com.cydeo.generic_tasks.discussion;

public class Algorithm {
}

/*

Will the following class compile? If not, why?
public final class Algorithm{
    public static <T> T max(T x, T y){

    return x > y ? x : y;
    }
 }

 ANSWER: Will not compile because generics only accepts objects x>y numbers int return statement.
 Generics do not accept primitives.


 */
