package com.austinhua;

public class Account {

    private String account_number;
    private int balance;
    private String customer_name;
    private String email;
    private String phone_number;

    // If you make constructors you don't need to make setters
    // creating an empty constructor
    public Account(){
        // create a default value
        this("5412", 200, "Default Name",
                "Default address", "00000000");
    }

    // creating a constructor
    public Account(String account_number, int balance, String customer_name, String email, String phone_number){
        this.account_number = account_number;
        this.balance = balance;
        this.customer_name = customer_name;
        this.email = email;
        this.phone_number = phone_number;
    }

    // set the setters
//    public void setAccount_number(String account_number){
//        this.account_number = account_number;
//    }
//
//    public void setBalance (int balance){
//        this.balance = balance;
//    }
//
//    public void setCustomer_name (String customer_name){
//        this.customer_name = customer_name;
//    }
//
//    public void setEmail (String email){
//        this.email = email;
//    }
//
//    public void setPhone_number(String phone_number){
//        this.phone_number = phone_number;
//    }

    // set the getters
    public String getAccount_number(){
        return this.account_number;
    }

    public int getBalance(){
        return this.balance;
    }

    public String getCustomer_name(){
        return this.customer_name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhone_number(){
        return phone_number;
    }

    // method to deposit funds
    public void depositFunds(int deposit){

        this.balance = balance + deposit;

        System.out.println("You are trying to deposit " + deposit);
        System.out.println("Deposit Successful!");
        System.out.println("New balance is now " + this.balance);
        System.out.println();
    }

    // method to withdraw funds
    public void withdrawFunds(int withdraw){

        this.balance -=  withdraw;

        System.out.println("You are trying to withdraw " + withdraw);

        if (this.balance < 0){
            System.out.println("Insufficent funds");
            this.balance += withdraw;
            System.out.println("Account balance is still " + this.balance);
            System.out.println();
        }
        else {
            System.out.println("Withdraw Successful!");
            System.out.println("New balance is now " + this.balance);
            System.out.println();
        }

    }


}
