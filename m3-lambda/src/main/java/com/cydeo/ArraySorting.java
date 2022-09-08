package com.cydeo;

import java.util.ArrayList;

public class ArraySorting { //QuickSort, BubbleSort different methods for array sorting will learn in the future

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();

        QuickSort qs = new QuickSort();
        BubbleSort bs =new BubbleSort();

        as.sort(qs);
        as.sort(bs);

        Sorting quickSort = () -> System.out.println("Quick sorting"); //Lambda Expression
        as.sort(quickSort); // we directly passed lambda expression to the method
        as.sort(() -> System.out.println("Quick sorting")); // or we passed lambda expression like this
        //WITH LAMBDA EXPRESSION WE CAN GET RID OF IMPLEMENTATION OF ABSTRACT METHODS SO WE CAN GET RID OF QuickSort and BubbleSort Classes

        //With Java 8 -  we have access to a bunch of ready functional interfaces

    }

    private void sort(Sorting sorting){
        sorting.sort();
    }
}
