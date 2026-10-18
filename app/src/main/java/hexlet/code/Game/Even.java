package hexlet.code.Game;
import java.util.Scanner;
import java.util.Random;

public class Even {
    public int numberQuest;
    public String answer;

    public void start(){
        printRule();
        getNumber();
        setAnswer();
        checkAnswer(numberQuest,answer);
    }
    public void printRule() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
    }

    public void getNumber (){
        Random rn = new Random();
        numberQuest = rn.nextInt(150);
        System.out.println("Question: " + numberQuest + "\n Answer is: ");
    }

    public void setAnswer() {
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();
    }

    public void checkAnswer(int x, String inputAnswer) {
        switch (inputAnswer) {
            case "yes":
                if(x % 2 == 0) {
                    System.out.println("Correct");
                }
                else {
                    System.out.println("yes' is wrong answer ;(. Correct answer was 'no");
                }
                break;
            case "no":
                if(x % 2 == 0) {
                    System.out.println("no' is wrong answer ;(. Correct answer was 'yes");
                }
                else {
                    System.out.println("Correct");
                }
                break;
            default:
                System.out.println("wrong");
                break;
        }
    }



}
