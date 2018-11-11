package com.Qaiyyum;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myVariable = new getVariables();
	    for(int i=0;i<myVariable.length;i++){
            System.out.println("the element value is " + myVariable[i]);
        }
    }

    public static int[] getVariables(int number){
        //print out command to enter number
        System.out.println("enter number" + number + " to put into array \r");

        //define and create new array, and assign in to new variable
        int[] values = new int[number];

        //loop for every array element
        for(int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();

        }

        return values;

    }


}
