package com.Qaiyyum;

import java.util.ArrayList;

public class Account implements AccountInterfaces{
        public String accountName;
        public int balance;
        //we have to specify type to ArrayList
        public ArrayList<Integer> transaction;

        public Account(String accountName) {
            this.accountName = accountName;
            this.transaction = new ArrayList<Integer>();
        }

        public int getBalance() {
            return balance;
        }

        public void deposit(int amount){
            if(amount > 0) {
                transaction.add(amount);
                this.balance += amount;
                System.out.println(amount + " deposited. Balance is now " + this.balance);
            } else {
                System.out.println("entered amount is not valid");
            }
        }

        public void withdraw(int amount){
            int withdrawal = -amount;
            if(withdrawal < 0){
                this.transaction.add(withdrawal);
                this.balance += withdrawal;
                System.out.println(amount + " withdrawn. Balance is now " + this.balance);
            } else {
                System.out.println("cannot withdraw negative sum");
            }
        }
}