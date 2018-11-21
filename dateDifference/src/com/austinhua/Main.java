package com.austinhua;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        // split the string to days, months, years
        // calculate the days using three functions
        // calculate the total of the two dates
        // find the difference
        // return results

        Scanner scanner = new Scanner(System.in);

        // global variables for storing each part of the date
        int day1, month1, year1;
        int day2, month2, year2;

        // loop until a valid date is placed, else print error message and re-enter
        while(true){
            System.out.println("Please enter date1 in this format DD/MM/YYYY ");
            String input1 = scanner.next();

            // regex is precise, if the number is less than 9 it needs a 0 in front
            boolean b1 = Pattern.matches("(0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[012])/([0-9]{4})", input1);

            if (b1){
                // break the string and convert to integers
                String[] date1 = input1.split("/", 3); // collect only 3 numbers in total
                String string1 = date1[0];
                day1 = Integer.parseInt(string1);
                String string2 = date1[1];
                month1 = Integer.parseInt(string2);
                String string3 = date1[2];
                year1 = Integer.parseInt(string3);
                break;
            }
            else {
                System.out.println("The format is wrong please enter again");
            }
            scanner.nextLine();
        }

        // loop until a valid date is placed, else print error message and re-enter
        while(true){
            System.out.println("Please enter date2 in this format DD/MM/YYYY ");
            String input2 = scanner.next();

            // regex is precise, if the number is less than 9 it needs a 0 in front
            boolean b2 = Pattern.matches("(0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[012])/([0-9]{4})", input2);

            if (b2){
                // break the string and convert to integers
                String[] date2 = input2.split("/", 3); // collect only 3 numbers in total
                String string4 = date2[0];
                day2 = Integer.parseInt(string4);
                String string5 = date2[1];
                month2 = Integer.parseInt(string5);
                String string6 = date2[2];
                year2 = Integer.parseInt(string6);
                break;
            }
            else {
                System.out.println("The format is wrong please enter again");
            }
            scanner.nextLine();
        }

        // calculate the total amount of days in date 1
        int resultDay1 = calculatesDaysToDays(day1);
        int resultMonth1 = calculateMonthsToDays(month1, year1);
        int resultYear1 = calculateYearsToDays(year1);

        // calculate the total amount of days in date 2
        int resultDay2 = calculatesDaysToDays(day2);
        int resultMonth2 = calculateMonthsToDays(month2, year2);
        int resultYear2 = calculateYearsToDays(year2);

        // add all the days together
        int resultDate1 = calculateTotalDays(resultDay1, resultMonth1, resultYear1);
        int resultDate2 = calculateTotalDays(resultDay2, resultMonth2, resultYear2);

        // find the difference
        int difference = calculateDifference(resultDate1, resultDate2);

        // print out result
        System.out.println("The difference between these dates in days is: " + difference);

        scanner.close();

    }

    // function to check if the year is a leap year
    public static boolean isLeapYear (int year){
        if (year >= 0 && year <= 9999){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                return true;
            }
        }
        return false;
    }

    // function to convert years into days
    public static int calculateYearsToDays (int year){
        int i = 0;
        int totalYearDays = 0;

        for(i = 0; i < year; i++){
            if (isLeapYear(i)){
                totalYearDays += 366;
            }
            else {
                totalYearDays += 365;
            }
        }
        return totalYearDays;
    }

    // function to convert months into days
    public static int calculateMonthsToDays (int month, int year){
        int i = 0;
        int totalMonthDays = 0;

        for(i = 0; i < month; i++){
            if (i == 1 || i == 3 || i == 5 ||
            i == 7 || i == 8 || i == 10 || i == 12){
                totalMonthDays += 31;
            }
            else if (i == 2){
                if (isLeapYear(year)){
                    totalMonthDays += 29;
                }
                else {
                    totalMonthDays += 28;
                }
            }
            else {
                totalMonthDays += 30;
            }
        }
        return totalMonthDays;
    }

    // function to convert days into days
    // a bit redundant but it's there for consistency
    public static int calculatesDaysToDays (int day){
        return day;
    }

    // function to calculate the total amount of days from the date
    public static int calculateTotalDays (int day, int month, int year){
        return day + month + year;
    }

    // function to find the difference between date 1 and date 2
    public static int calculateDifference (int date1, int date2){
        return date2 - date1;
    }
}