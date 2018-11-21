package com.austinhua;

public class Main {

    public static void main(String[] args) {

//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        // increment from 2 - 8
        for (int i = 2; i < 9; i++){
            System.out.println("10,000 at "+ i +"% interest = " + String.format("%.2f",
                    calculateInterest(10000.0, i)));
        }

        System.out.println();

        // de-increment from 8 - 2
        for (int i = 8; i > 1; i--){
            System.out.println("10,000 at "+ i +"% interest = " + String.format("%.2f",
                    calculateInterest(10000.0, i)));
        }

        System.out.println();

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint: use break; statement to exit

        int count = 0;
        for (int i = 30; i < 100; i++){
            if (isPrime(i)){
                count++;
                System.out.println("number " + i + " is prime");
                if (count == 3){
                    break;
                }
            }
        }


    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }

//        for (int i=2; i <= n/2; i++){
//            if(n % i == 0){
//                return false;
//            }
//        }

        // This is better optimised
        for (int i=2; i <= (long)Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
