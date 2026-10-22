package hexlet.code.Game;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {

    public String printRules() {
        return "What is the result of the expression?";
    }

    public void play() {
        int firstNumber;
        int secondNumber;
        int answerNumber = 0;
        char[] operators = {'+', '-', '*'};
        char operator;
        String questions;
        Engine.start(printRules());
        Random rn = new Random();
        while (!Engine.isFinished()) {
            firstNumber = rn.nextInt(100);
            secondNumber = rn.nextInt(100);
            operator = operators[rn.nextInt(3)];
            questions = firstNumber + " " + operator + " " + secondNumber;
            Engine.getQuestions(questions);
            String answer = Engine.getAnswer();
            switch (operator) {
                case '+':
                    answerNumber = firstNumber + secondNumber;
                    break;
                case '-':
                    answerNumber = firstNumber - secondNumber;
                    break;
                case '*':
                    answerNumber = firstNumber * secondNumber;
                    break;
                default:
                    System.out.println("Error");
            }
            Engine.check(answer, String.valueOf(answerNumber));
            if (!answer.equals(String.valueOf(answerNumber))) {
                return;
            }
            Engine.finishGame();
        }
    }
}
