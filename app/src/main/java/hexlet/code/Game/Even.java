package hexlet.code.Game;

import java.util.Random;
import java.util.Scanner;

public class Even implements GameInterface {
    public int numberQuest;
    public String answer;
    public boolean isCorrectAnswer;
    public int correctCount;
    public String correctAnswer;

    @Override
    public void start() {
        printRule();
        getQuestions();
        setAnswer();
        checkAnswer(numberQuest, answer);
    }

    public void printRule() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
    }

    public void getQuestions() {
        Random rn = new Random();
        numberQuest = rn.nextInt(150);
        System.out.print("Question: " + numberQuest + "\n Answer is: ");
    }

    public void setAnswer() {
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();
    }

    public void checkAnswer(int x, String inputAnswer) {
        switch (inputAnswer) {
            case "yes":
                if (x % 2 == 0) {
                    isCorrectAnswer = true;
                    correctCount++;
                } else {
                    isCorrectAnswer = false;
                    correctAnswer = "no";
                }
                break;
            case "no":
                if (x % 2 == 0) {
                    isCorrectAnswer = false;
                    correctAnswer = "yes";
                } else {
                    isCorrectAnswer = true;
                    correctCount++;
                }
                break;
            default:
                isCorrectAnswer = false;
                if(x % 2 == 0) {
                    correctAnswer = "yes";
                } else {
                    correctAnswer = "no";
                }
                break;
        }
    }

    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public void printRules() {}

    @Override
    public boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }

    @Override
    public int getCountCorrectAnswer() {
        return correctCount;
    }
}
