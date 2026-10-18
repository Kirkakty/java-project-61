package hexlet.code.Game;
import java.util.Scanner;
import java.util.Random;

public class Calc {
public int firstNumber;
public int secondNumber;
public int answerNumber;
public char operators[] = {'+', '-', '*'};
public char operator;

    public void start(){
        printRules();
        getQuestions();
        getAnswer();
        result(firstNumber, secondNumber, operator);
        check(firstNumber, secondNumber, operator, answerNumber);
    }

    public void printRules() {
        System.out.println("What is the result of the expression?");
    }

    public void getQuestions(){
        Random rn = new Random();
        firstNumber = rn.nextInt(15);
        secondNumber = rn.nextInt(10);
        operator = operators[rn.nextInt(3)];
        System.out.println(firstNumber + " " + operator + " " + secondNumber + "\n Your answer: ");
    }

    public void getAnswer() {
        Scanner sc = new Scanner(System.in);
        answerNumber = sc.nextInt();
    }

    public int result(int x, int y, char z) {
        int result = 0;
        switch (operator) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            default:
                System.out.println("Error");
                break;
        }
        return result;
    }

    public void check(int x, int y, char z, int answer) {
        if(result(x, y, z) == answer) {
            System.out.println("True");
        }
        else {
            System.out.println("Wrong");
        }
    }

}
