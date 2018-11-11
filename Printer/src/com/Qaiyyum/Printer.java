package com.Qaiyyum;

public class Printer {
    private int tonerLevel = 0;
    private int numberOfPagesPrinted = 0;
    private boolean duplexPrinter = false;


    public int fillUpToner(int numTonerRefill){
        System.out.println("Current toner level = " + tonerLevel);
        if(numTonerRefill > 0 && numTonerRefill <= 100 )
        this.tonerLevel += numTonerRefill;
        System.out.println("After refill toner level = " + this.tonerLevel);
        return this.tonerLevel;
    }

    public int printPaper(int paperPages){
        System.out.println("you print " + paperPages + " pages");
        this.numberOfPagesPrinted += paperPages;
        System.out.println("Total number of pages printed is " + this.numberOfPagesPrinted);
        return this.numberOfPagesPrinted;
        return getClass().getSimpleName()
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        System.out.println(duplexPrinter);
        return duplexPrinter;
    }
}
