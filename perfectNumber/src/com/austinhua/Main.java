package com.austinhua;

public class Main {

    public static void main(String[] args) {
        isPerfectNumber(6);
        isPerfectNumber(5);
        isPerfectNumber(10);
    }

    public static boolean isPerfectNumber (int number){
        if (number < 1){
            System.out.println("false");
            return false;
        }

        int counter = 1;
        int checker = 0;

        while (counter < number){

            if(number % counter == 0) {
                checker = checker + counter;
            }
            counter++;
        }

        if (checker == number){
            System.out.println("true");
            return true;
        }

        System.out.println("false");
        return false;
    }
}
