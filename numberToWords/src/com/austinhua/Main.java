package com.austinhua;

public class Main {

    public static void main(String[] args) {
        //System.out.println(getDigitCount(0));
        //System.out.println(reverse(-1123));
        //numberToWords(1010);
        numberToWords(101000102);
    }

    public static int getDigitCount (int number){
        int counter = 0;

        if (number < 0){
            return -1;
        }

        while (number > 0){
            int amount = number % 10;
            counter++;
            number /= 10;
        }

        if (counter == 0){
            counter += 1;
        }

        return counter;

    }

    public static int reverse (int number){
        //int length = getDigitCount(number);
        int reverseNum = 0;

        while (number != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + number % 10;
            number = number / 10;
        }

        return reverseNum;
    }

    public static void numberToWords (int number){
        int reverseNum = reverse(number);
        int counter = 0;
        int zeroCounter = 0;
        int checker;

        if (number < 0){
            System.out.println("Invalid Value");
        }

        while (number > 0){
            int amount = reverseNum % 10;
            int checkNum = number % 10;

            if (checkNum == 0){
                zeroCounter++;
            }

            switch (amount){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            counter++;

            if (zeroCounter > 0){
                checker = reverseNum % 10;
                if (checker % 10 == 0){
                    System.out.println("Zero");
                }
            }

            reverseNum /= 10;
            number /= 10;

        }

    }

}
