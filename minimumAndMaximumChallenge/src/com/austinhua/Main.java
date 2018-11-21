package com.austinhua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
//        boolean flag = true;

        while(true){

            System.out.println("Enter number:");
            boolean hasNextNum = scanner.hasNextInt();

            if (hasNextNum){
                int number = scanner.nextInt();

                // using a flag to determine the first condition
//                if (flag){
//                    flag = false;
//                    min = number;
//                    max = number;
//                }

                if (min == 0 && max == 0){
                    min = number;
                    max = number;
                }

                if (number > max){
                    min = number;
                }
                if (number < min){
                    max = number;
                }

            }
            else {
                System.out.println("Invalid Number");
                break;
            }

            scanner.nextLine();

        }

        System.out.println("min number is: " + min);
        System.out.println("max number is: " + max);

        scanner.close();

    }
}
