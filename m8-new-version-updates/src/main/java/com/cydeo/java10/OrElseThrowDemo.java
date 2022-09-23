package com.cydeo.java10;

import java.util.Optional;

public class OrElseThrowDemo {
    public static void main(String[] args) {

        //replacement of the get() method and isPresent()

        Optional<String> str = Optional.empty();

       //System.out.println(str.get()); //will throw exception

        /*
        if (str.isPresent()){
            System.out.println(str.get());
        }else {
            //handle the error
        }

         */

        System.out.println(str.orElseThrow());
        System.out.println(str.orElseThrow(()-> new RuntimeException())); //this throws exception as well??




    }
}
