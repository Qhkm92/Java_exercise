package com.Qaiyyum;

public class Main {

    public static void main(String[] args) {

        double centimeters = calculateFeetAndInchToCentimeter(6,0);
        if(centimeters < 0 )
            System.out.println("invalid parameter");

        calculateFeetAndInchToCentimeter(10);

    }
    public static double calculateFeetAndInchToCentimeter(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches < 12){
            double numCentimeterForFeet = 2.54d * 12 * feet;
            double numCentimeterforInches = 2.54d * inches;
            double result = numCentimeterForFeet + numCentimeterforInches;
            System.out.println("total centimeters = " + result);
            return result;
        }
        else
            return -1;

    }

    public static double calculateFeetAndInchToCentimeter(double inches) {
        if (inches <0){
            return -1;
        }

            double feet = (int)inches/12;
            double remainingInches = (int)inches % 12;
            System.out.println(inches + " inches " + "is equal to " + feet + " feet and "+ remainingInches + " inches");
            return calculateFeetAndInchToCentimeter(feet, remainingInches);
    }

            

}




    