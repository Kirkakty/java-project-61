package hexlet.code.Game;

import hexlet.code.Engine;
import java.util.Random;

public class Even {

    public String printRule() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public void play() {
        int numberQuest = 0;
        Engine.start(printRule());
        Random rn = new Random();
        while (!Engine.isFinished()) {
            numberQuest = rn.nextInt(100);
            Engine.getQuestions(String.valueOf(numberQuest));
            String answer = Engine.getAnswer();
            switch (answer) {
                case "yes":
                    if (numberQuest % 2 == 0) {
                        Engine.check(answer, "yes");
                    } else {
                        Engine.check(answer, "no");
                        return;
                    }
                    break;
                case "no":
                    if (numberQuest % 2 == 0) {
                        Engine.check(answer, "yes");
                        return;
                    } else {
                        Engine.check(answer, "no");
                    }
                    break;
                default:
                    if (numberQuest % 2 == 0) {
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
