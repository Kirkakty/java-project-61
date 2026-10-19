package hexlet.code.Game;

public interface GameInterface {
    String getAnswer();
    String getCorrectAnswer();
    void printRules();
    void start();
    boolean isCorrectAnswer();
    int getCountCorrectAnswer();
}
