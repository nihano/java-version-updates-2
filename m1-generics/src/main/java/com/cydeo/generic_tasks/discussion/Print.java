package com.cydeo.generic_tasks.discussion;

public class Print {


}

/*

Will this method complile? If not, why?
 public static void print(List<? extends Number> list){
        for (Number n : list)
            System.out.print(n+ " ");
        System.out.println();
    }

    ANSWER: Yes, will compile
    Generic method supports Number and all the number extends Number so it will complile.
 */
