package com.austinhua;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175,3.176);
        areEqualByThreeDecimalPlaces(3.1756,3.175);
        areEqualByThreeDecimalPlaces(3.0,3.0);
    }

    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2){

        // this truncates the number without rounding
        num1 = (int)(num1*1000)/1000.0;
        num2 = (int)(num2*1000)/1000.0;

        if (num1 == num2){
            System.out.println("true");
            return true;
        }

        System.out.println("false");
        return false;

    }
}
