package com.dziekan30;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    // setting up default parameters
    public VipCustomer(){
        this("Tom", 2000.00, "tom@gma.com");
        System.out.println("First constructor called");
    }

    public VipCustomer(String name, double creditLimit) {
       this(name, creditLimit, "unknowemail@gm.com");
    }

    // created constructor
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email= email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
