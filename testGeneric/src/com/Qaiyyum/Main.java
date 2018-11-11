package com.Qaiyyum;

public class Main {

    public static void main(String[] args) {
	// ni adalah program untuk test generic class kita bleh accept class lain tak
        Player amin = new Player("amin");
        Team selangor = new Team("selangor");
        System.out.println(selangor.addPlayer(amin));
        System.out.println(selangor.addPlayer(amin));


    }
}
