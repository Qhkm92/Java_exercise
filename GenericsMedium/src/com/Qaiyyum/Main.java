package com.Qaiyyum;

public class Main {

    public static void main(String[] args) {
	// write your code here

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");


        Team terengganu = new Team("terengganu");
        terengganu.addPlayer(joe);
        terengganu.addPlayer(pat);
        terengganu.addPlayer(beckham);
        terengganu.addPlayer(beckham);

        System.out.println(terengganu.numPlayers());
    }
}
