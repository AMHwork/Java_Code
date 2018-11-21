package com.austinhua;

public class Main {

    public static void main(String[] args) {
	    char myChar = 'd';
	    // how to get special characters in this case it copywrite sign
	    char uniChar = '\u00A9';

        System.out.println("copyright symbol is = " + uniChar);

        boolean myBoolean = false;

        // 1. Find the code for the registered symbol on the same line as the copyright symbol
        // 2. Create a variable of type char and assign it the unicode value for that symbol
        // 3. Display on the screen

        char uniChar2 = '\u00AE';
        System.out.println("registered symbol is = " + uniChar2);


    }
}
