package com.Qaiyyum;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAdress;

    public VipCustomer(){
        this("defaultName", 10000, "default@gmail.com");
    }

    public VipCustomer(String name, int creditLimit){
        this(name, creditLimit, "default2@email.com");
    }

    public VipCustomer(String name, int creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
}
