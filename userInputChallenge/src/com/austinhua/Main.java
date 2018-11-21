package com.austinhua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;

        System.out.println("Enter number #" + counter + ": ");
        int number = scanner.nextInt();

        while (number > 0){
            System.out.println("number #" + counter + " is " + number);
            counter++;
            System.out.println();
            System.out.println("Enter number #" + counter + ": ");
            number = scanner.nextInt();

        }

        scanner.close();

    }

    public static void solution2 () {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while(counter <= 10){
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
            }
            else {
                System.out.println("Invalid number");
            }

            scanner.nextLine();
        }

        System.out.println("sum = " + sum);
        scanner.close();
    }
}
