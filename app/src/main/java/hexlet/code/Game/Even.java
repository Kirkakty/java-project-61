package hexlet.code.Game;

import hexlet.code.Cli;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static int correctCount;
    public static int incorrectCount;

    public static void evenGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        Random rn = new Random();
        int number = rn.nextInt(120);
        System.out.println("Question : " + number);
        System.out.print("Your answer: ");
        Scanner scEven = new Scanner(System.in);
        String evenAnswer = scEven.nextLine();
        switch (evenAnswer) {
            case "yes":
                if (number % 2 == 0) {
                    System.out.println("Correct!");
                    correctCount++;
                } else {
                    System.out.println("'yes' is wrong answer :(. Correct answer was 'no'");
                    incorrectCount++;
                }
                break;
            case "no":
                if (number % 2 != 0) {
                    System.out.println("Correct!");
                    correctCount++;
                } else {
                    System.out.println("'no' is wrong answer :(. Correct answer was 'yes'");
                    incorrectCount++;
                }
                break;
            default:
                if (number % 2 == 0) {
                    System.out.println("'" + evenAnswer + "' is wrong answer :(. Correct answer was 'yes");
                    incorrectCount++;
                } else {
                    System.out.println("'" + evenAnswer + "' is wrong answer :(. Correct answer was 'no");
                    incorrectCount++;
                }
                break;
        }
        if (incorrectCount > 0) {
            System.out.println("Let's try again, " + Cli.getName());
        } else if (correctCount < 3) {
            Even.evenGame();
        } else {
            System.out.println("Congratulation," + Cli.getName() + "!");
        }

    }
}
