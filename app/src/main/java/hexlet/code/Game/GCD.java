package hexlet.code.Game;

import java.util.Random;
import java.util.Scanner;

public class GCD implements Games<Integer> {
    public static int correctCount = 0;
    public int inputAnswer;
    public int correctAnswer;
    public int firstNumber;
    public int secondNumber;
    public boolean isCorrectAnswer;
    public int result = 0;
    @Override
    public void start() {
        getQuestion();
        setAnswer();
        check(firstNumber, secondNumber, inputAnswer);
    }

    @Override
    public void printRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    @Override
    public Integer getAnswer() {
        return inputAnswer;
    }

    @Override
    public Integer getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public int getCountCorrectAnswer() {
        return correctCount;
    }

    @Override
    public boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }


    public void getQuestion() {
        Random rn = new Random();
        firstNumber = rn.nextInt(100);
        secondNumber = rn.nextInt(100);
        System.out.println(firstNumber + " " + secondNumber);
        System.out.print("Your answer: ");
    }
    public void setAnswer() {
        Scanner sc = new Scanner(System.in);
        inputAnswer = sc.nextInt();
    }

    public int solution(int x, int y) {
        for (int i = 100; i >= 1; i--) {
            if (x % i == 0 && y % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
    public void check(int x, int y, int answer) {
        if (solution(x, y) == answer) {
            isCorrectAnswer = true;
            correctCount++;
        } else {
            isCorrectAnswer = false;
            correctAnswer = solution(x, y);
        }
    }
}

