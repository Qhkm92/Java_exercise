package com.Qaiyyum;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer();

	printer.fillUpToner(100);
        printer.fillUpToner(100);
        printer.fillUpToner(100);
        printer.printPaper(10);
        printer.printPaper(100);
        printer.isDuplexPrinter();
        System.out.println(printer.getNumberOfPagesPrinted());
    }
}
