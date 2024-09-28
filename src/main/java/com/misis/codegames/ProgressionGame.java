package com.misis.codegames;

import java.util.Random;
import java.util.Scanner;

public class ProgressionGame {
    public static void play() {
        Random rand = new Random();
        int start = rand.nextInt(10) + 1;
        int step = rand.nextInt(5) + 1;
        int length = rand.nextInt(6) + 5;

        // TODO //Done
        //int[] progression = new int[rand.nextInt(6) + 5];

        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + step * i;
        }
        int hidden_index = rand.nextInt(length);
        int corrextAnswer = progression[hidden_index];
        progression[hidden_index] = -1;

        System.out.println("Question: ");
        for(int num: progression) {
            if (num == -1){
                System.out.println(".. ");
            }else {
                System.out.println(num + " ");
            }
        }
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("\nYour answer: ");
        int answer = sc.nextInt();

        if (answer == corrextAnswer) {
            System.out.println("Correct!");
        }else {
            System.out.printf("'%d' is the wrong answer ;(. Correct answer was '%d'. Let's try again!\n", answer, corrextAnswer);
        }
    }
}