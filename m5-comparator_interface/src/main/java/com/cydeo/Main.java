package com.cydeo;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer>  list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        //Ascending
        Collections.sort(list);
        System.out.println(list);

        //Descending
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list, ((o1, o2) -> (o1>o2) ? -1 : (o1<o2) ? 1 : 0));// how did it work?
        System.out.println(list);

        Collections.sort(list, new MyComparator()::compare); //I tried to use double colon operator
        System.out.println(list + " method reference");

        //Ascending order
        list.sort((o1,o2) -> o1.compareTo(o2));
        System.out.println(list);

        //Descending order
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println(list);





    }
}
