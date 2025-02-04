package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String name;


    public static void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I Have your name?");
        name = sc.nextLine();
    }
    public static String getName() {
        return name;
    }
}
