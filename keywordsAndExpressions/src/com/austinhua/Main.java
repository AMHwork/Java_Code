package com.austinhua;

public class Main {

    public static void main(String[] args) {

        // a mile is equal to 1.609344 kilometers

        double kilometers = (100 * 1.609344);
        double highscore = 50;
        if (highscore == 50){
            System.out.println("this is valid");
        }


        // print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout is still avliable

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was: " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was: " + finalScore);
        }


    }
}
