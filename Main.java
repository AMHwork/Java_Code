package com.austinhua;

public class Main {

    public static void main(String[] args) {
        double result;

        result = area(5.0);
        System.out.println(result);

        result = area(-1);
        System.out.println(result);

        result = area(5.0, 4.0);
        System.out.println(result);

        result = area(-1.0,4.0);
        System.out.println(result);


    }

    public static double area (double radius){
        if (radius < 0){
            return -1;
        }

        double area = Math.PI * (radius * radius);
        return area;
    }

    public static double area (double x, double y){
        if (x < 0 || y < 0){
            return -1;
        }

        double area = x * y;
        return area;
    }
}
