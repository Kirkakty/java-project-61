package hexlet.code.Game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progressions {


    public String printRule() {
        return "What number is missing in the progression?";
    }

    public void play() {
        Engine.start(printRule());
        Random rn = new Random();
        while (!Engine.isFinished()) {
            var lengthOfNumbers = 5 + rn.nextInt(5);
            var progressionNumber = 1 + rn.nextInt(10);
            var firstNumber = rn.nextInt(30);
            var hiddenNumber = rn.nextInt(lengthOfNumbers);
            int answer = 0;
            String questionsNumbers = "";
            for (int i = 0; i <= lengthOfNumbers; i++) {
                firstNumber += progressionNumber;
                if (i == hiddenNumber) {
                    questionsNumbers = questionsNumbers + "..";
                    answer = firstNumber;
                } else {
                    questionsNumbers = questionsNumbers + " " + firstNumber + " ";
                }
            }
            Engine.getQuestions(questionsNumbers);
            String answerUser = Engine.getAnswer();

            Engine.check(answerUser, String.valueOf(answer));
            if (!answerUser.equals(String.valueOf(answer))) {
                return;
            }
            Engine.finishGame();
        }
    }
}