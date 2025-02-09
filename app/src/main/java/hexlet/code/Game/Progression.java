package hexlet.code.Game;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Progression implements Games<Integer>{

    public static int countOfNumber;
    public static int correctCount = 0;
    public static int progressionNumber;
    public static int correctAnswer;
    public static int inputAnswer;
    public static int hiddenNumber;
    public static int number;
    public static boolean isCorrectAnswer;

    @Override
    public void start() {
        getQuestion();
        setAnswer();
        check(correctAnswer,inputAnswer);
    }

    @Override
    public void printRules() {
        System.out.println("What number is missing in the progression?");
    }
    public void getQuestion() {
        Random rn = new Random();
        correctAnswer = 0;
        countOfNumber = 5 + rn.nextInt(5);
        progressionNumber = rn.nextInt(20);
        number = rn.nextInt(30);
        hiddenNumber = rn.nextInt(countOfNumber);
        for (int i = 0; i < countOfNumber; i++) {
            number += progressionNumber;
            if (i == hiddenNumber) {
                System.out.print(".. ");
                correctAnswer += number;
            } else {
                System.out.print(number + " ");
            }
        }
        System.out.println("\nYour answer: ");
    }
        public void setAnswer() {
            Scanner sc = new Scanner(System.in);
            inputAnswer = sc.nextInt();
        }

        public void check(int correctAnswer, int inputAnswer){
        if(correctAnswer == inputAnswer) {
            isCorrectAnswer = true;
            correctCount++;
        } else {
            isCorrectAnswer = false;
    }
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
}

