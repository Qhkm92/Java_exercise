package com.Qaiyyum;

public class Main {

    public static void main(String[] args) {
        BankAccount qaiyyum = new BankAccount();//BankAccount(12345, 0.00, "qaiyyum", "qaiyyum@email.com", 123456);
        System.out.println("Hello" + qaiyyum.getCustomerName() + "! Welcome to Maybank");
        qaiyyum.depositMoney(1000);
        qaiyyum.withdrawMoney(200);
        qaiyyum.depositMoney(101);

        System.out.println(qaiyyum.getCustomerName());
        System.out.println(qaiyyum.getAccountNumber());

        BankAccount Siti = new BankAccount();
        VipCustomer Nenen = new VipCustomer();
        System.out.println(Nenen.getName());
        System.out.println(Nenen.getCreditLimit());
        System.out.println(Nenen.getEmailAdress());

        VipCustomer Nen = new VipCustomer("nen", 1000);
        System.out.println(Nen.getEmailAdress() + " plus " + Nen.getName() + Nen.getCreditLimit());
        System.out.println(Nen.getName());
        System.out.println(Nen.getCreditLimit());









    }

}
