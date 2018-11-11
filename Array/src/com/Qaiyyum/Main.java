package com.Qaiyyum;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortedArray(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int number){

        System.out.println("Enter " + number + " integer value. \r");

        int[] values = new int[number];

        for(int i=0;i<values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int[] printArray(int[] values){
        int[] newArray = values;
        for(int i=0;i<newArray.length; i++){
            System.out.println("element " + i + ", typed value was " + newArray[i] );
        }
        return newArray;
    }

    public static int[] sortedArray(int[] array){
        int[] sortedArray = new int[array.length];
        for (int i=0;i<array.length;i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i = 0;i< sortedArray.length-1; i++){
                if (sortedArray[i] > sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;


    }

}









//    public static void main(String[] args) {
//	int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//	for (int i=0;i<myIntArray.length;i++){
//	    myIntArray[i] = i*10;
//        System.out.println(myIntArray[i] + "for the value " + i);
//    }
//    for (int i =0; i<10;i++){
//        System.out.println("Element" + i + ", value is " + myIntArray[1]);
//    }

//    public static void main(String args[]) {
//        String Str = new String("Welcome to Tutorialspoint.com");
//        System.out.println("Hashcode for Str" + Str.hashCode());
//
//        String str1 = "test";
//        String str2 = "run";
//
//        String hub = str1.concat(str2);
//        System.out.println(hub);
//
//        int[] myIntArray = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
//
//        printArray(myIntArray);
//
//    }
//    public static void printArray(int[] array){
//        for(int i = 0; i < array.length; i++){
//            System.out.println("the value of "+ i + " and the value of array is "+ array[i]);
//        }
//    }


//	myIntArray[5] = 50;
//	myIntArray[0] = 10;
//	myIntArray[1] = 2;
//	myIntArray[2] = 10;
//	double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);



