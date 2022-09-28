package com.cydeo.java14;

public record User(String name, String address) {

    //private and final by default
    //ALL ARG CONSTRUCTOR
    //GETTER
    //TO STRING
    //EQUALS
    //HASH CODE

    /*But this is final and immutable and there is no setter because of that.
    That's why it's not used in market yet.
    It is already private as well, we need to call the fields through the obj. Check UserTest.
     */
}
