package com.austinhua;

public class Main {

    public static void main(String[] args) {
        hasSharedDigit(12, 23);

    }

    public static boolean hasSharedDigit ( int num1, int num2){
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
            System.out.println("false");
            return false;
        }

        int digit1 = num1 % 10;
        int digit2 = num2 % 10;
        num1 /= 10;
        num2 /= 10;

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(num1);
        System.out.println(num2);

        if (digit1 == digit2 || num1 == digit2
                || digit1 == num2 || num1 == num2){
            System.out.println("true");
            return true;
        }

        System.out.println("false");
        return false;

    }
}
