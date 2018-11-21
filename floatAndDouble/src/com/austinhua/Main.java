package com.austinhua;

public class Main {

    public static void main(String[] args) {
        int value = 5;
        float value2 = 5f / 3f;
        double value3 = 5d / 3d;

        System.out.println("my int value = " + value);
        System.out.println("my float value = " + value2);
        System.out.println("my double value = " + value3);

        // Convert a given number of pounds into kilograms
        // 1. Create a variable to store pounds
        // 2. Calculate the number of kilograms for the number
        // 3. print out the result

        // note 1 pound is equal to 0.45359237

        double pounds = 200;
        double conversion = pounds * 0.45359237;

        System.out.println("the conversion from pounds to kilo's is: " + conversion);



    }
}
