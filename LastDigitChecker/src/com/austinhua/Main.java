package com.austinhua;

public class Main {

    public static void main(String[] args) {

        hasSameLastDigit(41,22,71);
        hasSameLastDigit(123,456,789);
        hasSameLastDigit(23,32,42);
        hasSameLastDigit(9,99,999);

    }

    public static boolean hasSameLastDigit (int num1, int num2, int num3){
        if (num1 < 10 || num1 > 1000 ||
            num2 < 10 || num2 > 1000 ||
            num3 < 10 || num3 > 1000) {

            System.out.println("false");
            return false;
        }

        int firstnum1 = 0;
        int firstnum2 = 0;
        int firstnum3 = 0;

        int middlenum1 = 0;
        int middlenum2 = 0;
        int middlenum3 = 0;

        int lastnum1 = num1 % 10;
        int lastnum2 = num2 % 10;
        int lastnum3 = num3 % 10;

        while (num1 > 0){
            firstnum1 = num1 % 10;
            num1 /= 10;
            if (num1 > 10){
                middlenum1 = num1 % 10;
            }
        }

        while (num2 > 0){
            firstnum2 = num2 % 10;
            num2 /= 10;
            if (num2 > 10){
                middlenum2 = num2 % 10;
            }
        }

        while (num3 > 0){
            firstnum3 = num3 % 10;
            num3 /= 10;
            if (num3 > 10){
                middlenum3 = num3 % 10;
            }
        }

//        // first digit
//        System.out.println(firstnum1);
//        System.out.println(middlenum1);
//        System.out.println(lastnum1);
//
//        // second digit
//        System.out.println(firstnum2);
//        System.out.println(middlenum2);
//        System.out.println(lastnum2);
//
//        // third digit
//        System.out.println(firstnum3);
//        System.out.println(middlenum3);
//        System.out.println(lastnum3);


        if (firstnum1 == firstnum2 || firstnum1 == firstnum3 ||
                firstnum1 == middlenum2 || firstnum1 == middlenum3 ||
                firstnum1 == lastnum2 || firstnum1 == lastnum3){
            System.out.println("true");
            return true;
        }

        if (middlenum1 == firstnum2 || middlenum1 == firstnum3 ||
                middlenum1 == middlenum2 || middlenum1 == middlenum3 ||
                middlenum1 == lastnum2 || middlenum1 == lastnum3){
            System.out.println("true");
            return true;
        }

        if (lastnum1 == firstnum2 || lastnum1 == firstnum3 ||
                lastnum1 == middlenum2 || lastnum1 == middlenum3 ||
                lastnum1 == lastnum2 || lastnum1 == lastnum3){
            System.out.println("true");
            return true;
        }

        // checks for all possible cases for each of the three numbers
        System.out.println("false");
        return false;

    }
}
