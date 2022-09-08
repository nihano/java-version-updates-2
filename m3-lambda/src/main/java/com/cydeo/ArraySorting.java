package com.cydeo;

import java.util.ArrayList;

public class ArraySorting { //QuickSort, BubbleSort different methods for array sorting will learn in the future

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();

        QuickSort qs = new QuickSort();
        BubbleSort bs =new BubbleSort();

        as.sort(qs);
        as.sort(bs);

    }

    private void sort(Sorting sorting){
        sorting.sort();
    }
}
