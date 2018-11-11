package com.Qaiyyum;

import java.util.ArrayList;

public class Team {
    public String name;

    private ArrayList player = new ArrayList();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player){
        if(this.player.contains(player)){
            System.out.println("this player already exist");
            return false;
        } else {
            this.player.add(player);
            System.out.println("player added: " + player.name);
            return true;
        }

    }
}
