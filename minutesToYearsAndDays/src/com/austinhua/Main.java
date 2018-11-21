package com.austinhua;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-561600);

    }

    public static void printYearsAndDays (long minutes){

        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        else {

            long years;
            long remainsMins;
            long days;

            years = minutes / 525600;
            remainsMins = minutes % 525600;
            days = remainsMins / 1440;

            System.out.println( minutes + " min = " + years + " y " + "and " + days + " d");

        }



    }


}