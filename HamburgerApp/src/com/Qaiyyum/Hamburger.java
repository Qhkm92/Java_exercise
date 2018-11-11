package com.Qaiyyum;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private int breadRollType;

    private String Addition1name;
    private double Addition1price;

    private String Addition2name;
    private double Addition2price;

    private String Addition3name;
    private double Addition3price;

    private String Addition4name;
    private double Addition4price;

    //Konstruktor untuk Class Hamburger
    public Hamburger(String name, String meat, double price, int breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName(){
        return name;
    }
    //Konstruktor bagi fungsi tambahan option
    public void addHamburgerAddition1(String name, double price){
        this.Addition1name = name;
        this.Addition1price = price;

    }

    public void addHamburgerAddition2(String name, double price){
        this.Addition2name = name;
        this.Addition2price = price;

    }
    public void addHamburgerAddition3(String name, double price){
        this.Addition3name = name;
        this.Addition3price = price;

    }
    public void addHamburgerAddition4(String name, double price){
        this.Addition4name = name;
        this.Addition4price = price;

    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger");
        return hamburgerPrice;
    }
}






