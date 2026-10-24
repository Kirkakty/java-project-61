package hexlet.code.Game;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class GCD {
    public void play() {
        System.out.print("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        int resultGCD = 0;
        Random rn = new Random();
        System.out.println("Find the greatest common divisor of given numbers.");
        int countRounds = 0;
        while (countRounds < 3) {
            int firstNumber = 1 + rn.nextInt(100);
            int secondNumber = 1 + rn.nextInt(100);
            String questions = firstNumber + " " + secondNumber;
            resultGCD = result(firstNumber,secondNumber);
            if(!Engine.greet(questions, String.valueOf(resultGCD),name)){
                return;
            }
            countRounds++;
        }
    }

    public int result (int first, int second) {
        int resultGCD = 1;
        for (int i = first; i >= 0; i--) {
            if(first % i == 0 && second % i == 0) {
                resultGCD = i;
                break;
            }
        }
        return resultGCD;
    }
}
