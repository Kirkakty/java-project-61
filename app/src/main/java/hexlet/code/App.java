package hexlet.code;
import hexlet.code.Game.Calc;
import hexlet.code.Game.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter. \n 1 - Greet \n 2 - Even \n 3 - Calc \n 0 - Exit");
        Scanner choise = new Scanner(System.in);
        System.out.println("Your choise: ");
        String numberOfGame = choise.nextLine();

        switch (numberOfGame) {
            case "0":
                System.out.println("Bye!");
                break;
            case "1":
                Cli greet = new Cli();
                greet.greet();
                break;
            case "2":
                Even game= new Even();
                game.start();
                break;
            case "3":
                Calc calc = new Calc();
                calc.start();
                break;
        }
    }
}
