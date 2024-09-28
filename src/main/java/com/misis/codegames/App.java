package com.misis.codegames;

public class App {
    public static void main(String[] args) {
        CLI.greeting();

        if (args.length > 0) {
            String gameType = args[0];
            switch (gameType) {
                case "lcm":
                    LCMGame.play();
                    break;
                case "progression":
                    ProgressionGame.play();
                    break;
                default:
                    System.out.println("Invalid game type.");
            }
        } else {
            System.out.println("No game selected.");
        }
    }
}
