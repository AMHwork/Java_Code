package com.austinhua;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setter for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field)
        // 2. To allow the customer to withdraw funds (this should deduct from the balance field)
        // but now allow the widthdrawal to comeplete if their are insufficent funds.
        // You will want to create various code in the Main class (the one create by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        Account account1 = new Account("111" , 1000, "austin",
                "azn_dark_boy@hotmail.com", "0414491655");
        //Account account1 = new Account();

//        account1.setAccount_number("111");
//        account1.setBalance(1000);
//        account1.setCustomer_name("austin");
//        account1.setEmail("azn_dark_boy@hotmail.com");
//        account1.setPhone_number("0414491655");

        System.out.println(account1.getAccount_number());
        System.out.println(account1.getBalance());
        System.out.println(account1.getCustomer_name());
        System.out.println(account1.getEmail());
        System.out.println(account1.getPhone_number());

        System.out.println();

        account1.depositFunds(1000);
        account1.withdrawFunds(2000);

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());
        System.out.println(person1.getCreditLimit());
        System.out.println(person1.getEmailAddress());
        System.out.println();

        VipPerson person2 = new VipPerson("Bob", 2500.00);
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmailAddress());
        System.out.println();

        VipPerson person3 = new VipPerson("Austin", 1000.00,
                "azn_dark_boy@hotmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());
        System.out.println(person3.getEmailAddress());
        System.out.println();

    }

//    public static void depositFunds (int deposit){
//
//        Account account = new Account();
//        int balance = account.getBalance();
//
//        balance = balance + deposit;
//
//        System.out.println("Your deposit is now " + balance);
//
//    }
//
//    public static void withdrawFunds (int withdraw){
//
//        int balance = account.getBalance();
//
//        balance = balance - withdraw;
//
//        if (balance <= 0){
//            System.out.println("Insufficent funds");
//        }
//        else {
//            System.out.println("Your deposit is now " + balance);
//        }
//
//    }
}
