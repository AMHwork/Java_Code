package com.austinhua;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 800;
	    int levelCompleted = 5;
	    int bonus = 100;

	    int highscore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highscore);

	    score = 10000;
	    levelCompleted = 8;
	    bonus = 200;

        highscore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highscore);

        // create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // you should display the players name along with a message like " Managed to get into position " and the
        // position they got and a further message " on the high score table".

        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is > 1000
        // 2 if the score is  > 500 and < 1000
        // 3 if the score is > 100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400, 50

        int position1 = calculateHighScorePosition(1500);
        displayHighScorePosition("Bob", position1);

        int position2 = calculateHighScorePosition(900);
        displayHighScorePosition("Jenny", position2);

        int position3 = calculateHighScorePosition(400);
        displayHighScorePosition("Liam", position3);

        int position4 = calculateHighScorePosition(50);
        displayHighScorePosition("Kevin", position4);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            //System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        else {
            return -1;
        }

    }

    public static void displayHighScorePosition (String name, int position){
        System.out.println(name + " managed to get into position " + position
         + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){

        int value = 4;

        if (score >= 1000){
            value = 1;
        }
        else if (score >= 500){
            value = 2;
        }
        else if (score >= 100){
            value = 3;
        }

        return value;

    }
}
