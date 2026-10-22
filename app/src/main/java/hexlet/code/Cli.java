package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String name;

    public void greet() {
        read();
        hello();
    }

    public static void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = sc.nextLine();
    }

    public static String getName() {
        return name;
    }

    public void hello() {

        System.out.println("Hello, " + Cli.getName() + "!");
    }
}
