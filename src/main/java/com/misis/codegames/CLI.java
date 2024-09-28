package com.misis.codegames;

import java.util.Scanner;

public class CLI {
    public static void greeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!\n", name);
    }
}
