package com.cydeo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Apple {

    private int weight;
    private Color color; //Enum


}


/*

TASK:
In software engineering, user requirements will change.

Example : Imagine an application to help a farmer understand his inventory.
- Find all green apples in the inventory
- Find all apples heavier than 200 g

As a developer, we have to minimize our engineering effort.

----------------------------------------------------------------

MY BUSINESS LOGIC WAS:

Apple class implements interface
object constructor with color and weight

find apples (obj as argument)
   find green colors code

find apples(obj as argument)
  find 200 gr apples

interface
has an abstract method of find apples

test class
create an arraylist with the apple obj
sort apples by using methods



 */