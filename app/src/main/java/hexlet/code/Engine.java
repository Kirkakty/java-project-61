package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_TO_WIN = 3;
    public static int currentCount = 0;
    static boolean checkAnswer;

    public static void start(String rules) {
        Cli cli = new Cli();
        cli.greet();
        System.out.println(rules);
    }

    public static String getAnswer() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void getQuestions(String questions) {
        System.out.print("Questions: " + questions + "\nYour answer: ");
    }

    public static boolean check(String userAnswer, String correctAnswer) {
        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            checkAnswer = true;
            return true;
        } else {
            System.out.println(
                    "'"
                            + userAnswer
                            + "' is wrong answer ;(. Correct answer was '"
                            + correctAnswer
                            + "'"
                            + "\n Let's try again, "
                            + Cli.getName()
                            + "!");
            checkAnswer = false;
            return false;
        }
    }

    public static boolean isFinished() {
        return currentCount >= ROUNDS_TO_WIN;
    }

    public static void finishGame() {
        if (checkAnswer) {
            currentCount++;
        } else {
            return;
        }
        if (currentCount == ROUNDS_TO_WIN) {
            System.out.println("Congratulation, " + Cli.getName() + '!');
        }
    }
}
