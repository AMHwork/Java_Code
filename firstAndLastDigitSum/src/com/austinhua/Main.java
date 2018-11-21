package com.austinhua;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(123));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit ( int number ){
        if (number < 0){
            return -1;
        }

        int lastDigit;
        int firstDigit = 0;
        int total;

        lastDigit = number % 10;
        System.out.println("this is the last digit " + lastDigit);

        while (number != 0){
            firstDigit = number % 10;
            number = number / 10;
        }

        System.out.println("this is the first digit " + firstDigit);

        total = lastDigit + firstDigit;
        return total;

    }
}
