package com.cydeo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>(); //Arraylist only accepts objects belongs to integer class, this means generics. It will not allow ading other than Integer
        //problem was class and interface structure in Java did not have any type protection that's why generics introduced.
        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("Apple");

        printDoubled(items);

        System.out.println("*********************************");

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool = new Team("Liverpool"); //Team was accepting any object before adding <SoccerPlayer>. We made Team class generic by adding <T> so that we can now restrict data type here
        //liverpool.addPlayer(joe);
        //liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

        //Team<String> brokenTeam =new Team<>("what kind of team is this?"); String is not a child class of Player --> Team<T extends Player> in Team class

        //Team<Integer> t2 = new Team<>("very weird"); Integer is not a child class of Player --> Team<T extends Player> in Team class

    }

    public static void printDoubled(ArrayList<Integer> items){

        for (Integer i: items ){
            System.out.println(i*2);
        }
    }


}
