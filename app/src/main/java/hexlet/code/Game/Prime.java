package hexlet.code.Game;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {

    public String printRule() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public void play() {
        Engine.start(printRule());
        Random rn = new Random();
        while (!Engine.isFinished()) {
            int countResult = 0;
            int questionNumber = 1 + rn.nextInt(100);
            Engine.getQuestions(String.valueOf(questionNumber));
            String answer = Engine.getAnswer();
            for (int i = 1; i <= questionNumber; i++) {
                if (questionNumber % i == 0) {
                    countResult++;
                }
            }
            switch (answer) {
                case "yes":
                    if (countResult <= 2) {
                        Engine.check(answer, "yes");
                    } else {
                        Engine.check(answer, "no");
                        return;
                    }
                    break;
                case "no":
                    if (countResult <= 2) {
                        Engine.check(answer, "yes");
                        return;
                    } else {
                        Engine.check(answer, "no");
                    }
                    break;
                default:
                    if (countResult <= 2) {
                        Engine.check(answer, "yes");
                    } else {
                        Engine.check(answer, "no");
                    }
                    return;
            }
            Engine.finishGame();
        }
    }
}
