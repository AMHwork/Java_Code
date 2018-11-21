package com.austinhua;

public class Main {

    public static void main(String[] args) {
        isPalindrome(-1221);
        isPalindrome(707);
        isPalindrome(11212);
        isPalindrome(3321);

    }

    public static boolean isPalindrome (int number){
        int lastDigit;
        int sum = 0;
        int original = number;

        while (number != 0){
            lastDigit = number % 10;
            sum = (sum * 10) + lastDigit;
            number = number / 10;
        }

        if (sum == original){
            System.out.println("true");
            return true;
        }

        System.out.println("false");
        return false;
    }
}
