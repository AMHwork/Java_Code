package com.austinhua;

public class Main {

    public static void main(String[] args) {
        System.out.println("sum of the digits is = " + sumDigits(125));
        System.out.println("sum of the digits is = " + sumDigits(34212));
        System.out.println("sum of the digits is = " + sumDigits(-125));
    }

    public static int sumDigits (int number){

        int total = 0;

        if (number < 10){
            return -1;
        }
        while (number > 0){
            int leastDigit = number % 10;
            //System.out.println("last digit of the number was = " + leastDigit);
            total += leastDigit;
            number /= 10;
        }

        return total;

    }
}
