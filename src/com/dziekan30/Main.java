package com.dziekan30;

public class Main {

    public static void main(String[] args) {
        Account bobAccount = new Account();
//                "12345",
//                0.00,
//                "bob bbb",
//                "test@gm.com",
//                "(888)999-2882" );
        System.out.println(bobAccount.getNumber());
        System.out.println(bobAccount.getBalance());


        bobAccount.withdrawal(100.0);

        bobAccount.deposit((50.0));
        bobAccount.withdrawal(100.00);

        bobAccount.deposit(51.0);
        bobAccount.withdrawal(100.0);

        Account timsAccount = new Account("Tim", "tim@gma.com", "12345");
        System.out.println(timsAccount.getNumber() + "name " + timsAccount.getCustomerName());

        System.out.println("_------------------------------_");

        VipCustomer kd = new VipCustomer();
        System.out.println(kd.getName());

    }
}
