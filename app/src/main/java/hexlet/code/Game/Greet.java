package hexlet.code.Game;

import hexlet.code.Cli;

public class Greet {
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        Cli cli = new Cli();
        Cli.read();
        System.out.println("Hello, " + Cli.getName() + "!");
    }

}
