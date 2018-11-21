package com.austinhua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // call scanner class
        Scanner scanner = new Scanner(System.in);

        // enter your date of birth year e.g 1995
        System.out.println("Enter your DOB: ");

        // checks if the input is numbers only
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){

            int yearOfBirth = scanner.nextInt();

            // is needed to stop skipping
            scanner.nextLine();

            // enter your name e.g austin
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            // convert the year to age
            int age = 2018 - yearOfBirth;

            if (age >= 0 && age <= 100){
                // print result
                System.out.println("Your name is " + name + " and you are " + age + " years old");
            }
            else {
                System.out.println("Invalid year of birth");
            }
        }
        else {
            System.out.println("Unable to parse year of birth");
        }

        // close scanner when done
        scanner.close();


        // print result
        //System.out.println("Your name is " + name + " and you are " + age + " years old");

    }
}
