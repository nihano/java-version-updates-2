package com.cydeo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>(); //Arraylist only accepts objects belongs to integer class, this means generics. It will not allow ading other than Integer
        //problem was class and interface structure in Java did not have any type protection that's why generics introduced.
        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("Apple");

        printDoubled(items);

    }

    public static void printDoubled(ArrayList<Integer> items){

        for (Integer i: items ){
            System.out.println(i*2);
        }
    }


}
