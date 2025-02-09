package hexlet.code;
import hexlet.code.Game.Games;
import hexlet.code.Game.Greet;

public class Engine {
    public static void congratulation() {
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
    public static void runGame(Games thisGame) {
        Greet.greeting();
        thisGame.printRules();
        do {
            thisGame.start();
            if (thisGame.isCorrectAnswer()) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + thisGame.getAnswer() + "' is wrong answer ;(. Correct answer was '"
                        + thisGame.getCorrectAnswer() + "'");
            }
        } while (thisGame.isCorrectAnswer() & thisGame.getCountCorrectAnswer() < 3);
        if (3 == thisGame.getCountCorrectAnswer()) {
            Engine.congratulation();
        }
    }
}
