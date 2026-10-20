package hexlet.code;

import hexlet.code.Game.GameInterface;

public class Engine {

    public void greetingGame() {
        Cli cli = new Cli();
        cli.greet();
    }

    public static void congratulation() {
        System.out.println("Congratulation, " + Cli.getName() + '!');
    }

    public void start(GameInterface thisGame) {
        Cli cli = new Cli();
        cli.greet();
        thisGame.printRules();
        do {
            thisGame.start();
            if (thisGame.isCorrectAnswer()) {
                System.out.println("Correct!");
            } else {
                System.out.println(
                        "'"
                                + thisGame.getAnswer()
                                + "' is wrong answer ;(. Correct answer was '"
                                + thisGame.getCorrectAnswer()
                                + "'");
            }
        } while (thisGame.isCorrectAnswer() & thisGame.getCountCorrectAnswer() < 3);
        if (3 == thisGame.getCountCorrectAnswer()) {
            Engine.congratulation();
        }
    }
}
