package hexlet.code.Game;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Calc {
    public void play() {
        System.out.print("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        int firstNumber;
        int secondNumber;
        int answerNumber = 0;
        char[] operators = {'+', '-', '*'};
        char operator;
        String questions;
        System.out.println("What is the result of the expression?");
        Random rn = new Random();
        int countRound = 0;
        while (countRound < 3) {
            firstNumber = rn.nextInt(100);
            secondNumber = rn.nextInt(100);
            operator = operators[rn.nextInt(3)];
            questions = firstNumber + " " + operator + " " + secondNumber;
            answerNumber = resultOfMath(firstNumber, secondNumber, operator);
            if (!Engine.greet(questions, String.valueOf(answerNumber), name)) {
                return;
            }
            countRound++;
        }
    }

    public int resultOfMath(int first, int second, char oper) {
        int answer = 0;
        switch (oper) {
            case '+':
                answer = first + second;
                break;
            case '-':
                answer = first - second;
                break;
            case '*':
                answer = first * second;
                break;
            default:
                System.out.println("Error");
        }
        return answer;
    }
}
