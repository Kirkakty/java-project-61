package hexlet.code.Game;

import hexlet.code.Cli;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Calc implements Games<Integer> {
    public static int correctCount = 0;
    public static int correctAnswer = 0;
    public static char[] operators = {'+', '-', '*'};
    public boolean isCorrectAnswer;
    public int firstNumber;
    public int secondNumber;
    public char operator;
    public int inputAnswer;

    @Override
    public void start() {
        getQuestion();
        setAnswer();
        check(firstNumber, secondNumber, operator, inputAnswer);

    }

    @Override
    public void printRules() {
        System.out.println("What is the result of the expression?");
    }

    public void getQuestion() {
        Random rn = new Random();
        firstNumber = rn.nextInt(10);
        secondNumber = rn.nextInt(10);
        operator = operators[rn.nextInt(3)];
        System.out.println(firstNumber + " " + operator + " " + secondNumber);
        System.out.print("Your answer: ");
    }

    public void setAnswer() {
        Scanner sc = new Scanner(System.in);
        inputAnswer = sc.nextInt();
    }

    public int solution(int firstNumber, int secondNumber, char operator) {
        int result = 0;
        switch (operator) {
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            default:
                System.out.println("Error operator");
        }
        return result;
    }

    public void check(int firstNumber, int secondNumber, char operator, int inputAnswer) {
        if (solution(firstNumber, secondNumber, operator) == inputAnswer) {
            isCorrectAnswer = true;
            correctCount++;
        } else {
            isCorrectAnswer = false;
            correctAnswer = solution(firstNumber, secondNumber, operator);
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

