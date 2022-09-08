package com.cydeo;

import java.lang.Enum;
public enum Currency {

    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);//these are objects of currency class
    //this is how we assign values to constants

    private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
