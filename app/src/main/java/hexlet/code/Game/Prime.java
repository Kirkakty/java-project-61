package hexlet.code.Game;

import java.util.Random;
import java.util.Scanner;

public class Prime implements GameInterface {
    public boolean isCorrectAnswer;
    public int countCorrect;
    public String answer;
    public String correctAnswer;
    public int questionsNumber;
    public int countResult;

    public void setAnswer() {
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();
    }

    public void getQuestions() {
        Random rn = new Random();
        questionsNumber = 1 + rn.nextInt(9);
        System.out.print("Questions: " + questionsNumber + " \nYour answer: ");
    }

    public void solution(int x) {
        countResult = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                countResult++;
            }
        }
    }

    public void check(int x, String answer) {
        switch (answer) {
            case "yes":
            if (x <= 2) {
                    isCorrectAnswer = true;
                    countCorrect++;
                }  else {
                    isCorrectAnswer = false;
                    correctAnswer = "no";
                }
                break;
            case "no":
                if (x <= 2) {
                    isCorrectAnswer = false;
                    correctAnswer = "yes";
                } else {
                    isCorrectAnswer = true;
                    countCorrect++;
                }
                break;
            default:
                isCorrectAnswer = false;
                if (x <= 2) {
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
    public void printRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    @Override
    public void start() {
        getQuestions();
        setAnswer();
        solution(questionsNumber);
        check(countResult, answer);
    }

    @Override
    public boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }

    @Override
    public int getCountCorrectAnswer() {
        return countCorrect;
    }
}
