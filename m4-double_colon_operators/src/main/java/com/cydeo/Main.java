package com.cydeo;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {


        Calculate sum1 = (x,y) -> System.out.println(x+y);

        Calculate s1 = (x,y) -> Calculator.findSum(x,y); //we can pass method as implementation since we have a method which does the same thing in Calculator class


        //Reference to static method
        Calculate s2 = Calculator::findSum; //double colon operator, we can directly pass method through the class name and method name by using :: instead of writing lambda expression
        s2.calculate(10,20);

        //Reference to instance method
        Calculator obj = new Calculator(); //to call the method through the object
        Calculate s3 = obj::findMultiply;

        Calculate s4 = new Calculator()::findMultiply;

    }
}
