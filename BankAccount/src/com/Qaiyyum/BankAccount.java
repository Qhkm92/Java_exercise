package com.Qaiyyum;

public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount(){
        this (12345, 0.00, "default Name", "support@mail.com", 123456789);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, long phoneNumber){
        System.out.println("account constructor with parameter called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, long phoneNumber) {
        this(9999, 0.00, customerName, email, phoneNumber);
    }

    public void setAccountNumber(int accountNumber){

        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountBalance(double accountBalance)
    {

        this.accountBalance = accountBalance;
    }
    public double getAccountBalance()
    {
        return this.accountBalance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;

    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return this.email;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }


    public int depositMoney(int depositAmount){
        System.out.println("You have deposited " + depositAmount);
        this.accountBalance = accountBalance + depositAmount;
        System.out.println("your current balance is " + this.accountBalance);
        return (int) this.accountBalance;

    }

    public double withdrawMoney(double withdrawAmount ){
        if(withdrawAmount > this.accountBalance){
            System.out.println("Your account is insufficient");
        } else {
            System.out.println("you have withdraw " + withdrawAmount);
            this.accountBalance -= withdrawAmount;
            System.out.println("Your current account balance is " + this.accountBalance);
            return this.accountBalance;

        }

        return withdrawAmount;
    }
}
