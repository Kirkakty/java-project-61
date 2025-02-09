package hexlet.code.Game;

import java.util.Random;
import java.util.Scanner;

public final class Even implements Games<String> {
    public int correctCount;
    public boolean isCorrectAnswer;
    public String correctAnswer;
    public String answer;
    public int number;


    @Override
    public void start() {
        getQuestions();
        setAnswer();
        check(number, answer);
    }

    public void printRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
    }
     public void getQuestions() {
         Random rn = new Random();
         number = rn.nextInt(120);
         System.out.println("Question : " + number);
         System.out.print("Your answer: ");
     }

     public void setAnswer(){
         Scanner sc = new Scanner(System.in);
         answer = sc.nextLine();
     }
    public void check(int number, String answer) {
        switch (answer) {
            case "yes":
                if (number % 2 == 0) {
                    isCorrectAnswer = true;
                    System.out.println(number);
                    correctCount++;
                } else {
                    isCorrectAnswer = false;
                    correctAnswer = "yes";
                }
                break;
            case "no":
                if (number % 2 != 0) {
                    isCorrectAnswer =true;
                    correctCount++;
                } else {
                    isCorrectAnswer = false;
                    correctAnswer = "yes";
                }
                break;
            default:
                isCorrectAnswer = false;
                if (number % 2 == 0) {
                    correctAnswer = "yes";
                } else {
                    correctAnswer = "no";
                }
                break;
        }
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }
    public String getAnswer() {
        return answer;
    }
    public int getCountCorrectAnswer() {
        return correctCount;
    }
}
