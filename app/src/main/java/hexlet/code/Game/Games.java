package hexlet.code.Game;

public interface Games<T> {
    void start();
    void printRules();
    T getAnswer();
    T getCorrectAnswer();
    int getCountCorrectAnswer();
    boolean isCorrectAnswer();

}
