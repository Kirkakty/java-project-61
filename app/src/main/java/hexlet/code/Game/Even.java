package hexlet.code.Game;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Even {

    public static void play() {
        int numberQuest = 0;
        System.out.print("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random rn = new Random();
        int countRounds = 0;
        while (countRounds < 3) {
            numberQuest = rn.nextInt(100);
            String question = String.valueOf(numberQuest);
            String correctAnswer = "";
            if (isEven(numberQuest)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            if (!Engine.greet(question, correctAnswer, name)) {
                return;
            }
            countRounds++;
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
