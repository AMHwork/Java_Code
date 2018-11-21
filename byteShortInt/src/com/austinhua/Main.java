package com.austinhua;

public class Main {

    public static void main(String[] args) {

        // with the intro to java 8, u can put underscores in between
        // numbers to increase readability.

        // int has a width of 32
        int smallestNumber = -2_147_483_648;
        int biggestNumber = 2_147_483_647;

        int intNumber = (biggestNumber/2);

        // byte has a width of 8
        byte smallestByte = -120;
        byte biggestByte = 127;

        // you need to do casting coz arithmetic is done in int
        byte byteNumber = (byte)(biggestNumber/2);

        // short has a width of 16
        short smallestShort = -32768;
        short biggestShort = 32767;

        short shortNumber = (short)(biggestShort/2);

        // long has a width of 64
        long smallestLong = -9_223_372_036_854_775_808L;
        long biggestLong = 9_223_372_036_854_775_807L;

        // don't need to case for long since its bigger than int
        long longNumber = (biggestLong/2);

    }
}
