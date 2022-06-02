package com.zinkworks;

public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Ruth", position);
        int position2 = calculateHighScorePosition(900);
        displayHighScorePosition("Jack", position2);
        int position3 = calculateHighScorePosition(400);
        displayHighScorePosition("Jane", position3);
        int position4 = calculateHighScorePosition(50);
        displayHighScorePosition("Paul", position4);

        // Speed converter challenge
        SpeedConverter.printConversion(10.5);

        // MegaByte converter challenge
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        // Calculate challenge
        calcFeetAndInchesToCm(7,5);
        calcFeetAndInchesToCm(100);

        // Seconds and mins challenge
        System.out.println(getDurationString(65,44));
        System.out.println(getDurationString(0,-1));
        System.out.println(getDurationString(3945));

        // Area calculator challenge
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5.0, 4.0));
        System.out.println(AreaCalculator.area(-1.0, 4.0));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int result = -1;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            result = finalScore;
        }

        return result;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
        int result = 4;
        if (score >= 1000) {
            result = 1;
        } else if (score >= 500) {
            result = 2;
        } else if (score >= 100) {
            result = 3;
        }
        return result;
    }

    public static double calcFeetAndInchesToCm(double feet, double inches) {
        double result = feet * 12 * 2.54 + inches * 2.54;
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches");
            result = -1;
        }
        System.out.println(feet + " feet, " + inches + " inches = " + result + " cm");
        return result;
    }

    public static double calcFeetAndInchesToCm(double inches) {
        double result = -1;

        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainder = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainder + " inches");
            result = calcFeetAndInchesToCm(feet, remainder);
        }
        return result;
    }

    // Overloaded methods for seconds and mins challenge
    public static String getDurationString(int mins, int seconds) {
        String result = "Invalid value";

        if (mins >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = mins / 60;
            int remainder = mins % 60;
            result = hours + "h " + remainder + "m " + seconds + "s";
        }
        return result;
    }

    public static String getDurationString(int seconds) {
        String result = "Invalid value";

        if (seconds >= 0) {
            int mins = seconds / 60;
            int remainder = seconds % 60;
            result = getDurationString(mins, remainder);
        }
        return result;
    }
}