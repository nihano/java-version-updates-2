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

        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        System.out.println("how to use switch cases with enums");

        Currency myCurrency = Currency.QUARTER;
        switch (myCurrency) {
            case PENNY:
                System.out.println("it is 1 cent");
                break;
            case NICKEL:
                System.out.println("it is 5 cents");
                break;
            case DIME:
                System.out.println("it is 10 cents");
                break;
            case QUARTER:
                System.out.println("it is 25 cents");
                break;
        }

        System.out.println("Operation task");
        calculate(3, 5, Operation.PLUS);

        System.out.println("how to retrieve the constant value");
        System.out.println(Currency.PENNY.getValue()); // we access the value through the obj via getter
        System.out.println(Currency.QUARTER.getValue());
        System.out.println(Currency.QUARTER.ordinal()); // returns index number of constant in enum

    }

    private static void calculate(double x, double y, Operation operation) {

        switch (operation) {
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
        }


    }

}

/*
Task: create a method for Math operations
      create a method called 'calculate' which accepts 3 parameters and prints the result
      based on the selected operator in switch-case  declared inside the method

HOMEWORK:

 */