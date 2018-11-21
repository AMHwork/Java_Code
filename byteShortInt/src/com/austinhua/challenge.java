package com.austinhua;

public class challenge {

    public static void main(String[] args) {

        // 1.Create a byte variable and set it to any valid byte number.
        // 2.Create a short variable and set it to any valid short number.
        // 3.Create a int variable and set it to any valid int number.
        // 4.Create a long variable and make it equal to
        //   50000 + 10 times the sum of the byte, short and int.

        short number2 = 666;
        byte number3 = 120;
        int number1 = 100000;

        long number4 = 50000 + 10L *(number1 + (number2) + (number3));

        System.out.println(number4);

        byte num1 = 10;
        short num2 = 20;
        int num3 = 30;

        short num4 = (short)(1000 + 10*(num1 + num2 + num3));

        System.out.println(num4);

    }
}
