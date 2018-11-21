package com.austinhua;

public class Main {

    public static void main(String[] args) {
        bark(true, 1);
        bark(false, 2);
        bark(true, 8);
        bark(true, -1);
        bark(true, 23);
        bark(true, 0);

    }

    public static boolean bark (boolean barking, int hourOfDay){

        if (hourOfDay >= 0 && hourOfDay < 24 && barking) {
            if (hourOfDay >= 8 && hourOfDay <= 22 && barking){
                System.out.println("false");
                return false;

            }
            else {
                System.out.println("true");
                return true;
            }
        }

        System.out.println("false");
        return false;
    }

}
