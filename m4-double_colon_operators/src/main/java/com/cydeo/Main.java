package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
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

        BiFunction<String, Integer, String> func = (str, i) ->str.substring(i);
        BiFunction<String, Integer, String> func2 = String::substring; //SUBSTRING METHOD IS NOT STATIC WHY WE CALL THIS THROUGH THE CLASS NAME?
        //ANSWER --> because we have a return type in this method which is "STRING". This object belongs to String class. in the previous example we did not have return type.

        Function<Integer, Double> b = new MyClass()::method;
        BiFunction<MyClass, Integer, Double> b1 = MyClass::method;

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;




    }
}
