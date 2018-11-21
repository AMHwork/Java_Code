package com.austinhua;

public class Main {

    public static void main(String[] args) {
        canPack(1,0,4); // false;
        canPack(1,0,5); // true;
        canPack(0,5,4); // true;
        canPack(2,2,12); // true;
        canPack(-3,2,12); // false;
        canPack(2,1,5); // true;
        canPack(2,10,18); // true;
        canPack(4,18,19); // true;
        canPack(0,5,6); // false;
        canPack(6,2,7); // true;

    }

    public static boolean canPack (int bigCount, int smallCount, int goal){

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            System.out.println("false");
            return false;
        }

        // checks for all conditions with big count
        for (int i = 0; i < bigCount; i++){
            goal = goal - 5;
            if (goal == 0){
                System.out.println("true");
                return true;
            }
            if (goal < 0){
                System.out.println("false");
                return false;
            }
            if (goal - smallCount <= 0){
                System.out.println("true");
                return  true;
            }
        }

        // checks for conditions if there is no big count
        goal = goal - smallCount;

        if (goal > 0){
            System.out.println("false");
            return false;
        }

        System.out.println("true");
        return true;

    }
}
