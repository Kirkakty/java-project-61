package hexlet.code.Game;
import java.util.Scanner;
import java.util.Random;

public class Calc implements GameInterface{
public int firstNumber;
public int secondNumber;
public int answerNumber;
public char operators[] = {'+', '-', '*'};
public char operator;
public int result;
public String answer;
public boolean isCorrectAnswer;
public int correctCount;

@Override
    public void start(){
        printRules();
        getQuestions();
        setAnswer();
        resultSum(firstNumber, secondNumber, operator);
        checkAnswer(firstNumber, secondNumber, operator, answerNumber);
    }

    @Override
    public void printRules() {
        System.out.println("What is the result of the expression?");
    }

    public void getQuestions(){
        Random rn = new Random();
        firstNumber = rn.nextInt(15);
        secondNumber = rn.nextInt(10);
        operator = operators[rn.nextInt(3)];
        System.out.print(firstNumber + " " + operator + " " + secondNumber + "\n Your answer: ");
    }

    public void setAnswer() {
        Scanner sc = new Scanner(System.in);
        answerNumber = sc.nextInt();
        answer = String.valueOf(answerNumber);
    }

    public int resultSum(int x, int y, char z) {
        result = 0;
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

    public void checkAnswer(int x, int y, char z, int answer) {
        if(resultSum(x, y, z) == answer) {
           isCorrectAnswer = true;
           correctCount++;
        }
        else {
            isCorrectAnswer = false;

        }
    }

    @Override
    public String getAnswer(){
        return answer;
    }

    @Override
    public String getCorrectAnswer() {
        return String.valueOf(result);
    }

    @Override
    public boolean isCorrectAnswer(){
        return isCorrectAnswer;
    }

    @Override
    public int getCountCorrectAnswer() {
        return correctCount;
    }
}
