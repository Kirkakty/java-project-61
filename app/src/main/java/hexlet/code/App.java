package hexlet.code;
import hexlet.code.Game.Calc;
import hexlet.code.Game.Even;
import hexlet.code.Game.GameInterface;
import hexlet.code.Game.NOD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter. \n 1 - Greet \n 2 - Even \n 3 - Calc \n 4 - NOD \n 0 - Exit");
        Scanner choise = new Scanner(System.in);
        System.out.println("Your choise: ");
        String numberOfGame = choise.nextLine();
        Engine engine = new Engine();
        GameInterface game;

        switch (numberOfGame) {
            case "0":
                System.out.println("Bye!");
                break;
            case "1":
                Cli greet = new Cli();
                greet.greet();
                break;
            case "2":
                game= new Even();
                engine.start(game);
                break;
            case "3":
                game = new Calc();
                engine.start(game);
                break;
            case "4":
                game = new NOD();
                engine.start(game);
                break;
        }
    }
}
