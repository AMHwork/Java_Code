package com.austinhua;

public class Main {

    public static void main(String[] args) {
        int result = 100 + 2;
        System.out.println(result);

        int prevResult = result;
        result = result - 1;

        System.out.println(prevResult + " - 1 = " + result);

        prevResult = result;
        result = result * 10;

        System.out.println(prevResult + " * 10 = " + result);

        prevResult = result;
        result += 2;

        System.out.println(prevResult + " + 2 = " + result);

        prevResult = result;
        result -= 2;

        System.out.println(prevResult + " - 2 = " + result);

        prevResult = result;
        result *= 2;

        System.out.println(prevResult + " * 2 = " + result);

        prevResult = result;
        result /= 2;

        System.out.println(prevResult + " / 2 = " + result);

        boolean isCar = false;
        if(isCar){
            System.out.println("this is false");
        }

        isCar = true;
        //ternary operator
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }

        // 1. Create a double variable with a value of 20 type double
        // 2. Create a second variable with a value of 80 type double
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to find the remainder from the sum of #3 divided by 40
        // 5. write an if statement that displays a message "total was over the limit"
        // if the remainder of #4 is equal to 20 or less

        double var1 = 20;
        double var2 = 80;
        double var3 = (var1 + var2) * 25;
        System.out.println(var3);
        double var4 = var3 % 40;
        System.out.println(var4);

        if (var4 <= 20){
            System.out.println("total was over the limit");
        }







    }
}
