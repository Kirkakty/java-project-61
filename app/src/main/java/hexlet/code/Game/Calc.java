package hexlet.code.Game;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public int firstNumber;
    public int secondNumber;
    public int answerNumber;
    public char[] operators = {'+', '-', '*'};
    public char operator;
    public String questions;

    public String printRules() {
        return "What is the result of the expression?";
    }

    public void play() {
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
