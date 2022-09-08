package com.cydeo;

import javax.swing.plaf.ColorUIResource;

public class Main {
    public static void main(String[] args) {

        System.out.println("How to access a constant");

        Currency c = Currency.DIME; // we called the object through the class name
        System.out.println(c); // we get the obj name when we run because toString already is overridden in Enum?
        System.out.println(Currency.PENNY);

        System.out.println("How to access all the constants?");
        Currency[] currencies = Currency.values(); //values() method returns array of the constants

        for (Currency currency : currencies){
            System.out.println(currency);
        }

    }
}
