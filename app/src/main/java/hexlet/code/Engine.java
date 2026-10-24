package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_TO_WIN = 3;
    public static int currentCount = 0;
    public static final Scanner SC = new Scanner(System.in);


    public static boolean greet(String questions, String correctAnswer, String name) {
        System.out.print("Question: " + questions + "\nYour answer: ");
        String answer = SC.nextLine();
        boolean isFinish = false;
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            currentCount++;
            isFinish = true;
        } else {
            System.out.println(
                    "'"
                            + answer
                            + "' is wrong answer ;(. Correct answer was '"
                            + correctAnswer
                            + "'"
                            + "\n Let's try again, "
                            + name
                            + "!");
            isFinish = false;
        }
        if (currentCount >= ROUNDS_TO_WIN) {
            System.out.println("Congratulations, " + name + '!');
        }
        return isFinish;
    }
}