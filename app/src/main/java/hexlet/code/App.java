package hexlet.code;

import hexlet.code.Game.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println(
                "Please enter the game number and press Enter. \n 1 - Greet \n 2 - Even \n 3 - Calc "
                        + "\n 4 - GCD \n 5- Progression \n 6 - Prime \n 0 - Exit");
        Scanner choice = new Scanner(System.in);
        System.out.println("Your choice: ");
        String numberOfGame = choice.nextLine();

        switch (numberOfGame) {
            case "0":
                System.out.println("Bye!");
                break;
            case "1":
                Cli greet = new Cli();
                greet.greet();
                break;
            case "2":
                new Even().play();
                break;
            case "3":
                new Calc().play();
                break;
            case "4":
                new GCD().play();
                break;
            case "5":
                new Progression().play();
                break;
            case "6":
                new Prime().play();
                break;
            default:
                System.out.println("Wrong button, Bye!");
                break;
        }
    }
}
