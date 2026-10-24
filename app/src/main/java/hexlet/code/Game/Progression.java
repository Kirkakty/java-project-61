package hexlet.code.Game;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public void play() {
        System.out.print("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?");
        Random rn = new Random();
        int countRounds = 0;
        while (countRounds < 3) {
            var lengthOfNumbers = 5 + rn.nextInt(5);
            var progressionNumber = 1 + rn.nextInt(10);
            var firstNumber = rn.nextInt(30);
            var hiddenNumber = rn.nextInt(lengthOfNumbers);
            String questionsNumbers = "";
            for (int i = 0; i <= lengthOfNumbers; i++) {
                firstNumber += progressionNumber;
                if (i == hiddenNumber) {
                    questionsNumbers = questionsNumbers + ".. ";
                } else {
                    questionsNumbers = questionsNumbers + firstNumber + " ";
                }
            }
            int answerNumber =
                    answer(firstNumber, hiddenNumber, lengthOfNumbers, progressionNumber);
            if (!Engine.greet(questionsNumbers, String.valueOf(answerNumber), name)) {
                return;
            }
            countRounds++;
        }
    }

    public int answer(int firstNumber, int hidden, int length, int progression) {
        int beforeEnd = length - hidden;
        return firstNumber - beforeEnd * progression;
    }
}
