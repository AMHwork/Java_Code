package com.austinhua;

public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2050);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            int convertMB = kiloBytes / 1024;
            int convertKB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + convertMB + " MB and " + convertKB + " KB" );
        }

    }
}
