package day04;

public class HangmanMain {
    public static void main(String[] args) {
        HangmanVersion2 hangman = new HangmanVersion2("automata", 10);

        hangman.runGame();
    }
}
