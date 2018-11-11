package com.Qaiyyum;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// we are going to create a program that enables us to create account, withdraw money, deposit money, and check balance
    Account qaiyyumAccount = new Account("qaiyyum");
    qaiyyumAccount.deposit(1000);
    qaiyyumAccount.withdraw(5000);
    System.out.println(qaiyyumAccount.getBalance());


    }
}

