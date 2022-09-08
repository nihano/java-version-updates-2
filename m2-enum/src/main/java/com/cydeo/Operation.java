package com.cydeo;

public enum Operation {

    PLUS, MINUS, MULTIPLY, DIVIDE; // each constant is object of the Operation

    Operation() { //this constructor cannot be public, we cannot call this constructor, it is private by default. values already constant we cannot assign new values?
        System.out.println("Constructor");  // this prints constructor 4 times? I did not get it.
    }


}
