package com.austinhua;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-252));
    }

    public static int getEvenDigitSum (int number){

        if (number < 0){
            return -1;
        }

        int total = 0;
        int digit;

        while (number > 0){

            digit = number % 10;
            //System.out.println(digit);
            if (digit % 2 == 0){
                total += digit;
            }

            number /= 10;
        }

        return total;
    }
}
