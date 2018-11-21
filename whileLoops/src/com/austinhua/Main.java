package com.austinhua;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6){
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println();

        for (count = 1; count != 6; count++){
            System.out.println("Count value is " + count);
        }

        System.out.println();

        count = 1;
        while(true){
            if (count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println();

        // do while loop
        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);

        System.out.println();

        int number = 4;
        int finishNumber = 20;
        int totalNum = 0;
        int counter = 0;

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }

            totalNum += number;

            if (counter == 5){
                break;
            }
            System.out.println("even number = " + number);
            counter++;
            //System.out.println("even number = " + number);
        }

        System.out.println("total Even Number = " + totalNum);




    }

    public static boolean isEvenNumber ( int num ){
        if (num % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
