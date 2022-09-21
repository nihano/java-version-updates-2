package com.cydeo.task;

import java.util.Collection;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        System.out.println("Print All Emails");
        EmployeeData.readAll()
     //         .map(employee -> employee.getEmpEmail())
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("Print All The Phone Numbers");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumber().stream())
                .forEach(System.out::println);

        //NOTE: flatMap() takes Stream<Stream<T>> that's why we converted the lambda to stream() above

        System.out.println("Print All The Phone Numbers with Double Colon Operator");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .flatMap(List::stream)
                .forEach(System.out::println);





    }
}
