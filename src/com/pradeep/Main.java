package com.pradeep;

public class Main {

    public static void main(String[] args) {

	    boolean gameOver = true;
        int score = 8008;
        int levelCompleted = 5;
        int bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final Score Was " + finalScore);
        }

            boolean newgameOver = true;
            int newscore = 10000;
            int newlevelCompleted = 8;
            int newbonus = 200;


            if(newgameOver)  {
               int newfinalScore = newscore + (newlevelCompleted * newbonus );
               System.out.println("Your final Score Was " + newfinalScore);

            }


         score = 10000;
         levelCompleted = 8;
         bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final Score Was " + finalScore);
        }
    }
}
