package com.misis.codegames;

import java.util.Random;
import java.util.Scanner;

public class LCMGame {
    public static void play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the smallest common multiple of given numbers.");
        //
        Random rand  = new Random();
        int num1 = rand.nextInt(100) + 1;
        int num2 = rand.nextInt(100) + 1;
        int num3 = rand.nextInt(100) + 1;
        // f!
        System.out.printf("Question: %d %d %d\n", num1, num2, num3);
        int userAnswer = sc.nextInt();
        int correctAnswer = Least_Common_Multiple(Least_Common_Multiple(num1, num2), num3);

        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
        }else {
            System.out.printf("'%d' is the wrong answer ;(. Correct answer was '%d'. Let's try again!\n", userAnswer, correctAnswer);
        }
    }
    private static int Least_Common_Multiple(int a, int b) {
        return a * (b/Greatest_Common_Divisor(a,b));
    }

    private static int Greatest_Common_Divisor(int a, int b) {
        return b == 0 ? a : Greatest_Common_Divisor(b, a % b);
    }
}