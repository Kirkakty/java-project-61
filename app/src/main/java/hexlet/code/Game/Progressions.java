package hexlet.code.Game;

import java.util.Random;
import java.util.Scanner;

public class Progressions implements GameInterface{

    public int lengthOfNumbers;
    public int progressionNumber;
    public int firstNumber;
    public int hiddenNumber;
    public int answer;
    public boolean isCorrectAnswer;
    public int correctCount;
    public int result;

    public void getQuestions() {
        Random rn = new Random();
        lengthOfNumbers = 5 + rn.nextInt(5);
        progressionNumber =1 + rn.nextInt(10);
        firstNumber = rn.nextInt(30);
        hiddenNumber = rn.nextInt(lengthOfNumbers);
        System.out.println("Questions: ");
        for (int i = 0; i <= lengthOfNumbers; i++) {
            firstNumber += progressionNumber;
            if(i == hiddenNumber) {
                System.out.print("..");
                result = firstNumber;
            } else {
                System.out.print(firstNumber + " ");
            }
        }
        System.out.print("\nYour answer: ");
    }

    public void setAnswer(){
        Scanner sc = new Scanner(System.in);
        answer = sc.nextInt();
    }

    public void checkAnswer(int x, int y) {
        if (x == y) {
            isCorrectAnswer = true;
            correctCount++;
        } else {
            isCorrectAnswer = false;
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
        System.out.println("What number is missing in the progression?");
    }

    @Override
    public void start() {
        getQuestions();
        setAnswer();
        checkAnswer(result, answer);
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
