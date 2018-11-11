package com.Qaiyyum;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int myScore = 500;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, myScore, levelCompleted, bonus);
        System.out.println("highScore = " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("james", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("timber", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("aku", highScorePosition);


        


        myScore = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, myScore, levelCompleted, bonus);
        System.out.println("highScore = " + highScore);


    }

    public static int calculateScore(boolean gameOver, int myScore, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = myScore + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else
            return -1;
    }

        public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " " + "manage to get into " + highScorePosition + " " + "position");

    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000)
            return 1;

        else if(playerScore >= 500 && playerScore < 1000)
            return 2;

        else if(playerScore >= 100 && playerScore < 500)
            return 3;

        else {
            return 4;
        }


    }
}