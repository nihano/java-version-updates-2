package com.cydeo;

@FunctionalInterface //to make sure it has only one abstract method
public interface ApplePredicate {
    boolean test(Apple apple);
}
