package hexlet.code.Game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public int result = 0;

    public static String printRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    public void play() {
        Random rn = new Random();
        Engine.start(printRule());
        while (!Engine.isFinished()) {
            int firstNumber = 1 + rn.nextInt(100);
            int secondNumber = 1 + rn.nextInt(100);
            String questions = firstNumber + " " + secondNumber;
            Engine.getQuestions(questions);
            String answer = Engine.getAnswer();
            for (int i = 100; i >= 0; i--) {
                if (firstNumber % i == 0 && secondNumber % i == 0) {
                    result = i;
                    break;
                }
            }
            Engine.check(answer, String.valueOf(result));
            if (!answer.equals(String.valueOf(result))) {
                return;
            }
            Engine.finishGame();
        }
    }
}