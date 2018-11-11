package com.Qaiyyum;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int value = 3;
        if(value == 1){
            System.out.println("value was 1");
        } else if(value == 2){
            System.out.println("value was 2");
        } else {
            System.out.println("value was not 1 or 2");
        }

        int switchValue = 4;

        switch (switchValue){
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was 3 or 4 or 5");
                System.out.println("actually it was " + switchValue);
                break;
            default:
                System.out.println("was not one or two");
                break;
        }

        char test = 'E';

        switch (test){
            case 'A': case 'B': case 'C': case 'D':
                System.out.println("ABCD was found and the real value is " + test);
                break;
            default:
                System.out.println("Not found");
                break;
        }

        String month = "January";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("The month is " + month);
                break;
            case "june":
                System.out.println(month);
                break;
            default:
                System.out.println("Month not found");
                break;

        }

        //more code here
    }
}
