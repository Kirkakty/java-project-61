package hexlet.code.Game;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Prime {
    public void play() {
        System.out.print("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Random rn = new Random();
        int countRounds = 0;
        while (countRounds < 3) {
            int questionNumber = 1 + rn.nextInt(100);
            String correctAnswer = "";
            if (isPrime(questionNumber)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            if (!Engine.greet(String.valueOf(questionNumber), correctAnswer, name)) {
                return;
            }
            countRounds++;
        }
    }

    public boolean isPrime(int number) {
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }
}
