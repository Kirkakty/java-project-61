package hexlet.code.Game;

import java.util.Random;
import java.util.Scanner;

public class Prime implements Games<String> {
    public static int primeNumber;
    public static int correctCount;
    public boolean isCorrectAnswer;
    public static String inputAnswer;
    public static String correctAnswer;
    public int countOfDivide;

    @Override
    public void start() {
        getQuestion();
        setAnswer();
        check(primeNumber, inputAnswer);
    }

    @Override
    public void printRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
    public void getQuestion() {
        Random rn = new Random();
        primeNumber = 1 + rn.nextInt(100);
        System.out.println("Question: " + primeNumber);
        System.out.print("Your answer: ");
    }
    public void setAnswer() {
        Scanner sc = new Scanner(System.in);
        inputAnswer = sc.nextLine();
    }
    public int solution(int x) {
        countOfDivide = 0;
        for (var i = 1; i <= x; i++) {
            if (x % i == 0) {
                countOfDivide++;
            }
        }
        return countOfDivide;
    }
    public void check(int x, String answer) {
        switch (answer) {
            case "yes":
                if (solution(x) == 2) {
                    isCorrectAnswer = true;
                    correctCount++;
                } else {
                    isCorrectAnswer = false;
                    correctAnswer = "no";
                }
                break;
            case "no":
                if (solution(x) != 2) {
                    isCorrectAnswer = true;
                    correctCount++;
                } else {
                    isCorrectAnswer = false;
                    correctAnswer = "yes";
                }
                break;
            default:
                isCorrectAnswer = false;
                if (solution(x) == 2) {
                    correctAnswer = "yes";
                } else {
                    correctAnswer = "no";
                }
                break;
        }
    }
    @Override
    public String getAnswer() {
        return inputAnswer;
    }

    @Override
    public String getCorrectAnswer() {
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
}
