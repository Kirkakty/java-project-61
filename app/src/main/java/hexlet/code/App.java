package hexlet.code;

import hexlet.code.Game.*;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n 1 - Greet\n 2 - Even \n 3 - Calc " +
                "\n 4 - GCD \n 5 - Progression \n 6 - Prime \n 0 - Exit");
        System.out.print("Your choice: ");
        Scanner numberOfGame = new Scanner(System.in);
        String game = numberOfGame.nextLine();
        Engine engine = new Engine();
        Games games;
        switch (game) {
            case "1":
                Greet.greeting();
                break;
            case "0":
                System.out.println("Exit");
                break;
            case "2":
                games = new Even();
                Engine.runGame(games);
                break;
            case "3":
                games = new Calc();
                Engine.runGame(games);
                break;
            case "4":
                games = new GCD();
                Engine.runGame(games);
                break;
            case "5":
                games = new Progression();
                Engine.runGame(games);
                break;
            default:
                break;
        }
    }
}

