package com.Qaiyyum;

public class Main {

    public static void main(String[] args) {
        // write your code here
      /*  System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000, 3));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000, 4));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000, 5));

        for(int i=0;i<5;i++){
        System.out.println("loop" + i + "hello!");}*/

        for (int i = 2; i<9; i++) {
            System.out.println(String.format("%.2f", calculateInterest(10000,i)));
        }


        int count = 0;
        for(int j = 10; j<50;j++){
            if(isPrime(j)){
                count++;
                System.out.println("value" + j + "is a prime number");
                if(count == 3){
                    System.out.println("exiting for loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }

        for(int i=2;i<=n/2;i++){
            if(n%1==0){
                return false;
            }

        }
        return true;
    }

}
