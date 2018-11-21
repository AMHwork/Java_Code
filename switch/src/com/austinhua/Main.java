package com.austinhua;

public class Main {

    public static void main(String[] args) {

//        int value = 1;
//        if(value == 1){
//            System.out.println("Value was 1");
//        }
//        else if (value == 2){
//            System.out.println("Value was 2");
//        }
//        else {
//            System.out.println("Was not 1 or 2");
//        }


        int switchValue = 1;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            // fast way to do cases, if you want to group together
            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                break;

            default:
                System.out.println("Value was not 1 or 2");
                break;

        }


        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char switchChar = 'A';

//        switch(switchChar){
//            case 'A':
//                System.out.println("The letter was A");
//                break;
//
//            case 'B':
//                System.out.println("The letter was B");
//                break;
//
//            case 'C':
//                System.out.println("The letter was C");
//                break;
//
//            case 'D':
//                System.out.println("The letter was D");
//                break;
//
//            case 'E':
//                System.out.println("The letter was E");
//                break;
//
//            default:
//                System.out.println("The letter is not A-E");
//                break;
//        }

        switch(switchChar){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(switchChar + " was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D, E");
                break;
        }
    }
}
