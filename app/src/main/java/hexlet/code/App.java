package hexlet.code;

import hexlet.code.Game.Even;
import hexlet.code.Game.Greet;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n 1 - Greet\n 2 - Even \n 0 - Exit");
        System.out.print("Your choice: ");
        Scanner numberOfGame = new Scanner(System.in);
        String game = numberOfGame.nextLine();
        switch (game) {
            case "1":
                Greet.greeting();
                break;
            case "0":
                System.out.println("Exit");
                break;
            case "2":
                Greet.greeting();
                Even.evenGame();
                break;
            default:
                break;
        }
    }
}

