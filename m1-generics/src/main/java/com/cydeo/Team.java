package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> { //T means type, we made it generic because we do not want the Team accept any objects from Player, T means it can accept any Class though
//intention was T can be SoccerPlayer, BaseballPlayer, FootballPlayer etc.
    //it should accept only Player and subclasses of Player, so we changed Team<T> to Team<T extends Player>
    private String name;

    private List<T> members =new ArrayList(); //changed List<Player> to List<T>

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){ //we changed Player to T here
        if (members.contains(player)){
            System.out.println(((Player)player).getName() + "is already on the team"); // we cast it to Player
            return false;
        }else {
            members.add(player);
            System.out.println(((Player)player).getName() + "picked for the team" + this.name);
            return true;
        }
    }
}
