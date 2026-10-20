package hexlet.code.Game;

import java.util.Random;
import java.util.Scanner;

public class NOD implements GameInterface {

    public boolean isCorrectAnswer;
    public int correctCount;
    public int answer;
    public int firstNumber;
    public int secondNumber;
    public int result;
    public int correctAnswer;

    @Override
    public void start() {
        getQuestions();
        setAnswer();
        checkAnswer(firstNumber, secondNumber, answer);
    }

    public void setAnswer() {
        Scanner sc = new Scanner(System.in);
        answer = sc.nextInt();
    }

    public void getQuestions() {
        Random rn = new Random();
        firstNumber = 1 + rn.nextInt(119);
        secondNumber = 1 + rn.nextInt(119);
        System.out.print("Question: " + firstNumber + " " + secondNumber + "\n Your answer: ");
    }

    public int resultMath(int x, int y) {
        for (int i = 120; i >= 0; i--) {
            if (x % i == 0 && y % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

    public void checkAnswer(int x, int y, int answer) {
        if (resultMath(x, y) == answer) {
            isCorrectAnswer = true;
            correctCount++;
        } else {
            isCorrectAnswer = false;
            correctAnswer = result;
        }
    }

    @Override
    public String getAnswer() {
        return String.valueOf(answer);
    }

    @Override
    public String getCorrectAnswer() {
        return String.valueOf(result);
    }

    @Override
    public void printRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    @Override
    public boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }

    @Override
    public int getCountCorrectAnswer() {
        return correctCount;
    }
}
