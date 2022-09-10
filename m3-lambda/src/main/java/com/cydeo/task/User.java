package com.cydeo.task;


import lombok.*;

//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
@Data //NoArgConstructor, getter, setter, toString - usually we do not use it we use AllArgConstructor and NoArgConstructor together
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private int age;




}
