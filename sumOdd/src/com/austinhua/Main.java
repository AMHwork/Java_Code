package com.austinhua;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
        System.out.println(sumOdd(1,11));

    }

    public static boolean isOdd (int num){
        if (num < 0 ){
            return false;
        }

        if (num % 2 == 0){
            return false;
        }
        else {
            return true;
        }

    }

    public static int sumOdd (int start, int end){

        int total = 0;

        if (start <= 0 || end <= 0 || end < start){
            return -1;
        }

        for (int i = start; i <= end; i++){
            if (isOdd(i)){
                total += i;
            }
        }

        return total;
    }
}
