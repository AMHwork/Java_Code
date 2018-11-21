package com.austinhua;

public class Main {

    public static void main(String[] args) {

        //Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters
        // feet is the first parameter, inches is the 2nd parameter

        //You should validate that the first parameter feet is >= 0
        //you should validate that the second parameter inches is >= 0 and <= 12
        // return -1 from the method if either of the above is not true

        // If the parameters are valid, then calculate how many centimeters
        // comprise the feet and inches passed to this method and return
        // that value.

        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate that its >= 0
        // return -1 if it is not true
        // but if its valid, then calculate how many feet are in inches
        // and then here is the tricky part
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        // hint: use double for your number datatypes is probably a good idea
        // 1 inch = 2.54cm and one foot = 12 inches
        // use the link I give you to confirm your code is calculating correctly.
        // Calling another overloaded method just requires you to use the right
        // number of parameters.

        double num1 = calcFeetAndInchesToCentimeters(6, 8);
        double num2 = calcFeetAndInchesToCentimeters(157);

        System.out.println("first 1 is " + num1 + "cm");
        System.out.println("second 1 is " + num2 + "cm");


    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && inches >= 0 && inches <= 12 ){
            //1 inch = 2.54cm
            //1 foot = 12 inches

            double inchToCent = inches * 2.54;
            double footToCent = (feet * 12) * 2.54;
            double total = inchToCent + footToCent;

            System.out.println("inches is " + inchToCent);
            System.out.println("feet is " + footToCent);

            return total;

        }
        else {
            return -1;
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            //1 inch = 2.54cm
            //1 foot = 12 inches
            // feet are in inches

            double Feet = (int) inches / 12;
            double remainderInches = (int) inches % 12;
            System.out.println("inches to feet is " + Feet + " remainder inches is " + remainderInches);

            return calcFeetAndInchesToCentimeters(Feet, remainderInches);

        } else {
            return -1;
        }
    }
}
